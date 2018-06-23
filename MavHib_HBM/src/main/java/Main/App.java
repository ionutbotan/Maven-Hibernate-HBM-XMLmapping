/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.*;
import Main.*;
import Util.*;
import Entity.*;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        StudentDAO studentDAO = Factory.getInstance().getStudentDAO();
        ProjectDAO projectDAO = Factory.getInstance().getProjectDAO();
        
        
        //----------CRUD - Students--------
        
        
//        System.out.println("Adding an student...");
//        studentDAO.addStudent(new Student("Johnie", "12"));
//        
//        System.out.println("Updating an student...");
//        studentDAO.updateStudent(2,"Johh","13");
//        
//        System.out.println("Deleting an student...");
//        studentDAO.deleteStudent(studentDAO.getStudentByName("Jeremy"));
//        
        List allStudents = Factory.getInstance().getStudentDAO().getAllStudents();
        Iterator iteratorStud = allStudents.iterator();
        System.out.println("All Students from DB:");
        System.out.println("------------------------------------");
        while (iteratorStud.hasNext()) {
            Student studentActual = (Student)iteratorStud.next();
            System.out.println("ID: " + studentActual.getStudentId() + "\nName : " + studentActual.getStudentName() + "\nAge: " + studentActual.getStudentAge());
        }
        
        //----------CRUD - Projects--------
        
//        System.out.println("Adding an project...");
//        Project newProject = new Project("ff", "Spring");
//        newProject.setStudent(studentDAO.getStudentByName("Jeremy"));
//        projectDAO.addProject(newProject);
//        
//        System.out.println("Updating an project...");
//        projectDAO.updateProject(4, "Databasessss", "Autumn", studentDAO.getStudentByName("Jeremy"));
//        
//        
//        System.out.println("Deleting an project...");
//        projectDAO.deleteProject(projectDAO.getProjectByID(3));
        
        
        List allProjects = Factory.getInstance().getProjectDAO().getAllProjects();
        Iterator iteratorProj_2 = allProjects.iterator();
        System.out.println("All projects from DB:");
        System.out.println("------------------------------------");
        while (iteratorProj_2.hasNext()) {
            Project projectActual = (Project)iteratorProj_2.next();
            System.out.println("ID: " + projectActual.getProjectId() + "\nTitle : " + projectActual.getTitle() + "\nSemester: " + projectActual.getSemester()+ "\nStudent ID: " + projectActual.getStudent().getStudentId());
        }
        

    }
}
