package com.examle.demo.entity;

public class student {
 int rollNumber;
 String studentName;
 double markScored;
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public double getMarkScored() {
	return markScored;
}
public void setMarkScored(double markScored) {
	this.markScored = markScored;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScored=" + markScored + "]";
}
public student(int rollNumber, String studentName, double markScored) {
	super();
	this.rollNumber = rollNumber;
	this.studentName = studentName;
	this.markScored = markScored;
}
} 
