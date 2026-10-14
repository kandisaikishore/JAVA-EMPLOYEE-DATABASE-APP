# Java Employee Database App

[![Java](https://img.shields.io/badge/Java-JDBC-orange?logo=openjdk)](https://www.java.com/) [![MySQL](https://img.shields.io/badge/Database-MySQL-4479A1?logo=mysql)](https://www.mysql.com/) [![GitHub](https://img.shields.io/badge/Source-GitHub-181717?logo=github)](https://github.com/saikishore2410/JAVA-EMPLOYEE-DATABASE-APP)

A Java JDBC example connecting to MySQL to demonstrate inserting employee records and reading employee data. Useful for practising database connectivity, prepared statements, SQL execution, and exception handling.

## Current capabilities
- Connects to a local employee_db MySQL database
- Inserts an employee using a parameterized PreparedStatement
- Reads employee records and prints selected fields
- Handles SQL exceptions

## Technology
Java, JDBC, MySQL, MySQL Connector/J.

## Prerequisites
Install a JDK and MySQL Server. Create the database and table:

    CREATE DATABASE employee_db;
    USE employee_db;
    CREATE TABLE employees (
      id INT PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(100) NOT NULL,
      department VARCHAR(100) NOT NULL,
      salary DECIMAL(12, 2) NOT NULL
    );

## Configure credentials
The Java source contains local connection settings. Replace the placeholder values with your own local development configuration, or preferably read them from environment variables. Never commit a real password.

## Compile and run
Download MySQL Connector/J and place the JAR in the project directory, then run on Windows:

    javac -cp ".;mysql-connector-j.jar" EmployeeDBApp.java
    java -cp ".;mysql-connector-j.jar" EmployeeDBApp

On macOS/Linux, use a colon rather than a semicolon as the classpath separator.

## Recommended improvements
Add update/delete operations, use try-with-resources for statements and result sets, validate input, move credentials out of source, and add database integration tests.

## Scope
This is a learning example, not a production HR system. Production use requires authentication, authorization, audit logging, data protection, and controlled database access.

## License
No license file is currently declared. Add a license before granting reuse permissions.
