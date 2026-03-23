import java.util.Scanner;
class JDBCDriverClass
{
   public static void main(String[] args)
   {
        JDBCOperations j = new JDBCOperations();
        int res = 0;
        String query = "";
        System.out.println("1. Create Table 2. Insert Table 3. Retrieve Data");
        System.out.println("Enter Your option: ");
        Scanner s = new Scanner(System.in);
        int opt = s.nextInt();
        switch(opt)
        { 
           case 1:
                   query = "create table studinfo1(id int, name varchar(20), qual varchar(10))";
                   res = j.createTableInDB(query);
                   //Getting Results
                   if(res == 0)
	                 System.out.println("1 row inserted successfully");
	           else	
                         System.out.println("Unsuccessful");
                   break;
           case 2:
                   query = "insert into studinfo1 values(3, 'maganti', 'M.Tech')";
                   res = j.insertDataToDB(query);		
	           //Getting Results
                   if(res == 1)
	                 System.out.println("1 row inserted successfully");
	           else	
                         System.out.println("Unsuccessful");
                   break;
           case 3: 
                   query = "select * from studinfo1;

        }
   }
}