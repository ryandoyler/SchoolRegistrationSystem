/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistration;

import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author User
 */
public class Program {
    
    private String courseName;
    private List<Module> moduleList;
    private DateTime startDate;
    private DateTime endDate;
    
    public Program(String courseName, List<Module> moduleList, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.moduleList = moduleList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    
}
