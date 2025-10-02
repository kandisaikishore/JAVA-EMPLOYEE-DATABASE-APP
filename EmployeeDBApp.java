import java.sql.*;

public class EmployeeDBApp {
    static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    static final String USER = "root";
    static final String PASS = "yourpassword";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            System.out.println("Connected to DB!");

            // Example: Insert Employee
            String insert = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, "John Doe");
            ps.setString(2, "IT");
            ps.setDouble(3, 50000);
            ps.executeUpdate();
            System.out.println("Employee added!");

            // Example: View Employees
            String select = "SELECT * FROM employees";
            ResultSet rs = conn.prepareStatement(select).executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
