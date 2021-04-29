to add jar to local repo
        mvn deploy:deploy-file -DgroupId=org.fly.fhir -DartifactId=validation -Durl=file:./local-mvn-repo/ -DrepositoryId=local-mvn-repo -DupdateReleaseInfo=true -Dfile=validator-cli.jar
To compile:
        mvn compile
To Run: 
        mvnw spring-boot:run
