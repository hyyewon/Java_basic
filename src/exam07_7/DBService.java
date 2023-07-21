package exam07_7;

public class DBService {
	DBDAO dao; // has a
	
	public void setDAO(DBDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.connect();
	}
}
