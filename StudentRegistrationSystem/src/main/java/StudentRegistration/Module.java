/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistration;

import java.util.List;

/**
 *
 * @author User
 */
public class Module {
    
    private String moduleName;
    private String ID;
    private List<Student> studentList;

    public Module(String moduleName, String ID, List<Student> studentList) {
        this.moduleName = moduleName;
        this.ID = ID;
        this.studentList = studentList;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
    
    
    
}
