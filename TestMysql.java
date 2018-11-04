package MysqlTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.MysqlParameterMetadata;

import entity.ClassTable;
import entity.Teacher;


public class TestMysql {
    public static final String CREATE_STUDENT = "create table Student ("
            + "stuId int primary key autoincrement,"
            + "sName varchar(20),"
            + "sPassword varchar(20))";

    public static final String CREATE_CLASSTABLE = "create table ClassTable("
            + "classTableId int primary key autoincrement,"
            + "classLine int,"
            + "classColumn int,"
            + "teacherName varchar(40),"
            + "semester varchar(40),"
            + "inClass varchar(40))";
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		
		ClassTable c = new ClassTable("heh","asd");
//		c.setClassTableId(4);
		c.setColumn(10);
		c.setInClass("b");
//		c.setSemster("123");
		c.setLine(10);
//		c.setTeacherName("woshi");	
		 int i = MysqImpl.addClassTable(c);
		if(i==0) {
			System.out.println("tianjia chenggong ");
		}

//		Connection con = null;
//		Statement  stmt = null;
//		ResultSet rs = null;
//		List<Teacher> teachers = new ArrayList<Teacher>();
//		try{
			//获取连接
//			con = JdbcUtil.getConnection();
			
			
//			stmt = con.prepareStatement(sql)
			//创建PreparedStatement
			
//			String sql = "select * from teacher;";
//			stmt = con.createStatement();
//			int i = stmt.executeUpdate(CREATE_STUDENT);	
//		    if (i != 0) {      
//		         System.out.println("表已经创建成功！");   
//		    }
//			while(rs.next()) {
//				System.out.println(rs.getString("name"));
//			}
//		
//			stmt.executeUpdate();
			
			
//			stmt = con.prepareStatement(CREATE_CLASSTABLE);
//			stmt.executeUpdate();
			
			
//		}catch(Exception e){
//			try {
////				rs.close();
//				stmt.close();
//				con.close();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		}
//					
	}
}
