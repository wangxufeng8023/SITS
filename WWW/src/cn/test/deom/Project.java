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

		   // URLָ��Ҫ���ʵ����ݿ���scutcs
//		   String url = "jdbc:mysql://127.0.0.1:3306/project";
		   String url ="jdbc:mysql://http://xduniversityff.azurewebsites.net:3306/test";
		   		
		   // MySQL����ʱ���û���
		   String user = "root"; 

		   // MySQL����ʱ������
		   String password = "wangxufeng";


		    // ������������
		    Class.forName(driver);

		    // �������ݿ�
		    Connection conn = (Connection) DriverManager.getConnection(url, user, password);
           return conn;
		
	}
}
