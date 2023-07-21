package exam07_6;

public class DBService {
	MySQLDAO dao; // has a
	
	public void setDAO(MySQLDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.connect_mysql();
	}
}
