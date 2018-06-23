/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.StudentDAO;
import DAO.ProjectDAO;

public class Factory {
    private static StudentDAO studentDAO = null;
    private static ProjectDAO projectDAO = null;
    private static Factory instance = null;
    
    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }
    
    public StudentDAO getStudentDAO(){
        if(studentDAO == null){
            studentDAO = new StudentDAO();
        }
        return studentDAO;
    }
    
    public ProjectDAO getProjectDAO(){
        if(projectDAO == null){
            projectDAO = new ProjectDAO();
        }
        return projectDAO;
    }
        
    
    
}
