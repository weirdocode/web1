package basic.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:db-config.xml");
		
//		DataBaseInfo dbInfo = ct.getBean("db1", DataBaseInfo.class);
//		dbInfo.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		MemberDAO dao = ct.getBean("dao", MemberDAO.class);
		dao.showDBInfo();
		

	}

}

















