package info.ganesh.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import info.ganesh.domain.Affiliate;
import info.ganesh.domain.Employee;
import info.ganesh.domain.User;

public class UserMother {
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public static User normalUser() {
		try {
			return new User(1, "Normal User",dateFormat.parse("2018-10-10"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static User loyalUser() {
		try {
			return new User(1, "Loyal User", dateFormat.parse("2009-10-20"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static User employeeForMoreThan2Years() {
		try {
			return new Employee(1, "Loyal User", dateFormat.parse("2009-10-20"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static User affiliate() {
		try {
			return new Affiliate(1, "Affiliate User", dateFormat.parse("2009-10-20"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
