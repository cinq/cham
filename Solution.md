# Solution

Description on how we plan to create the application.

## Technical Choices

* Spring Boot
* Logs are read from the file systems
* Application results can be on the file system or HDFS
* Analysis and statuses are written in:
    * Hadoop
    * File System
    * Database

## Configuration Elements

What should be configurable.

* Hadoop configuration files
    * Allows to read what nodes are part of the cluster
    * Allows to read from HDFS
* IP we attach to (default: )
* Port to serve this application from (default: 8080?)
* Patterns
    * Lots to specify here
