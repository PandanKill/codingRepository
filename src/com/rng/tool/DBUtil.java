package com.rng.tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
   private static String driver="oracle.jdbc.driver.OracleDriver";
   private static String url="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
   private static String user="scott";
   private static String pwd="tiger";
   private static Connection con=null;
   
   static{
	   try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public static Connection getConnection(){
	   try {
		con=DriverManager.getConnection(url, user, pwd);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return con;
   }
   
   public static Connection closeConection(){
	   if(con!=null){
		   try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   con=null;
	   }
	   return con;
   }
}
