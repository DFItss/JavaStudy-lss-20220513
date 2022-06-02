package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	
	private String schoolName;
	private LocalDate schoolAnniversary;
	private int grade;
	private int NumberOfStudent;
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public School(String schoolName, LocalDate schoolAnniversary, int grade, int numberOfStudent) {
		super();
		this.schoolName = schoolName;
		this.schoolAnniversary = schoolAnniversary;
		this.grade = grade;
		NumberOfStudent = numberOfStudent;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public LocalDate getSchoolAnniversary() {
		return schoolAnniversary;
	}
	public void setSchoolAnniversary(LocalDate schoolAnniversary) {
		this.schoolAnniversary = schoolAnniversary;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getNumberOfStudent() {
		return NumberOfStudent;
	}
	public void setNumberOfStudent(int numberOfStudent) {
		NumberOfStudent = numberOfStudent;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(NumberOfStudent, grade, schoolAnniversary, schoolName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return NumberOfStudent == other.NumberOfStudent && grade == other.grade
				&& Objects.equals(schoolAnniversary, other.schoolAnniversary)
				&& Objects.equals(schoolName, other.schoolName);
	}
	
	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolAnniversary=" + schoolAnniversary + ", grade=" + grade
				+ ", NumberOfStudent=" + NumberOfStudent + "]";
	}
	
	
}
