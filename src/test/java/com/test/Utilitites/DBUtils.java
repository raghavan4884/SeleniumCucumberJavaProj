package com.test.Utilitites;

import java.sql.*;

public class DBUtils {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public Connection openConnection()
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection("jdbc:sqlserver://localhost\\databaseName=sa;user=sa;password=sa");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 
		return con;
	}
	public ResultSet getTableRecords(String sql)
	{
		try
		{
			st=openConnection().createStatement();
			rs=st.executeQuery(sql);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}

	public void updateTable(String sql)
	{
		try
		{
			st=openConnection().createStatement();
			st.executeUpdate(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
