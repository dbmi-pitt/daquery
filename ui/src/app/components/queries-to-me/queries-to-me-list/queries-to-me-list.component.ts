import { Component, OnInit } from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { UserService } from '../../../services/user.service';
import { QueryToMe } from '../../../models/query-to-me.model';
import { RoleGuard } from '../../../_guards/role.guard';

import { Observable } from 'rxjs/Observable';

declare var $:any;

@Component({
  selector: 'app-queries-to-me-list',
  templateUrl: './queries-to-me-list.component.html',
  styleUrls: ['./queries-to-me-list.component.css']
})
export class QueriesToMeListComponent implements OnInit {

  requests: any[];
  selectedRequest: any;
  showApproveDenyBtn = false;
  showStackTrace = false;

  sqlAnalyzerResponse: any;

  constructor(private requestService: RequestService,
              private userService: UserService,
              private roleGuard: RoleGuard) {

  }

  async ngOnInit() {
    this.getRequestsToMe();
    await this.updateCurrentUser();
    if(this.canActive(["steward"])) {
      this.showApproveDenyBtn = true;
    }
  }

  getRequestsToMe() {
    this.requestService.getRequestsToMe()
                       .subscribe(requests => {
                         this.requests = requests;
                       });
  }

  onRequestSelect(request: any){
    this.selectedRequest = request;
    this.sqlCheck();
  }

  sqlCheck(){
    this.requestService.checkSQL({networkUuid: this.selectedRequest.network.networkId, sqlCode: this.selectedRequest.code})
                       .subscribe(res => {
                          this.sqlAnalyzerResponse = res;
                       }, err => {
                          console.log(err);
                       });
  }

  getRequestStatusLabelClass(request: any){
    switch(request.responses[0].status.toUpperCase()) {
      case "COMPLETED":
        return "bg-green";
      case "ERROR":
        return "bg-red";
      case "PENDING":
        return "bg-yellow";
      case "DENIED":
        return "bg-gray";
      default:
        return "bg-gray";
    }
  }

  approveRequest(){
    if(confirm("Do you want to approve this request?")){
    this.requestService.approveDataRequest(this.selectedRequest.requestId)
                       .subscribe(res => {
                          this.selectedRequest.responses[0] = res;
                       });
    }
  }

  denyRequest(){
    if(confirm("Do you want to deny this request?")){
      this.requestService.denyDataRequest(this.selectedRequest.requestId)
                        .subscribe(res => {
                          this.selectedRequest.responses[0] = res;
                        });
    }
  }

  canActive(allowedRoles: string[]): boolean {
    return this.roleGuard.allowed(allowedRoles);
  }

  updateCurrentUser(){
    return new Promise((resolve, reject) => {
      this.userService.getUser(this.userService.getCurrentUser().id)
                      .subscribe(res => {
                        this.userService.setCurrentUser(res);
                        resolve();
                      })
    });
  }

  showErrorInfo(){
    $('#myErrorModal').modal('show');
  }

  isValidSelectedRequest(selectedRequest: any){
    return selectedRequest.responses.length > 0
  }
}
