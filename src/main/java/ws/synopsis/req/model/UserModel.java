package ws.synopsis.req.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModel {

	@JsonProperty
	private int id;

	@JsonProperty
	private String name;

	@JsonProperty
	private String lastname;

	@JsonProperty
	private int phone;

	@JsonProperty
	private String pass;

	public UserModel() {

	}

	public UserModel(int id, String name, String lastname, int phone, String pass) {
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

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
