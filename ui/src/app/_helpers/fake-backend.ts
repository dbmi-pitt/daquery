import { Http, BaseRequestOptions, Response, ResponseOptions, RequestMethod } from '@angular/http';
import { MockBackend, MockConnection } from '@angular/http/testing';

export function fakeBackendFactory(backend: MockBackend, options: BaseRequestOptions) {
  // configure fake backend
  backend.connections.subscribe((connection: MockConnection) => {
    let testUser = { username: 'test', password: 'test', firstName: 'Test', lastName: 'User' };

    // wrap in timeout to simulate server api call
    setTimeout(() => {
      
      // authenticate user
      if (connection.request.url.includes('/daquery/ws/users/login') && connection.request.method === RequestMethod.Get) {
        // get parameters from post request
        // let params = JSON.parse(connection.request.getBody());
        // check user credentials and return fake jwt token if valid
        // if (params.username === testUser.username && params.password === testUser.password) {
        //   connection.mockRespond(new Response(
        //     new ResponseOptions({ status: 200, body: { token: 'fake-jwt-token' } })
        //   ));
        // } else {
        //   connection.mockRespond(new Response(
        //     new ResponseOptions({ status: 200 })
        //   ));
        // }
        connection.mockRespond(new Response(
          new ResponseOptions({ status: 200, body: { user_id: 1, roles: ["steward"], token: 'fake-jwt-token' } })
        ));
      }

      // get queries from me
      if (connection.request.url.endsWith('/daquery/ws/queries-from-me') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: QUERIES_FROM_ME })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get queries to me
      if (connection.request.url.endsWith('/daquery/ws/queries-to-me') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: QUERIES_TO_ME })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get query to me by id
      if (/\/daquery\/ws\/query-to-me\/\d/.test(connection.request.url) && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          let id = +connection.request.url.substring(connection.request.url.lastIndexOf('/') + 1);
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: QUERIES_TO_ME.filter(query => query.id === id)[0] })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get networks
      if (connection.request.url.endsWith('/daquery/ws/networks') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: NETWORKS })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get network by id
      if (/\/daquery\/ws\/network\/\d/.test(connection.request.url) && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          let id = +connection.request.url.substring(connection.request.url.lastIndexOf('/') + 1);
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: NETWORKS.filter(network => network.id === id)[0] })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

       // get site by id
      if (/\/daquery\/ws\/site\/\d/.test(connection.request.url) && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          let id = +connection.request.url.substring(connection.request.url.lastIndexOf('/') + 1);
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: SITES.filter(site => site.id === id)[0] })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get sites
      if (connection.request.url.endsWith('/daquery/ws/sites') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: SITES })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get sites
      if (connection.request.url.includes('/daquery/ws/sites?') &&
          connection.request.url.includes('network=') && 
          !connection.request.url.includes('type=') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: SITES })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get in/out/waiting Sites
      if (connection.request.url.includes('/daquery/ws/sites?') &&
          connection.request.url.includes('network=') && 
          connection.request.url.includes('type=') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          if(connection.request.url.includes('type=in')){
            connection.mockRespond(new Response(
              new ResponseOptions({ status: 200, body: IN_SITES })
            ));
          } else if (connection.request.url.includes('type=out')){
            connection.mockRespond(new Response(
              new ResponseOptions({ status: 200, body: OUT_SITES })
            ));
          } else if (connection.request.url.includes('type=waiting')){
            connection.mockRespond(new Response(
              new ResponseOptions({ status: 200, body: WAITING_SITES })
            ));
          }
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get users
      if (connection.request.url.endsWith('/daquery/ws/users') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: USERS })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get roles
      if (connection.request.url.endsWith('/daquery/ws/local-roles') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: LOCAL_ROLES })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get remote users by site
      if (connection.request.url.includes('/daquery/ws/remote-site-users?') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: REMOTE_SITE_USERS.filter(rsu => rsu.site_id === 1)[0].users })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // add user
      if (connection.request.url.endsWith('/daquery/ws/users') && connection.request.method === RequestMethod.Post) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          let entity = JSON.parse(connection.request.getBody());
          USERS.push({"id": 4, "email": entity.email, "signupAt": "2017-07-03T10:12:44.321Z",
                      "roles": ["viewer"]});
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: USERS[USERS.length - 1] })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // update user roles
      if (/\/daquery\/ws\/users\/\d/.test(connection.request.url) && connection.request.method === RequestMethod.Patch) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          console.log(connection.request.getBody());
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: {} })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get notifications
      if (connection.request.url.includes('/daquery/ws/notifications') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: NOTIFICATIONS})
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // get roles by user_id
      if (connection.request.url.includes('/daquery/ws/roles?') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: ROLES.find(r => r.user_id === 1).roles })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }

      // fake users api end point
      if (connection.request.url.endsWith('/api/users') && connection.request.method === RequestMethod.Get) {
        // check for fake auth token in header and return test users if valid, this security is implemented server side
        // in a real application
        if (connection.request.headers.get('Authorization') === 'Bearer fake-jwt-token') {
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 200, body: [testUser] })
          ));
        } else {
          // return 401 not authorised if token is null or invalid
          connection.mockRespond(new Response(
            new ResponseOptions({ status: 401 })
          ));
        }
      }


    }, 500);

  });

  return new Http(backend, options);
}

export let fakeBackendProvider = {
  // use fake backend in place of Http service for backend-less development
  provide: Http,
  useFactory: fakeBackendFactory,
  deps: [MockBackend, BaseRequestOptions]
};

