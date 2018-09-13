cd common
mvn clean install -DskipTests=true
cd ../central
mvn clean install -DskipTests=true
cd ../ui
npm install
npm run prod
cd ../ws
./build-wars
