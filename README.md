# An example Java 11 JPMS project using Maven and JUnit 5.x

1. `git clone git@github.com:pragmasoft-ua/jpms-test.git`
2. `./mvnw clean package`
3. `./mvnw exec:java -Dexec.mainClass=com.example.test/com.example.test.HelloWorld`

You may also want to copy dependencies 

`./mvnw dependency:copy-dependencies` 

and then execute it as jar with 

`java -jar target/jpms-test-1.0.0-SNAPSHOT.jar`
