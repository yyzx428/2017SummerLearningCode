package test;

import java.io.InputStream;
import java.util.List;
import java.util.ListIterator;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dao.ClassDao;
import com.model.Class;

public class Tests {
	@Test
	public  void test() {
		String resource="mybatis.xml";
		
		InputStream is=Tests.class.getResourceAsStream(resource);
		
		SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(is); 
		SqlSession session=sessionFactory.openSession();
		
		ClassDao userMapper = session.getMapper(ClassDao.class); 
		
		List<com.model.Class> classes=userMapper.findAllClass();
		ListIterator<Class> iterator=classes.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}
