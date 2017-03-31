package camt.cbsd.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Dto on 3/11/2017.
 */
@JsonIgnoreProperties(value="true")
public class Student {
	long id;
	String studentId;
	String name;
	String surname;
	double gpa;
	String image;
	boolean feature;
	int penAmount;
	String description;

	public Student() {}

	public Student(long id, String studentId, String name, String surname, double gpa, String image, boolean feature, int penAmount, String description) {
		this.id = id;
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
		this.gpa = gpa;
		this.image = image;
		this.feature = feature;
		this.penAmount = penAmount;
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;

		if (id != student.id) return false;
		if (Double.compare(student.gpa, gpa) != 0) return false;
		if (feature != student.feature) return false;
		if (penAmount != student.penAmount) return false;
		if (studentId != null ? !studentId.equals(student.studentId) : student.studentId != null) return false;
		if (name != null ? !name.equals(student.name) : student.name != null) return false;
		if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
		if (image != null ? !image.equals(student.image) : student.image != null) return false;
		return description != null ? description.equals(student.description) : student.description == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = (int) (id ^ (id >>> 32));
		result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		temp = Double.doubleToLongBits(gpa);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + (image != null ? image.hashCode() : 0);
		result = 31 * result + (feature ? 1 : 0);
		result = 31 * result + penAmount;
		result = 31 * result + (description != null ? description.hashCode() : 0);
		return result;
	}

	public long getId() {
		return id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isFeature() {
		return feature;
	}

	public void setFeature(boolean feature) {
		this.feature = feature;
	}

	public int getPenAmount() {
		return penAmount;
	}

	public void setPenAmount(int penAmount) {
		this.penAmount = penAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(long id) {

		this.id = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}