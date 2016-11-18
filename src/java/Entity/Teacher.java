/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author DANA
 */
public class Teacher {
   private String codeName;
   private String password;
   int id;

    public String getTeacherCodeName() {
        return codeName;
    }

    public void setTeacherCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     public int getTeacherId()
      {
          
          return id;
      }
     public void setTeacherId(int id)
     {
         this.id=id;
         
     }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
   private String fullName;
}
