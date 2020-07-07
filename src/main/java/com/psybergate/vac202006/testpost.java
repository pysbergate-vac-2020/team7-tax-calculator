package com.psybergate.vac202006;

import java.sql.*;



public class testpost {


		

		
		private void connect() {
			try{
				//Class.forName("org.postgresql.Driver");
				final String url = "jdbc:postgresql://localhost:5432/postgres";
				final String user = "postgres";
				final String password = "Irfaan1!";
				Connection connection = DriverManager.getConnection(url, user, password);
				if (connection!= null) {
					 System.out.println("It works");
				}
				else {
					System.out.println("fuck");
				}
				Statement stmt = connection.createStatement( );
				String sql = "UPDATE superheros\n" + 
						"	SET \"ID\"= 'flm'";
		        stmt.executeUpdate(sql);
		        //connection.commit();
				

				
				
				
			}
		
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
		
		public static void main(String[] args) {
			testpost sqlconnect = new testpost();
			sqlconnect.connect();
		}
}


