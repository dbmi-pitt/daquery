@Echo off
del /q build.version
git rev-parse --abbrev-ref HEAD > branch.temp
git shortlog | find /c /v "~`!@#$%^&*()_+" > commits.temp
set /p BR=<branch.temp
set /p CM=<commits.temp
echo branch=%BR% > build.version
echo build.no=%CM% >> build.version
del /q branch.temp
del /q commits.temp