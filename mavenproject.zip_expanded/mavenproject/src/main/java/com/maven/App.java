package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();

        // test saveStudent
        Student student =new Student();
        Student student12 = new Student();
        Student student13 = new Student();
        //Add values
        student.setFirstName("Priyanka");
        student.setLastName("Prajapati");
        student.setEmail("priyanka@gmail.com");
        
        student12.setFirstName("Priti");
        student12.setLastName("Thube");
        student12.setEmail("priti12@gmail.com");
        
        student13.setFirstName("Aarti");
        student13.setLastName("Thube");
        student13.setEmail("rutu12@gmail.com");
        
        
        //passing value in parameterized constructor
        studentDao.saveStudent(student);

        
        // test updateStudent
        student.setFirstName("Manju");
        studentDao.updateStudent(student);
        student12.setFirstName("Rani");
        studentDao.updateStudent(student12);
        student13.setFirstName("Rani");
        studentDao.updateStudent(student13);
        
        // test getStudentById
        //Student student2 = studentDao.getStudentById(student.getId());

        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        System.out.println("List of the students:"); 
        students.forEach(student2 -> System.out.println("Student Id:"+student2.getId()+"    " +"Name:"+student2.getFirstName()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteStudent
        //studentDao.deleteStudent(1);

    }
    }



