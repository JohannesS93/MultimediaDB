import javax.*;

import java.sql.*;  
import java.io.*;  
public class Indexing {  
public static void main(String[] args) {  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:orcl","sys as SYSDBA","zorro135");   
      
PreparedStatement ps=con.prepareStatement("select * from IMG1");  
ResultSet rs=ps.executeQuery();  
if(rs.next()){//now on 1st row  
              
Blob b=rs.getBlob(2);//2 means 2nd column data  
byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
              
FileOutputStream fout=new FileOutputStream("e:\\sonoo.jpg");  
fout.write(barr);  
              
fout.close();  
System.out.println();
}//end of if  
System.out.println("ok");  
//StorePicture.test(con);
con.close();  
}catch (Exception e) {e.printStackTrace();  }  
}  
}  