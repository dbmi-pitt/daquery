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