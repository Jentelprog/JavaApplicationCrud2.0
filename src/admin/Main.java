
package admin;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector dbConnector = new DatabaseConnector();
        Connection connection = dbConnector.getConnection();
        AdminConnection adc=new AdminConnection(connection);
        adc.main(args);
        //dbConnector.closeConnection();
    }
}
