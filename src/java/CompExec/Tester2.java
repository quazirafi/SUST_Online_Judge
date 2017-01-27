/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompExec;

import java.io.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author DELL
 */
public class Tester2 {
    public String compile(String l) {
        System.out.println("Code compilation started...");
        ProcessBuilder p;
         
        boolean compiled = true;
        if (l.equals("java")) {
            p = new ProcessBuilder("javac", "Main.java");
        } else if (l.equals("c")) {
            p = new ProcessBuilder("gcc","-std=c++0x","-w","-o", "Main", "Main.c");
        } else {
            p = new ProcessBuilder("g++","-std=c++0x","-w","-o", "Main", "Main.cpp");
        }
        //p.directory("./Sources");
        p.directory(new File("F:\\UploadFIles"));
        p.redirectErrorStream(true);

        try {
            Process pp = p.start();
            InputStream is = pp.getInputStream();
            String temp;
            try (BufferedReader b = new BufferedReader(new InputStreamReader(is))) {
                while ((temp = b.readLine()) != null) {
                    compiled = false;
                    System.out.println(temp);
                }
                pp.waitFor();
            }

            if (!compiled) {
                is.close();
                return "comerror";
            }
            is.close();
            return "success";

        } catch (IOException | InterruptedException e) {
            System.out.println("in compile() " + e);
        }

        return "comerror";
    }
    
    public String execute(String l, String n, long timeInMillis) {
        System.out.println("Code started executing.");
        ProcessBuilder p;
        if (l.equals("java")) {
            p = new ProcessBuilder("java", "Main");
        } else if (l.equals("c")) {
            p = new ProcessBuilder("F:\\UploadFIles\\Main");
        } else {
            p = new ProcessBuilder("F:\\UploadFIles\\Main");
        }
        p.directory(new File("F:\\UploadFIles"));
//        File in = new File("F:\\UploadFIles\\in.txt");
//        p.redirectInput(in);
        /*if(in.exists())
            System.out.println("Input file " + in.getAbsolutePath());*/
        p.redirectErrorStream(true);
        //System.out.println("Current directory " + System.getProperty("user.dir"));
        File out = new File("F:\\UploadFIles\\out.txt");

        p.redirectOutput(out);
        if(out.exists())
            System.out.println("Output file generated " + out.getAbsolutePath());
        try {

            Process pp = p.start();
             if (!pp.waitFor(timeInMillis, TimeUnit.SECONDS)) {
                return "tle";
            }
            //int a = pp.waitFor();
            int exitCode = pp.exitValue();
            System.out.println("Exit Value = " + pp.exitValue());
            if(exitCode != 0)
                return "runtimerror";
        } catch (IOException ioe) {
            System.err.println("in execute() "+ioe);
        }
        catch(Exception e){}
        System.out.println("Code execution finished!");
        //delete executables
        //deleteExecutables(l);
        return "successfully";
    }
    
    public String match(){
        BufferedReader b1 = null, b2 = null;
        File f1, f2;
        try {
            System.out.println("Matching process started.");
            f1 = new File("F:\\java codes\\CommandLineTest\\Sources\\out.txt");
            
            f2 = new File("F:\\java codes\\CommandLineTest\\Sources\\out2.txt");
            
            b1 = new BufferedReader(new FileReader(f1));
            b2 = new BufferedReader(new FileReader(f2));

            String s1 = "", s2 = "", temp = "";
            int count=0,count2=0;
            while ((temp = b2.readLine()) != null) {
                s2 += temp;        
                ++count;
            }
            //System.out.println(f2.getName() + ":\n" + s2);
            while ((temp = b1.readLine()) != null) {
                s1 += temp;
                ++count2;
            }
            //System.out.println(f1.getName() + ":\n" + s1);
            System.out.println("Matching ended.");
            /*if (userCase) {
                userOutput = s2;
            }*/
            System.out.println(count+" "+count2);
            
            if (s1.equals(s2) && count==count2) {
                return "Accepted";
            } else {
                return "Wrong";
            }

        } catch (FileNotFoundException ex) {
            System.err.println("in match() "+ex);
        } catch (IOException ex) {
            System.err.println("in match() "+ex);
        } finally {
            try {
                b1.close();
                b2.close();
            } catch (IOException ex) {
                System.err.println("in match() "+ex);
            }
        }
        return "Wrong";
        
    }
    
    
    public static void main(String args[]){
        Tester2 t = new Tester2();
        System.out.println(t.compile("cpp"));
        System.out.println(t.execute("cpp","input",1));
        System.out.println(t.match());
    }
}
