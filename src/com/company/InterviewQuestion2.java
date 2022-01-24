package com.company;

public class InterviewQuestion2 {

    public static void main(String[] args) {
	// Print 1 to 100 without using any loop
        printNumber(1);
    }

    public static void printNumber(int num){
        if(num <=100){
            System.out.println(num);
            num+=1;
            printNumber(num);
        }
    }
}
