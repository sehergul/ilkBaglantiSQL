package com.example.ilkBaglantiSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	static String userName="postgres";
	static String password="12345";
	static String dbUrl="jdbc:postgresql://localhost/dbUrun";

	public static void main(String[] args) throws SQLException{
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(dbUrl, userName, password);
			System.out.println("Bağlantı oluştu");
		}catch(SQLException exception) {
			System.out.println(exception);
		}finally {
			connection.close();}
		
	}

}
