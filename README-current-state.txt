This version of the daquery code contains web service calls in the UserEndpoint.java file.

The calls are mock-ups right now.  There are some hibernate files and pom.xml entries, but they
do not function at this time.

The mocked up user authentication call is accessible through:
http://localhost:8080/daquery/users/login?login=[username]&password=[password]

right now, the username/password combination is demo/demouser.  This will return 
a valid JWT (JSON Web Token).