package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
private int studentId;
private String studentName;
private long contact;
//public int getStudentId() {
//	return studentId;
//}
//public void setStudentId(int studentId) {
//	this.studentId = studentId;
//}
//public String getStudentName() {
//	return studentName;}


//public void setStudentName(String studentName) {
//	this.studentName = studentName;
//}
//public long getContact() {
//	return contact;
//}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", contact=" + contact + "]";
}
@Autowired
public Student(int studentId, String studentName, long contact) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.contact = contact;
}
//public void setContact(long contact) {
//	this.contact = contact;
//}
}