const QUERIES_TO_ME = [
  {"id" : 1, "studyName": "Diabetes", "name": "Query 1", "type": "Data", "site": "PITT", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "pending", "oracleQuery": "SELECT * FROM Table1; DROP ALL Tables;", "sqlQuery": "SELECT * FROM Table1; DROP ALL Tables;"},
  {"id" : 2, "studyName": "Diabetes", "name": "Query 2", "type": "Data", "site": "JSH", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "done", "oracleQuery": "SELECT * FROM Table2; DROP ALL Tables;", "sqlQuery": "SELECT * FROM Table2; DROP ALL Tables;"},
  {"id" : 3, "studyName": "Diabetes", "name": "Query 3", "type": "Aggregate", "site": "Utah", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "processing", "oracleQuery": "SELECT * FROM Table3; DROP ALL Tables;", "sqlQuery": "SELECT * FROM Table3; DROP ALL Tables;"},
  {"id" : 4, "studyName": "Diabetes", "name": "Query 4", "type": "Data", "site": "PITT", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "pending", "oracleQuery": "SELECT * FROM Table4; DROP ALL Tables;", "sqlQuery": "SELECT * FROM Table4; DROP ALL Tables;"},
  {"id" : 5, "studyName": "Diabetes", "name": "Query 5", "type": "Aggregate", "site": "Temple", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "done", "oracleQuery": "SELECT * FROM Table5; DROP ALL Tables;", "sqlQuery": "SELECT * FROM Table5; DROP ALL Tables;"},
  {"id" : 6, "studyName": "Diabetes", "name": "Query 6", "type": "Data", "site": "PSU", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "done", "oracleQuery": "SELECT * FROM Table6; DROP ALL Tables;", "sqlQuery": "SELECT * FROM Table6; DROP ALL Tables;"},
  {"id" : 7, "studyName": "Diabetes", "name": "Query 7", "type": "Aggregate", "site": "Geisinger", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "pending", "oracleQuery": "SELECT * FROM Table7; DROP ALL Tables;", "sqlQuery": "SELECT * FROM Table7; DROP ALL Tables;"}
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

const SITES = [
  {"id" : 1, "name": "PITT", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 2, "name": "PSU", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 3, "name": "JHU", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 4, "name": "Utah", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
];

const IN_SITES = [
  {"id" : 1, "name": "PITT", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 2, "name": "PSU", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 3, "name": "JHU", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 4, "name": "Utah", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
];

const OUT_SITES = [
  {"id" : 1, "name": "PITT", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 2, "name": "PSU", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 3, "name": "JHU", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 4, "name": "Utah", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
];

const WAITING_SITES = [
  {"id" : 1, "name": "Geisinger", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
];

const NETWORKS = [
  {"id" : 1, "name": "PaTH"},
  {"id" : 2, "name": "ACT"},
  {"id" : 3, "name": "Diabetes"},
  {"id" : 4, "name": "ICU"},
];

const USERS = [
  {"id": 1, "email": "desheng@dbmi.com", "signupAt": "2017-05-03T10:12:44.321Z", 
   "roles": ["admin"]},
  {"id": 2, "email": "bill@dbmi.com", "signupAt": "2017-05-03T10:12:44.321Z", 
   "roles": ["steward"]},
  {"id": 3, "email": "chuck@dbmi.com", "signupAt": "2017-05-03T10:12:44.321Z", 
   "roles": ["viewer"]},
]

const ROLES = [
  {"user_id": 1,
   "roles": ["admin"]
  },
  {"user_id": 2,
   "roles": ["steward"]
  },
  {"user_id": 3,
   "roles": ["viewer"]
  }
]

const REMOTE_SITE_USERS = [
  {"site_id": 1, "site": "PITT", "users": [
    {"id": 1, "email": "desheng@dbmi.edu", "rights": {
      "aggregate": true,
      "data": true,
    }},
    {"id": 2, "email": "nickie@dbmi.edu", "rights": {
      "aggregate": true,
      "data": false,
    }},
    {"id": 3, "email": "chuck@dbmi.edu", "rights": {
      "aggregate": false,
      "data": false,
    }},
  ]},
  {"site_id": 2, "site": "PSU", "users": [
    {"id": 4, "email": "psu-desheng@dbmi.edu", "rights": {
      "aggregate": true,
      "data": true,
    }},
    {"id": 5, "email": "psu-nickie@dbmi.edu", "rights": {
      "aggregate": true,
      "data": false,
    }},
    {"id": 6, "email": "psu-chuck@dbmi.edu", "rights": {
      "aggregate": false,
      "data": false,
    }},
  ]},
  {"site_id": 3, "site": "JHU", "users": [
    {"id": 7, "email": "jhu-desheng@dbmi.edu", "rights": {
      "aggregate": true,
      "data": true,
    }},
    {"id": 8, "email": "jhu-nickie@dbmi.edu", "rights": {
      "aggregate": true,
      "data": false,
    }},
    {"id": 9, "email": "jhu-chuck@dbmi.edu", "rights": {
      "aggregate": false,
      "data": false,
    }},
  ]},
  {"site_id": 4, "site": "Utah", "users": [
    {"id": 10, "email": "utah-desheng@dbmi.edu", "rights": {
      "aggregate": true,
      "data": true,
    }},
    {"id": 11, "email": "utah-nickie@dbmi.edu", "rights": {
      "aggregate": true,
      "data": false,
    }},
    {"id": 12, "email": "utah-chuck@dbmi.edu", "rights": {
      "aggregate": false,
      "data": false,
    }},
  ]}
]

const LOCAL_ROLES = [
  "admin", "steward", "viewer"
]

const NOTIFICATIONS = [
  {"id": 1,
   "message": "Utah is waiting for approval."},
  {"id": 2,
   "message": "PSU is waiting for approval."}
]