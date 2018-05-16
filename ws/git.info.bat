@Echo off
del /q src\main\resources\build.version
git rev-parse --abbrev-ref HEAD > branch.temp
git shortlog | find /c /v "~`!@#$%^&*()_+" > commits.temp
set /p BR=<branch.temp
set /p CM=<commits.temp
echo branch=%BR% > src\main\resources\build.version
echo build.no=%CM% >> src\main\resources\build.version
del /q branch.temp
del /q commits.temp