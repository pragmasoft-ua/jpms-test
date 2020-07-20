module com.example.test {
    requires java.logging;
    requires org.slf4j;
    requires aws.java.sdk.core;
	requires aws.java.sdk.lambda;
}


//    /home/zdv/.sdkman/candidates/java/openjdk-11/bin/java 
//    -Dfile.encoding=UTF-8 -p 
//    /home/zdv/Projects/test/jpms-test/target/classes:
//    /home/zdv/.m2/repository/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar:
//    /home/zdv/.m2/repository/com/amazonaws/aws-java-sdk-lambda/1.11.822/aws-java-sdk-lambda-1.11.822.jar:
//    /home/zdv/.m2/repository/com/amazonaws/aws-java-sdk-core/1.11.822/aws-java-sdk-core-1.11.822.jar 
//    -classpath 
//    /home/zdv/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:
//    /home/zdv/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:
//    /home/zdv/.m2/repository/commons-logging/commons-logging/1.1.3/commons-logging-1.1.3.jar:
//    /home/zdv/.m2/repository/org/apache/httpcomponents/httpclient/4.5.9/httpclient-4.5.9.jar:
//    /home/zdv/.m2/repository/org/apache/httpcomponents/httpcore/4.4.11/httpcore-4.4.11.jar:
//    /home/zdv/.m2/repository/commons-codec/commons-codec/1.11/commons-codec-1.11.jar:
//    /home/zdv/.m2/repository/software/amazon/ion/ion-java/1.0.2/ion-java-1.0.2.jar:
//    /home/zdv/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.6.7.3/jackson-databind-2.6.7.3.jar:
//    /home/zdv/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.6.0/jackson-annotations-2.6.0.jar:
//    /home/zdv/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.6.7/jackson-core-2.6.7.jar:
//    /home/zdv/.m2/repository/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.6.7/jackson-dataformat-cbor-2.6.7.jar:
//    /home/zdv/.m2/repository/joda-time/joda-time/2.8.1/joda-time-2.8.1.jar:
//    /home/zdv/.m2/repository/com/amazonaws/jmespath-java/1.11.822/jmespath-java-1.11.822.jar 
//    -m com.example.test/com.example.test.HelloWorld
