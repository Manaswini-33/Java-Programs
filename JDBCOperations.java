import java.sql.*;
class JDBCOperations
{ 
   Connection con = null;
   Statement st = null;
   int res = 0;
   JDBCOperations()
   {
      //JDBC Steps
      //1. Loading the Driver
       try 
       {
	  Class.forName("com.mysql.cj.jdbc.Driver");
       }
		
       catch(ClassNotFoundException ce)
       {	
           System.out.println("Exception: " + ce);
       }
       //2. Establishing the connection		
       try
       {
	   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb", "root", "Manaswini@337");
       }
	catch(SQLException se)
	{
	     System.out.println("Exception: " + se);
	}  
   } 
   int createTableInDB(String query)
   {
     //Creating and executing a statement
      try	
      {	
          st = con.createStatement();
	  res = st.executeUpdate(query);//by default result will be updated by the query output. 
      }
      catch(SQLException se)
      {	
          System.out.println("Exception: " + se);
      }	
      return res;
   }
   int insertDataToDB(String query)
   {
      //Creating and executing a statement
      try	
      {	
          st = con.createStatement();
	  res = st.executeUpdate(query);//by default result will be updated by the query output. 
      }
      catch(SQLException se)
      {	
          System.out.println("Exception: " + se);
      }	
      return res;
   }
   ResultSet getDataFromDB(String query)
   {
      ResultSet rs = null;
      try
      {
          st = con.createStatement();
          rs = st.executeQuery(query);
      }
      catch(SQLException se)
      {
          System.out.println("Exception: " + se);
      }
      return rs;
   }
}