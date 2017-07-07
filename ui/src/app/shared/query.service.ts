import { Injectable } from '@angular/core';

@Injectable()
export class QueryService {

  constructor() { }

  queriesToMe = [];
  queriesFromMe = [];
  getQueriesToMe() {
    return this.queriesToMe = QUERIES_TO_ME.slice(0);
  }

  getQueryToMe(id: number){
    return QUERIES_TO_ME.slice(0).find(query => query.id === id);
  }

  getQueriesFromMe() {
    return this.queriesFromMe = QUERIES_FROM_ME.slice(0);
  }
}

const QUERIES_TO_ME = [
  {"id" : 1, "name": "Query 1", "type": "Data", "site": "PITT", "datetime": "2017-07-01T18:25:42.123Z", "status": "pending"},
  {"id" : 2, "name": "Query 2", "type": "Data", "site": "JSH", "datetime": "2017-07-01T18:25:42.123Z", "status": "done"},
  {"id" : 3, "name": "Query 3", "type": "Aggregate", "site": "Utah", "datetime": "2017-07-01T18:25:42.123Z", "status": "processing"},
  {"id" : 4, "name": "Query 4", "type": "Data", "site": "PITT", "datetime": "2017-07-01T18:25:42.123Z", "status": "pending"},
  {"id" : 5, "name": "Query 5", "type": "Aggregate", "site": "Temple", "datetime": "2017-07-01T18:25:42.123Z", "status": "done"},
  {"id" : 6, "name": "Query 6", "type": "Data", "site": "PSU", "datetime": "2017-07-01T18:25:42.123Z", "status": "done"},
  {"id" : 7, "name": "Query 7", "type": "Aggregate", "site": "Geisinger", "datetime": "2017-07-01T18:25:42.123Z", "status": "pending"}
]

const QUERIES_FROM_ME = [
  {"id" : 1, "name": "Query 1", "type": "Data", "datetime": "2017-07-01T18:25:42.123Z",
   "responses": [{
     "id": 1,
     "site": "PITT",
     "status": "pending",
     "result": NaN
   },
   {
     "id": 2,
     "site": "JHU",
     "status": "pending",
     "result": NaN
   },
   {
     "id": 3,
     "site": "Utah",
     "status": "done",
     "result": "Download Data"
   },
   {
     "id": 4,
     "site": "PSU",
     "status": "processing",
     "result": NaN
   },
   ]
  },
  {"id" : 2, "name": "Query 2", "type": "Aggregate", "datetime": "2017-07-01T18:25:42.123Z",
   "responses": [{
     "id": 1,
     "site": "PITT",
     "status": "pending",
     "result": NaN
   },
   {
     "id": 2,
     "site": "JHU",
     "status": "done",
     "result": 44
   },
   {
     "id": 3,
     "site": "Utah",
     "status": "done",
     "result": 122
   },
   {
     "id": 4,
     "site": "PSU",
     "status": "processing",
     "result": NaN
   },
   ]
  },
]
