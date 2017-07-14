import { Http, BaseRequestOptions, Response, ResponseOptions, RequestMethod } from '@angular/http';
import { MockBackend, MockConnection } from '@angular/http/testing';

export let fakeBackendProvider = {
    // use fake backend in place of Http service for backend-less development
    provide: Http,
    useFactory: (backend: MockBackend, options: BaseRequestOptions) => {
        // configure fake backend
        backend.connections.subscribe((connection: MockConnection) => {
            let testUser = { username: 'test', password: 'test', firstName: 'Test', lastName: 'User' };

            // wrap in timeout to simulate server api call
            setTimeout(() => {

                // fake authenticate api end point
                if (connection.request.url.endsWith('/daquery/ws/users/login') && connection.request.method === RequestMethod.Post) {
                    // get parameters from post request
                    let params = JSON.parse(connection.request.getBody());

                    // check user credentials and return fake jwt token if valid
                    if (params.username === testUser.username && params.password === testUser.password) {
                        connection.mockRespond(new Response(
                            new ResponseOptions({ status: 200, body: { token: 'fake-jwt-token' } })
                        ));
                    } else {
                        connection.mockRespond(new Response(
                            new ResponseOptions({ status: 200 })
                        ));
                    }
                }

                // fake users api end point
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
    },
    deps: [MockBackend, BaseRequestOptions]
};

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