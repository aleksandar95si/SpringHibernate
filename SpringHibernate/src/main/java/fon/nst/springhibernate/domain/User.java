package fon.nst.springhibernate.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
		
		@Id
		private Long id;
	    private String firstname;
	    private String lastname;
	    private String username;
	    private String pass;

	    public User() {
	    }

	    public User(Long id, String firstname, String lastname, String username, String password) {
	        this.id = id;
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.username = username;
	        this.pass = password;
	    }

	    public String getPass() {
	        return pass;
	    }

	    public void setPass(String pass) {
	        this.pass = pass;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getFirstname() {
	        return firstname;
	    }

	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }

	    public String getLastname() {
	        return lastname;
	    }

	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 3;
	        hash = 59 * hash + Objects.hashCode(this.id);
	        hash = 59 * hash + Objects.hashCode(this.firstname);
	        hash = 59 * hash + Objects.hashCode(this.lastname);
	        hash = 59 * hash + Objects.hashCode(this.username);
	        hash = 59 * hash + Objects.hashCode(this.pass);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final User other = (User) obj;
	        if (!Objects.equals(this.firstname, other.firstname)) {
	            return false;
	        }
	        if (!Objects.equals(this.lastname, other.lastname)) {
	            return false;
	        }
	        if (!Objects.equals(this.username, other.username)) {
	            return false;
	        }
	        if (!Objects.equals(this.pass, other.pass)) {
	            return false;
	        }
	        if (!Objects.equals(this.id, other.id)) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "User{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username + ", pass=" + pass + '}';
	    }
	    
}
