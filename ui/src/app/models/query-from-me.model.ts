export class QueryFromMe {
  id: number;
  name: string;
  type: string;
  datetime: string;
  responses: Response[];
}

class Response{
  id: number;
  site: string;
  status: string;
  result: string;
}

// const QUERIES_FROM_ME = [
//   {"id" : 1, "name": "Query 1", "type": "Data", "datetime": "2017-07-01T18:25:42.123Z",
//    "responses": [{
//      "id": 1,
//      "site": "PITT",
//      "status": "pending",
//      "result": NaN
//    },
//    {
//      "id": 2,
//      "site": "JHU",
//      "status": "pending",
//      "result": NaN
//    },
//    {
//      "id": 3,
//      "site": "Utah",
//      "status": "done",
//      "result": "http://url-of-data-location"
//    },
//    {
//      "id": 4,
//      "site": "PSU",
//      "status": "processing",
//      "result": NaN
//    },
//    ]
//   },