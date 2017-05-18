package connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import com.mysql.jdbc.PreparedStatement;
public class adapter {
	public String layNoidung()
	{
		String ss="";

		connectionstring s=new connectionstring();
		String t=s.getSQL();
		System.out.print(t);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		Connection con=null;
		Statement stm=null;
		ResultSet rs;	
		try
		{
			con=DriverManager.getConnection(s.getSQL(),s.getName(),s.getPass());
			System.out.print("Thanh cong");
			stm=con.createStatement();
			rs=stm.executeQuery("select * from demo");
			System.out.print("Thanh cong");
			
		if(rs.next())
			ss=rs.getString("noidung");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.print("that bai");
		}	
		finally
		{
				try {
					con.close();
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		return ss;
	}

	public boolean CapNhat(String noidung)
	{				
		
		connectionstring s = new connectionstring();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		Connection con=null;
		Statement stm=null;
		
		try
		{
			
			con=DriverManager.getConnection(s.getSQL(),s.getName(),s.getPass());
			stm=con.createStatement();
			String sql="UPDATE `demo` SET `noidung`= '"+noidung+"'";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
			return pst.executeUpdate() > 0;						
					
		}catch(SQLException e){
			e.printStackTrace();
		}	
		finally
		{
			
				try {
					con.close();
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
			
		return false;
	}
}