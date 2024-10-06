package ManytoMany_mapping.ManytoMany_mapping;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class post {

	@Id
	private int pid;
	private String pname;
	
	@ManyToMany
	private List<user> l1;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<user> getL1() {
		return l1;
	}

	public void setL1(List<user> l1) {
		this.l1 = l1;
	}

	@Override
	public String toString() {
		return "post [pid=" + pid + ", pname=" + pname + ", l1=" + l1 + "]";
	}
	
	
	
	
}
