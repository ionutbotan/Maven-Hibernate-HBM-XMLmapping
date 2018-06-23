/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.HashSet;
import java.util.Set;

public class Student implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer studentId;
	private String  studentName;
	private String  studentAge;
	private Set<Project>  studentProjects = new HashSet<Project>(0);

	public Student() {
	}

	public Student(String studentName, String studentAge) {
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public Set<Project> getStudentProjects() {
		return studentProjects;
	}

	public void setStudentProjects(Set<Project> studentProjects) {
		this.studentProjects = studentProjects;
	}

}