# JDBC, Database Setup, and QA Guide

This Java application uses JDBC and MySQL to demonstrate employee-record operations. Check `EmployeeDBApp.java` and the current schema/configuration for the exact database name, columns, and supported operations.

## Prerequisites

- A supported JDK
- MySQL Server
- MySQL Connector/J on the classpath or configured build path

Never commit database passwords. Prefer environment variables or a local untracked configuration file for credentials.

## Database setup

Create an isolated development/test database and apply the schema documented by the repository. Use synthetic employee records. Confirm the connection URL, driver, database name, and user permissions before running the app.

## JDBC quality requirements

- Use prepared statements for values supplied by users.
- Close connections, statements, and result sets reliably, preferably with try-with-resources.
- Validate required fields before executing SQL.
- Return useful errors without exposing passwords, connection strings, or full SQL diagnostics to end users.
- Use transactions when a workflow changes multiple related records.

## Test matrix

Test valid insert and retrieval, missing fields, malformed values, duplicate keys, unknown employee IDs, database unavailable, rejected credentials, and failed writes. Verify that a failed operation does not leave partial data. Use an isolated test schema and clean up fixture rows.

## Pull-request checklist

- [ ] Run compile/build checks using the current project setup.
- [ ] Verify parameterized SQL and resource cleanup.
- [ ] Test success and database failure paths.
- [ ] Avoid using real employee records in fixtures.
- [ ] Document database prerequisites and checks that could not be run.
