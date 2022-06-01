package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	//변수
	private String school_name;
	private LocalDate school_establishment;
	private String school_address;
	private String school_tel;
	
	//기본 생성자
	public School() {
		// TODO Auto-generated constructor stub
	}
	
	//전체 생성자
	public School(String school_name, LocalDate school_establishment, String school_address, String school_tel) {
		super();
		this.school_name = school_name;
		this.school_establishment = school_establishment;
		this.school_address = school_address;
		this.school_tel = school_tel;
	}

	//getter , setter
	public String getSchool_name() {
		return school_name;
	}


	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}


	public LocalDate getSchool_establishment() {
		return school_establishment;
	}


	public void setSchool_establishment(LocalDate school_establishment) {
		this.school_establishment = school_establishment;
	}


	public String getSchool_address() {
		return school_address;
	}


	public void setSchool_address(String school_address) {
		this.school_address = school_address;
	}


	public String getSchool_tel() {
		return school_tel;
	}


	public void setSchool_tel(String school_tel) {
		this.school_tel = school_tel;
	}

	//hashCode()
	@Override
	public int hashCode() {
		return Objects.hash(school_address, school_establishment, school_name, school_tel);
	}

	//equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(school_address, other.school_address)
				&& Objects.equals(school_establishment, other.school_establishment)
				&& Objects.equals(school_name, other.school_name) && Objects.equals(school_tel, other.school_tel);
	}

	//toString()
	@Override
	public String toString() {
		return "School [school_name=" + school_name + ", school_establishment=" + school_establishment
				+ ", school_address=" + school_address + ", school_tel=" + school_tel + "]";
	}
	
	
	
	
	
	
}
