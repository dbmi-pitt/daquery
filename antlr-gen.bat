cd src\main\antlr
del /F /Q ..\..\..\src\main\java\edu\pitt\dbmi\daquery\sql\parser\generated\*
java -jar ..\..\..\antlr-lib\antlr-4.7-complete.jar -o ..\..\..\src\main\java\edu\pitt\dbmi\daquery\sql\parser\generated -package edu.pitt.dbmi.daquery.sql.parser.generated SQLite.g4 
del /F /Q ..\..\..\src\main\java\edu\pitt\dbmi\daquery\sql\parser\generated\*.tokens
cd ..\..\..\