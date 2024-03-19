import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html;charset=UTF-8");

    
      

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a database connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my portfolio website", "saksham-pokhrel", "admin");
			Statement statement=connection.createStatement();
            // Prepare the SQL statement
            // Get form data
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String message = request.getParameter("message");
            String insertQuery = "INSERT INTO contact (name, email, message) VALUES ('"+name+"' ,'"+email+"' ,'"+message+"')";

           // Execute the SQL statement

     		int flag=0;
    		flag=statement.executeUpdate(insertQuery);
    		if(flag==1) {
                // Display a success message in a popup
                response.getWriter().println("<script>alert('Data inserted successfully!');</script>");
            } else {
                // Display an error message
                response.getWriter().println("Error: Data not inserted.");
            }

            // Close the resources
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            // Display an error message
            response.getWriter().println("Error: MySQL driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Display an error message
            response.getWriter().println("Error: Database connection or query execution failed.");
            e.printStackTrace();
        }
    }
}