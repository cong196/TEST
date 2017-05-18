package connect;

public class connectionstring {

	public String name="root";
	public String pass="dtdmnhom9";
	
	 String sql = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory","dtdmnhom9","feisty-circuit-161108:asia-northeast1:dtdmnhom9");
	
	public String getSQL()
	{
		return sql;
	}
	public String getName()
	{
		return name;
	}
	public String getPass()
	{
		return pass;
	}
}