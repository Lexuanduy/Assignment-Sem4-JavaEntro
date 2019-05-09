/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.edu;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Admin
 */
@ManagedBean(name = "students")
@RequestScoped
public class DataTable {

    public Student currentStudent = new Student();

    
    public Student studentAdd = new Student();

    public List<Student> studentList;
    public String searchString;

    

    @PostConstruct
    public void init() {
        List<Student> studentsList = new ArrayList<>();
        if (studentList == null) {
            studentsList.add(new Student("S1", "Xuan Duy", "Male", "2/07/1995", "091353191", "T001"));
            studentsList.add(new Student("S2", "Minh", "Female", "28/06/1998", "091354191", "T002"));
            studentsList.add(new Student("S3", "Chien", "Male", "28/04/1997", "091355191", "T003"));
            studentsList.add(new Student("S4", "Phuoc", "Female", "28/02/1996", "091362191", "T004"));
            studentsList.add(new Student("001", "phuoc", "male", "20-1-1995", "0989339277", "T005"));
            studentsList.add(new Student("002", "nam", "male", "2-8-1999", "01828326721", "T006"));
            studentsList.add(new Student("003", "minh", "male", "9-12-1997", "09728912847", "T007"));
            studentsList.add(new Student("004", "tuan", "male", "9-10-1996", "097289128291", "T008"));
            studentsList.add(new Student("005", "tung", "male", "29-5-1998", "097289128111", "T009"));
            studentsList.add(new Student("006", "phuc", "male", "14-7-1998", "03328672121", "T010"));
            studentsList.add(new Student("007", "duy", "male", "7-10-1996", "033432982673", "T011"));
            studentsList.add(new Student("008", "vu", "male", "7-11-1994", "0989999278", "T012"));
            studentList = studentsList;
        }

    }

    public List<Student> getStudentList() {

        if (searchString == null) {
            searchString = "";
        }
        List<Student> result = new ArrayList<>();

        for (Student s : studentList) {
            if (s.getStudentCode().contains(searchString) || s.getBirthYear().contains(searchString)) {
                result.add(s);
            }
        }
//        studentList = result;
        return result;
    }
    
    public void getDetailStudent(Student s){
        currentStudent = s;
        System.out.println(s.toString());
        FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "detail.xhtml");
    }

    public void addStudent() {

        studentList.add(studentAdd);
        FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "index.xhtml");

    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
    
    public Student getCurrentStudent() {
        return currentStudent;
    }

    public void setCurrentStudent(Student currentStudent) {
        this.currentStudent = currentStudent;
    }
    public Student getStudentAdd() {
        return studentAdd;
    }

    public void setStudentAdd(Student studentAdd) {
        this.studentAdd = studentAdd;
    }

}
