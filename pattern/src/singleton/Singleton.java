package singleton;

import java.sql.*;

public class Singleton {

    private static Singleton instance;
    static Connection con = null;
    static ResultSet rs = null;
    static Statement stmt = null;
    Singleton() throws SQLException, ClassNotFoundException
    {
        String connectionUrl = "jdbc:postgresql://localhost:5432/oop"; //connecting to DB
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres","victoria"); //log in
            System.out.println("Success"); // and get message

        }
        catch (Exception e)
        {
            System.out.println("Error"); //Otherwise it will be error
        }
    }

    public static Singleton getInstance() throws SQLException, ClassNotFoundException {
        if(Singleton.instance== null)
            Singleton.instance = new Singleton();
        return Singleton.instance;
    }

    public void query(String sql) throws SQLException {
        String zapros = sql;
        stmt = con.createStatement();
        rs = stmt.executeQuery(zapros); //execute query
        while (rs.next())
            System.out.println(rs.getInt("id")
                    + " " + rs.getString("name") + " "
                    + rs.getString("surname") + " " + rs.getDouble("grade")); //output result
    }
}
