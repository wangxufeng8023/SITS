package cn.test.deom;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import cn.test.untl.Mysqls;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mysqls mysql=new Mysqls();
		Connection conn=null;
		String result="";
	String username="opencakd";
	String password="xiixixi";
	String email="xiixixi";
	String phone="xiixixi";
	String characters="xiixixi";
	    try {
			 conn=(Connection) mysql.connect();
		    } 
	    catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
	    try {
			 result=mysql.register(conn, username, password, phone, email,characters);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection  connect() throws ClassNotFoundException, SQLException{
		 String driver = "com.mysql.jdbc.Driver";

		   // URL指向要访问的数据库名scutcs
//		   String url = "jdbc:mysql://127.0.0.1:3306/project";
		   String url ="jdbc:mysql://http://xduniversityff.azurewebsites.net:3306/test";
		   		
		   // MySQL配置时的用户名
		   String user = "root"; 

		   // MySQL配置时的密码
		   String password = "wangxufeng";


		    // 加载驱动程序
		    Class.forName(driver);

		    // 连续数据库
		    Connection conn = (Connection) DriverManager.getConnection(url, user, password);
           return conn;
		
	}
}
