#export JAVA_HOME=/usr/java/jdk1.8.0_171-amd64
export CLASSPATH=$CLASSPATH:target/test-classes
mvn -DskipTests clean install
mvn exec:java -Dexec.mainClass="org.testng.TestNG" -Dexec.args="testng.xml" -Dbrowser="firefox"


