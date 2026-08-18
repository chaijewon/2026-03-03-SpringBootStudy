package com.sist.stream;
import java.util.*;
import java.sql.*;
public class EmpDAO {
   // SqlSessionFactory / JpaRepository
   private Connection conn;
   private PreparedStatement ps;
   private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
   public EmpDAO()
   {
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
	   }catch(Exception ex) 
	   {
		   ex.printStackTrace();
	   }
   }
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"hr","happy");
	   }catch(Exception ex) {}
   }
   public void disConnection() {
	   try
	   {
		   if(ps!=null) ps.close();
		   if(conn!=null) conn.close();
	   }catch(Exception ex) {}
   }
   // 전체 데이터 읽기 
   public List<EmpVO> empAllData()
   {
	   List<EmpVO> list=
			   new ArrayList<EmpVO>();
	   return list;
   }
}
