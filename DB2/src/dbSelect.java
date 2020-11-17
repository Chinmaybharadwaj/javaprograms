//import java.sql.Connection;

import java.io.PrintStream;
import java.sql.*;

import javax.swing.JTable;

public class dbSelect {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	private ResultSetMetaData meta;
	private String ab=null; 
	PrintStream space;
	
	public dbSelect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","");
			st=con.createStatement();
			
		}catch(Exception ex) {
			System.out.println("Error:"+ex);
		}
	}
	public void getData() {
		try {
			String query="select * from userdtabase";
			rs= st.executeQuery(query);
			System.out.println("Records of the database");
			while(rs.next()) {
				String name=rs.getString("name");
				String id=rs.getString("id");
				System.out.println(name+"  "+id);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void getData(JTable t) {
		try {
			String query="select * from userdtabase";
			rs= st.executeQuery(query);
			String name,id;
			String result="";
			System.out.println("Records of the database");
			int i=0,j=0;
			while(rs.next()) {
				j=0;
				name=rs.getString("name");
				id=rs.getString("id");
				System.out.println(name+"  "+id);
				result=result.concat(name);
				result=result.concat(" " +id);
				result=result.concat("\n");
				
				t.setValueAt(name, i, j);
				j=j+1;
				t.setValueAt(id, i, j);
				i=i+1;
			}
			
			//tf.setText(result);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void getData2() {
		try {
		st=con.createStatement();
		rs=st.executeQuery("select * from userdtabase");
		meta=rs.getMetaData();
		int noCol=meta.getColumnCount();
	
		for(int i=1;i<=noCol;i++) {
				System.out.printf("%-30s",meta.getColumnName(i));
		}
		
		System.out.println();
		while(rs.next()) {
			for(int i=1;i<=noCol;i++) 
			space=System.out.printf("%-30s",rs.getObject(i));
			System.out.println(space);
		}
		//ab = null;
	
		//String random="hello";
		
	//	random=random.concat(str);
		
		System.out.println(space);
		
		}catch(Exception e) {
			System.out.println("Exception in dbSelect.getData2"+e);
		}
	}
}
