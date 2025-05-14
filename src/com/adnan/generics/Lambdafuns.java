package com.adnan.generics;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdafuns {
    public static void main(String[] arg) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(i * i);
            System.out.println(arrayList);
        }
        System.out.println(arrayList);
        /// lambda function for the each element of the arraylist.
        Consumer<Integer> func = (item) -> System.out.println("item*2");
        arrayList.forEach(func);
        /// body of the abstract method..
        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation divide = (a, b) -> a / b;
        Operation multiply = (a, b) -> a * b;
        /// create the instance of the class (non-static) i.e. mycal.
        Lambdafuns mycal = new Lambdafuns();
        System.out.println(mycal.operate(12, 6, sum));
        System.out.println(mycal.operate(12, 6, sub));
        System.out.println(mycal.operate(12, 6, divide));
        System.out.println(mycal.operate(12, 6, multiply));

    }
    /// Method for the operation to perform. inside the method pass the interface as the parameter.
    private int operate(int a, int b, Operation op){
            return op.operation(a, b);
        }
    }


//    int sum(int a, int b){
//        return a+b;
//    }
///  interface for the Operation
interface Operation{
    /// abstract method.
    int operation(int a, int b);
}
