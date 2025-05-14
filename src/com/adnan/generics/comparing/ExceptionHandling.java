package com.adnan.generics.comparing;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        try {
            divide(a, b);
         /// catch can be multiple.
        } catch (Exception e) {
            System.out.println(e.getMessage());
         /// finally can't be multiple.
        } finally {
            System.out.println("this will always execute");
        }
    }

   public static void divide(int a, int b) throws ArithmeticException {
        if(b==0){
              throw new ArithmeticException("please don't divide by the zero");
        }
   }
}
