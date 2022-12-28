package databases;

import org.junit.Assert;

import java.sql.SQLException;

public class UnitTestConnectDB {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

        Assert.assertEquals("", "");


    }
}
