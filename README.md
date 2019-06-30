# grpc

example input:  http://localhost:8080/sayhello?name=asdf<br>

To switch to Gradle change dependency in server and client to:

      <dependency>
            <groupId>com.example</groupId>
            <artifactId>grpcProtoGradle</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        
To switch to Maven change dependency in server and client to:

        <dependency>
            <groupId>com.example</groupId>
            <artifactId>grpc_proto</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
    
useful links:
* https://github.com/LogNet/grpc-spring-boot-starter
* https://github.com/sfcodes/grpc-client-spring-boot
* https://github.com/saturnism/grpc-java-by-example/tree/master/springboot-example
