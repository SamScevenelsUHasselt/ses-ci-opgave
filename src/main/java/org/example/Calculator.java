package org.example;

public class Calculator {
    public static void main(String[] args)
    {
        if(args.length==2) {
            System.out.println(calc(Integer.parseInt(args[0]) , Integer.parseInt(args[1])));
        }
        else {
            System.out.println("Run with 2 int arguments!!!");
        }
    }

    public static int calc(int a, int b){
        return a+b;
    }
}