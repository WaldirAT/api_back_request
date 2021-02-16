package ws.synopsis.req.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

@Entity
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	int id;
	@NotNull
	@Column(name = "NAME")	
	String name;
	@NotNull
	@Column(name = "LASTNAME")
	String lastname;
	@NotNull	
	@Column(name = "PHONE",length = 10, unique = true)
	int phone;
	@NotNull
	@Pattern(regexp="[a-zA-Z]{5,10}")
	@Column(name = "PASS")	
	String pass;

	public User() {

	}

	public User(int id, String name, String lastname, int phone, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int i) {
		this.phone = i;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
