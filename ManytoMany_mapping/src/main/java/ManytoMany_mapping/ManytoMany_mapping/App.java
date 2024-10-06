package ManytoMany_mapping.ManytoMany_mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration con=new Configuration().configure("hibernate-cfg.xml");
    	
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session ss=sf.openSession();
    	
    	
    	/*post p1=new post();
    	p1.setPid(111);
    	p1.setPname("nature");
    	
    	post p2=new post();
    	p2.setPid(112);
    	p2.setPname("spritual");
    	
    	
    	List<post> l1=new ArrayList();
    	l1.add(p1);
    	l1.add(p2);
    	
    	
    	user u1=new user();
    	u1.setUid(10);
    	u1.setUname("Tanuja");
    	u1.setUemail("t@gmail.com");
    	
    	user u2=new user();
    	u2.setUid(11);
    	u2.setUname("anuja");
    	u2.setUemail("a@gmail.com");
    	
    	user u3=new user();
    	u3.setUid(12);
    	u3.setUname("Tanvi");
    	u3.setUemail("tanvi@gmail.com");
    	
    	List<user> l2=new ArrayList();
    	l2.add(u1);
    	l2.add(u2);
    	l2.add(u3);
    	
    	u1.setL2(l1);
    	u2.setL2(l1);
    	u3.setL2(l1);
    	
    	
    	p1.setL1(l2);
    	p1.setL1(l2);
    	
    	ss.save(p1);
    	ss.save(p2);
    	ss.save(u1);
    	ss.save(u2);
    	ss.save(u3); */
    	
    	
    	/*user us=(user) ss.get(user.class, 10);
    	
    	for(post ps:us.getL2())
    	{
    		System.out.println(ps.getPname());
    	}
    	*/
    	
    	
    	post ps=(post) ss.get(post.class,111);
    	
    	for(user us:ps.getL1())
    	{
    		System.out.println(us.getUname());
    	}
    	ss.beginTransaction().commit();
    	
    	
        
    	
        
    }
}
