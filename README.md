# Java Employee Database App

[![Java](https://img.shields.io/badge/Java-JDBC-orange?logo=openjdk)](https://www.java.com/) [![MySQL](https://img.shields.io/badge/Database-MySQL-4479A1?logo=mysql)](https://www.mysql.com/) [![Source](https://img.shields.io/badge/Source-GitHub-181717?logo=github)](https://github.com/kandisaikishore/JAVA-EMPLOYEE-DATABASE-APP)

A Java JDBC application that demonstrates connecting to MySQL and performing employee-record operations. The project is useful for practising relational database access, parameterized SQL, result-set handling, and exception management.

## Current capabilities

- Connect to a MySQL database through JDBC
- Insert employee records using a prepared statement
- Retrieve employee details and print them in the console
- Work with a simple employee database schema
- Practise Java resource management and SQL error handling

Check `EmployeeDBApp.java` for the exact supported operations and database configuration.

## Technology stack

- Java / JDK
- JDBC
- MySQL Server
- MySQL Connector/J

## Prerequisites

Install a JDK, MySQL Server, and MySQL Connector/J. Confirm that the database service is running before launching the application.

## Database setup

Inspect the `employee_db` file and the SQL statements in `EmployeeDBApp.java` to confirm the schema expected by this version. A compatible example schema, if it matches the source, is:

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

Update the names and column types if the source uses a different schema.

## Configure and run

Configure the JDBC URL, username, and password for your local MySQL installation. Keep credentials outside version control and use a least-privilege database account.

Place the MySQL Connector/J JAR in the project directory, then compile and run (replace the JAR filename as needed):

**Windows PowerShell**
```powershell
javac -cp ".;mysql-connector-j.jar" EmployeeDBApp.java
java -cp ".;mysql-connector-j.jar" EmployeeDBApp
```

**macOS / Linux**
```bash
javac -cp ".:mysql-connector-j.jar" EmployeeDBApp.java
java -cp ".:mysql-connector-j.jar" EmployeeDBApp
```

## Recommended validation

Test successful inserts, empty or malformed fields, database unavailability, incorrect credentials, and queries against an empty table. Verify that connections, statements, and result sets are closed reliably.

## Security and scope

This is an educational sample, not a production HR system. Production employee-data systems require authentication, authorization, secure configuration, auditability, backup policies, and careful handling of personal data.

## Roadmap

- Move database settings to environment variables
- Use try-with-resources consistently
- Add validated update and delete operations
- Add automated tests against a dedicated test database
- Document schema migrations and common JDBC errors

## License

No license file is currently declared. Add a `LICENSE` file to define reuse terms.
