package info.ganesh.domain;

import java.util.Date;

public class User {
	private long id;
	private String name;
	private Date registeredDate;

	public User(long id, String name, Date registeredDate) {
		super();
		this.id = id;
		this.name = name;
		this.registeredDate = registeredDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

}
