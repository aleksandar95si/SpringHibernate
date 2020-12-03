package fon.nst.springhibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stats {
		
		@Id
		@Column(name="id")
	    private int key;
		private String tablename;
	    private int value;

	    public Stats() {
	    }

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String getTablename() {
			return tablename;
		}

		public void setTablename(String tablename) {
			this.tablename = tablename;
		}

		@Override
		public String toString() {
			return "Stats [key=" + key + ", tablename=" + tablename + ", value=" + value + "]";
		}

		
	    
	    
	   
}
