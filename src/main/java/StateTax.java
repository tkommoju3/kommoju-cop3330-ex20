/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class StateTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("What is the order amount? ");
        double amt = Double.parseDouble(input.nextLine());
        System.out.print("What state do you live in? ");
        String state = input.nextLine();

        String ret = "";
        double tax = 0;
        if(state.equals("Wisconsin")){
            System.out.print("What county do you live in? ");
            String county = input.nextLine();
            if(county.equals("Dunn")){
                tax = 0.050;
            }
            else if(county.equals("Eau Claire")){
                tax = 0.054;
            }
            tax = Math.round((tax * amt)*100)/100.0;
            ret = "The tax is $" + tax + ".\n";
        }
        else if(state.equals("Illinois")){
            tax = 0.08;
            tax = Math.round((tax * amt)*100)/100.0;
            ret = "The tax is " + tax + ".\n";
        }

        double total = amt + tax;

        ret += "The total is $" + total + ".";

        System.out.println(ret);
    }
}

