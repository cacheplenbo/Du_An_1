package Utilities;

import java.sql.*;

public class DBConection {

    private static String username = "sa";
    private static String pass = "123";
    private static String connectionSQL = "jdbc:sqlserver://localhost:1433;databaseName=AssignmentPro1041;encrypt=true;trustServerCertificate=true";
    private static Connection conn;

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection(){
     Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionSQL, username, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    public static ResultSet excutequery(String sql, Object... args){
       Connection conn = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       
        try {
            conn = getConnection();
            ps = conn.prepareCall(sql);
            
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);
            }
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static Integer excuteUpdate(String sql, Object... args){
       Connection conn = null;
       Integer row = 0;
       PreparedStatement ps = null;
       
        try {
            conn = getConnection();
            ps = conn.prepareCall(sql);
            
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);
            }
            row = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }
}
