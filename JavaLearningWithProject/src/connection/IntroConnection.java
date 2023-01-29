package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IntroConnection {
	
	public static void ConnectionDb()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		String dbUrl = "jdbc:sqlserver://localhost:1433;database=DbYTAJavaOkul;encrypt=true;trustServerCertificate=true;";
		String user = "JavaUser";
		String pass = "Akin1903";
		PreparedStatement statement = null;
		ResultSet  resultSet = null;
		String sentence = "insert into TblOgrenciler values ('Hasan','Yilmaz',75,85)";
		String sentence2 = "update TblOgrenciler set OgrenciAdi='Ugur', OgrenciSoyadi='Arslan', Not1 = 95, Not2 = 98 where OgrenciNo = 9";
		
		
		getRecord(connection, dbUrl, user, pass, statement, resultSet);
		addStudent(connection, dbUrl, user, pass, statement, sentence);
		updateStudent(connection, dbUrl, user, pass, statement, sentence2);
		getRecord(connection, dbUrl, user, pass, statement, resultSet);
	}
	
	private static void updateStudent(Connection connection, String dbUrl, String user, String pass,PreparedStatement statement,String sentence)
	{
		try {
			connection = DriverManager.getConnection(dbUrl,user,pass);
			System.out.println("Veritabanina baglanildi...");
			
			statement = connection.prepareStatement(sentence);
			int n = statement.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				System.out.println("Guncelleme yapilirken hata meydana geldi...");
			e.printStackTrace();
		}finally {
			try {
				if(statement != null)
				{
					statement.close();
				}
				if(connection != null)
				{
					connection.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	private static void addStudent(Connection connection, String dbUrl, String user, String pass,
			PreparedStatement statement,String sentence)
	{
		try {
			connection = DriverManager.getConnection(dbUrl,user,pass);
			System.out.println("Veritabanina baglanildi...");
			
			statement = connection.prepareStatement(sentence);
			int n = statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Veri eklenirken bir hata olustu...");
			e.printStackTrace();
		}finally {
			try {
				if(statement != null)
				{
					statement.close();
				}
				if(connection != null)
				{
					connection.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	private static void getRecord(Connection connection, String dbUrl, String user, String pass,
			PreparedStatement statement, ResultSet resultSet) {
		try {
			connection = DriverManager.getConnection(dbUrl,user,pass);
			System.out.println("Veritabanina baglanildi...");
			
			statement = connection.prepareStatement("select * from TblOgrenciler");
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				System.out.println(resultSet.getString(1) + " \t" + resultSet.getString(2) + " \t\t\t\b" + resultSet.getString(3) + " \t\t\t\b" + resultSet.getString(4) + " \t" + resultSet.getString(5));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Veritbanina baglanilirken haya olustu...");
			e.printStackTrace();			
		}finally {
			try {
				if(statement != null)
				{
					statement.close();
				}
				if(resultSet != null)
				{
					resultSet.close();
				}
				if(connection != null)
				{
					connection.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
	}

}
