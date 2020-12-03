package fon.nst.springhibernate.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import fon.nst.springhibernate.domain.User;
import fon.nst.springhibernate.util.HibernateUtility;


@Repository
public class UserRepository {
		
		public User add(User user) throws Exception{
			Session session=HibernateUtility.getSessionFactory().getCurrentSession();
			session.getTransaction();
			
	        session.save(user);
	        
	 		return user;
	    }
	    
	    public void delete(Long userId) throws Exception{
	    	Session session=HibernateUtility.getSessionFactory().getCurrentSession();
	    	session.getTransaction();
	    	
	    	User user=session.get(User.class, userId);
	    	
	    	session.remove(user);
	    }
	    
	    public User update(Long userId, String firstName, String lastName, String username, String password)throws Exception{
	    	Session session=HibernateUtility.getSessionFactory().getCurrentSession();
	    	session.getTransaction();
	    	
	    	User user=session.get(User.class, userId);
	    	user.setFirstname(firstName);
	    	user.setLastname(lastName);
	    	user.setUsername(username);
	    	user.setPass(password);
	    	
	        return user;
	    }
	    
	    public List<User> getAll() {
	    	Session session=HibernateUtility.getSessionFactory().getCurrentSession();
	    	session.getTransaction();
	    	
	    	Query query=session.createQuery("from User");
			List<User> lista=query.list();
			
			return lista;
	    }
}
