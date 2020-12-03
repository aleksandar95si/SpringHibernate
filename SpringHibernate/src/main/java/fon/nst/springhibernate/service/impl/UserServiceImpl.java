package fon.nst.springhibernate.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import fon.nst.springhibernate.domain.User;
import fon.nst.springhibernate.repository.StatsRepository;
import fon.nst.springhibernate.repository.UserRepository;
import fon.nst.springhibernate.service.UserService;
import fon.nst.springhibernate.util.HibernateUtility;

@Service
public class UserServiceImpl implements UserService {
		
	@Autowired
	private final UserRepository userRepository;
	@Autowired 
	private final StatsRepository statsRepository;
	
	 public UserServiceImpl(UserRepository userRepository, StatsRepository statsRepository) {
	        this.userRepository = userRepository;
	        this.statsRepository = statsRepository;
	    }
	
	public User add(User user) throws Exception {
		Session session=HibernateUtility.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		userRepository.add(user);
		statsRepository.inc();
		
		session.getTransaction().commit();
	
		return user;
	}

	public void delete(Long userId) throws Exception {
		Session session=HibernateUtility.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		userRepository.delete(userId);
		statsRepository.dec();
		
		session.getTransaction().commit();
	}

	public User update(Long userId, String firstName, String lastName, String username, String password) throws Exception {
		Session session=HibernateUtility.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		userRepository.update(userId, firstName, lastName, username, password);
		
		User user=session.get(User.class, userId);
		
		session.getTransaction().commit();
		return user;
	}
	
	public void listOfUsers() {
		Session session=HibernateUtility.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		List<User> lista=userRepository.getAll();
		for(User user:lista) {
			System.out.println(user);
		} 
	}

}
