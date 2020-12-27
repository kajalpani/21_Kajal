/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prac2and3;

/**
 *
 * @author Mukesh
 */
public class Restore {
    public void restoreDB(String path)
    {
        String executeCmd = "C:/xampp/mysql/bin/mysql -u root -psastudentdb<" + path;
        System.out.println(executeCmd);
        Process runtimeProcess;
        try {
            runtimeProcess = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", executeCmd });
            int processComplete = runtimeProcess.waitFor();
            System.out.println(processComplete);
            if(processComplete == 0)
                {System.out.println("Restored the Backup !"); }
            else
                {System.out.println("Couldn't Restore the backup !"); } 
        }
        catch(Exception ex)
        {ex.printStackTrace(); } 
    }
    public static void main(String[]args)
    {
        new Restore().restoreDB("C:/db.sql"); 
    }
}
