package com.adnan.staticexample;
// create a class name classb
public class classb {
        String name;
        String dep;
        // static variable is not describe in the object it is only in the class template.. common to all the object.
        static long totalstudent = 0;
    // crete a parameterised constructor
     classb (String name, String dep){
        this.name = name;
        this.dep = dep;
        classb.totalstudent += 1;
    }
// getter method
   public String getName() {
        return name;
    }
 // getter method
     public String getdep() {
       return dep;
    }
    public long getpop(){
         return totalstudent;
    }
}

