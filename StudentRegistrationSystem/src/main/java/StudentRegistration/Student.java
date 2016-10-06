/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistration;

import java.util.Date;

/**
 *
 * @author Ryan
 */
public class Student 
{

    
    
   
    private String name;
    private int age;
    private Date dob;
    private long ID;
    private Program course;
    private String userName;
   
    
     public Student(String name, int age, Date dob, long ID)
    {
        
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.ID = ID;
        
       
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    
            
    
    
    public String getUserName()
    {
       
        this.userName = name + age;
        return userName;
    }
    
    
    public Program getCourse() {
        return course;
    }

    
    public void setCourse(Program course) {
        this.course = course;
    }
    
}
