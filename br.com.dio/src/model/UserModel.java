package model;

import java.time.LocalDate;
import java.util.Objects;

public class UserModel {

	private long id;
	private String name;
	private String email;
	private LocalDate Birthday;
	
	
	public UserModel(long id, String name, String email, final LocalDate birthday) {
		this.id = id;
		this.name = name;
		this.email = email;
		Birthday = birthday;
	}
	
	
	public UserModel() {
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthday() {
		return Birthday;
	}
	public void setBirthday(LocalDate birthday) {
		Birthday = birthday;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Birthday, email, id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		return Objects.equals(Birthday, other.Birthday) && 
				Objects.equals(email, other.email) && 
				id == other.id	&& 
				Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", email=" + email + ", Birthday=" + Birthday + "]";
	}
	
	
}
