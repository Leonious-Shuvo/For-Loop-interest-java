package com.leonious;

public class Main {

    public static void main(String[] args) {

//        for (int i = 2; i<9 ; i++){
//            System.out.println("10000 at " + i + "% interest is =" + String.format("%.2f",calculateInterest(10000.0,i)));


            System.out.println("******************");
            for (int i = 8; i>=2 ; i--){
                System.out.println("10000 at " + i + "% interest is =" + String.format("%.2f",calculateInterest(10000.0,i)));
        }



        }

        public static double calculateInterest(double amount, double rate){
              double interestRate = (amount*(rate/100));
              return interestRate;
    }
}
