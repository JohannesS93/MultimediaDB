import javax.*;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BFILE;

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
BFILE src_lob = null;
while(rs.next()){//now on 1st row  

	 src_lob = ((OracleResultSet)rs).getBFILE (2);
System.out.println(rs.getInt(1)+"   "+src_lob.getDirAlias());


}//end of if  
System.out.println("ok");  
//StorePicture.test(con);
con.close();  
}catch (Exception e) {e.printStackTrace();  }  
}  
}  