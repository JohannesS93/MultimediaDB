import javax.*;

import java.sql.*;  
import java.io.*;  
public class Indexing {  
public static void main(String[] args) {  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:orcl","sys as SYSDBA","zorro135");   
      
PreparedStatement ps=con.prepareStatement("select * from IMAGE");  
ResultSet rs=ps.executeQuery();  
if(rs.next()){//now on 1st row  
  rs.next();
//FileOutputStream fout=new FileOutputStream("e:\\sonoo.jpg");  
//fout.write(barr);  
//              
//fout.close();  

System.out.println(rs.getString(2));
}//end of if  
System.out.println("ok");  
//StorePicture.test(con);
con.close();  
}catch (Exception e) {e.printStackTrace();  }  
}  
}  