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

The repository includes an `employee_db` file; inspect it and the Java source for the expected schema. If your source expects the following table, you can create it with:

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

Adjust the table or column names to match the SQL statements in `EmployeeDBApp.java`.

## 2. Configure the database connection

Set the JDBC URL, username, and password for your local MySQL instance. Prefer environment variables or a local untracked configuration file. **Do not commit real credentials.**

## 3. Compile and run

Download MySQL Connector/J and place the JAR in the project directory. Example on Windows:

```powershell
javac -cp ".;mysql-connector-j.jar" EmployeeDBApp.java
java -cp ".;mysql-connector-j.jar" EmployeeDBApp
```

On macOS/Linux, use `:` rather than `;` as the classpath separator.

## Recommended improvements

- Move credentials out of source code
- Use try-with-resources for connections, statements, and result sets
- Add update/delete operations with validation
- Add tests against a dedicated test database
- Document schema setup and common connection errors

## Scope and security

This is a learning example, not a production HR system. Real employee-data software requires authentication, authorization, audit logs, data protection, backups, and controlled database access.

## License

No license file is currently declared. Add a `LICENSE` file to define reuse terms.
