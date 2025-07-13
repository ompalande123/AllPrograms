package org.myTestingCompany;

public class Fibonacci {

    public static void main(String args[])
    {
        int num1=0;
        int num2=1;
        int nextNum=0;

//        System.out.println(num1);
        for(int i=0;i<15;i++)
        {
            nextNum=num1+num2;
            if(nextNum<=100) {
                System.out.println(nextNum);
            }
            num1=num2;
            num2=nextNum;

        }
    }
}
