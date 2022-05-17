package com.java.spack;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentInfo {

	private String sname;
	
	private List<String> qualifiaction;
	private Set<String>  courses;
	private Map<String, String>  course_and_faculty;
	private Properties course_and_fees;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getQualifiaction() {
		return qualifiaction;
	}
	public void setQualifiaction(List<String> qualifiaction) {
		this.qualifiaction = qualifiaction;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public Map<String, String> getCourse_and_faculty() {
		return course_and_faculty;
	}
	public void setCourse_and_faculty(Map<String, String> course_and_faculty) {
		this.course_and_faculty = course_and_faculty;
	}
	public Properties getCourse_and_fees() {
		return course_and_fees;
	}
	public void setCourse_and_fees(Properties course_and_fees) {
		this.course_and_fees = course_and_fees;
	}
	
	
	
}
