# Java Employee Database App

[![Java](https://img.shields.io/badge/Java-JDBC-orange?logo=openjdk)](https://www.java.com/) [![MySQL](https://img.shields.io/badge/Database-MySQL-4479A1?logo=mysql)](https://www.mysql.com/) [![Repository](https://img.shields.io/badge/GitHub-Source-181717?logo=github)](https://github.com/kandisaikishore/JAVA-EMPLOYEE-DATABASE-APP)

A Java JDBC learning project that connects to MySQL and demonstrates inserting employee records and reading them back. It introduces relational database connectivity, parameterized SQL, and exception handling.

## Current capabilities

- Connect to a local MySQL database
- Insert employee data using a parameterized `PreparedStatement`
- Read employee records and print selected fields
- Handle SQL exceptions

## Tech stack

- Java
- JDBC
- MySQL Server
- MySQL Connector/J

## Prerequisites

Install a JDK, MySQL Server, and MySQL Connector/J.

## 1. Create the database

Run the following SQL in your MySQL client:

```sql
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    salary DECIMAL(12, 2) NOT NULL
);
```

Check the Java source for the precise table/column names and update the SQL if your implementation expects a different schema.

## 2. Configure the connection

Set the JDBC URL, username, and password for your local MySQL instance. Prefer environment variables or a local, untracked configuration file. **Never commit real database credentials.**

## 3. Compile and run

Download the MySQL Connector/J JAR and put it in the project directory. Example on Windows:

```powershell
javac -cp ".;mysql-connector-j.jar" EmployeeDBApp.java
java -cp ".;mysql-connector-j.jar" EmployeeDBApp
```

On macOS/Linux, use `:` instead of `;` as the classpath separator:

```bash
javac -cp ".:mysql-connector-j.jar" EmployeeDBApp.java
java -cp ".:mysql-connector-j.jar" EmployeeDBApp
```

Replace the JAR filename with the version you downloaded.

## Recommended improvements

- Move credentials out of source code
- Use try-with-resources for connections, statements, and result sets
- Add update and delete operations with validation
- Add tests using a dedicated test database
- Add clear database setup and troubleshooting instructions

## Scope and security

This is a learning example, not a production HR system. A real employee-data application requires authentication, authorization, audit logs, data protection, backups, and controlled database access.

## License

No license file is currently declared. Add a `LICENSE` file to define reuse terms.
