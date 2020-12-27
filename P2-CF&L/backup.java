/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Aim: java program for creating backup file of Mysql database.
package Prac2and3;

/**
 *
 * @author Mukesh
 */
public class backup {
    public void backupDB(String path)
    { 
        String executeCmd = "C:/xampp/mysql/bin/mysqldump -u root -psa -B studentdb>" + path;
        System.out.println(executeCmd);
        Process runtimeProcess;
        try {
            runtimeProcess = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", executeCmd });
            int processComplete = runtimeProcess.waitFor();
            System.out.println(processComplete);
            if(processComplete== 0)
                {System.out.println("Backup Created Successfully !"); }
            else
                {System.out.println("Couldn't Create the backup !"); } }
        catch(Exception ex)
            {ex.printStackTrace(); } 
    }
    public static void main(String[]args)
    {
        new backup().backupDB("C:/db.sql");
    }
}
