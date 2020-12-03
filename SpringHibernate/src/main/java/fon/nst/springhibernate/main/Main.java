package fon.nst.springhibernate.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import fon.nst.springhibernate.config.Config;
import fon.nst.springhibernate.domain.User;
import fon.nst.springhibernate.service.impl.UserServiceImpl;
import fon.nst.springhibernate.util.HibernateUtility;

@Component
public class Main {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	public static void main(String[] args) throws Exception {
		
		BeanFactory context=new AnnotationConfigApplicationContext(Config.class);
		Main main=context.getBean(Main.class);
		
		//Kreiranje Usera
		//User user3=new User(3L, "Mika","Mitic","mm","ccc");
		
		//Čuvanje Usera
		//main.saveUser(user3); 
		
		//Apdejtovanje Usera (u primeru je šifra apdejtovana)
		//main.updateUser(3L, "Mika","Mitic","mm","ddd");
		
		//Brisanje Usera prema id-u
		//main.deleteUser(3L);
		
		//Štampanje svih Usera
		//main.getAllUsers();	
		
		HibernateUtility.getSessionFactory().close();
	}
	
	private void saveUser(User user) throws Exception {
		userServiceImpl.add(user);
	}

	private void deleteUser(Long userId) throws Exception {
		userServiceImpl.delete(userId);
	}

	private void updateUser(Long userId, String firstName, String lastName, String username, String password) throws Exception {
		userServiceImpl.update(userId, firstName, lastName, username, password);
	}

	private void getAllUsers() {
		userServiceImpl.listOfUsers();
	}

}


