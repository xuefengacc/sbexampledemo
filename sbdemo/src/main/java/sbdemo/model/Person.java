package sbdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
    
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long perId;
	private String perName;
	
	public long getPerId() {
		return perId;
	}
	public void setPerId(long perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	
}
