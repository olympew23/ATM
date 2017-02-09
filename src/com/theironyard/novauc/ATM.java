package com.theironyard.novauc;


import java.util.Scanner;
import java.text.NumberFormat;
import java.math.*;


public class ATM {

    public static void main(String[] args) throws Exception {
        // write your code here

        int balance = 223;
        int number = 223 - 50;
        double remainder = 110;






        System.out.println("Good Morning!");

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if (name.isEmpty()) {

            throw new Exception("Invalid Name");
        }

        System.out.println("What would you like to do today?");

        System.out.println("1. Check Balance/ 2.Withdraw Funds/ 3.Cancel");

        String prompt = scanner.nextLine();

        if (prompt.equalsIgnoreCase("1")) {

            System.out.println("Your balance is: " + balance);


        } else if (prompt.equalsIgnoreCase("2")) {

            System.out.println("Amount?");

            String amount = scanner.nextLine();
            int withdraw = Integer.valueOf(amount);

            if (withdraw > balance) {
                throw new Exception("Denied");
            } else {
                System.out.println("Please take your money");
            }


            String Please = scanner.nextLine();

            System.out.println("Deduct:" + number);

            String Deduct = scanner.nextLine();

            System.out.println("Your balance is " + remainder);

            String is = scanner.nextLine();

            System.out.println("1. Check Balance/ 2.Withdraw Funds/ 3.Cancel");

            String Check = scanner.nextLine();
        }

          else if (prompt.equalsIgnoreCase("3")) {

              System.out.println("Thank You and Please come again");

            }





            }



        }














