package ManytoMany_mapping.ManytoMany_mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class user {
	
	@Id
	private int uid;
	private String uname;
	private String uemail;
	@ManyToMany
	private List<post> l2;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public List<post> getL2() {
		return l2;
	}
	public void setL2(List<post> l2) {
		this.l2 = l2;
	}
	@Override
	public String toString() {
		return "user [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", l2=" + l2 + "]";
	}
	
	

}
