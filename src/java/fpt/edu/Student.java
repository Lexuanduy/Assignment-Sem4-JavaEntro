/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.edu;

/**
 *
 * @author Admin
 */
public class Student {
    private String studentCode;
    private String fullName;
    private String gender;
    private String birthDay;
    private String phoneNumber;
    private String className;
    private transient boolean editable;

    public Student(String studentCode, String fullName, String gender, String birthDay, String phoneNumber, String className) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.className = className;
    }

    public Student() {
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public String getBirthYear(){
        String[] parts = birthDay.split("/");
        return parts[2];
    }
    
   
    
}
