package com.company;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         /*
            The letter grade is determined as follows:
            A = 90–100%
            B = 80–89%
            C = 70–79%
            D = 60–69%
            F = 0–59%

            Write a program that will print the
            letter grade based on the percentage entered.

         */
        Scanner in = new Scanner(System.in);
        String input = "";
       // do{
            System.out.println("Enter a percentage:  ");
            int pecentage = in.nextInt();
            String letterGrade = getletterGrede(pecentage);
            System.out.println(letterGrade);
            //System.out.println("To quit type q. To continue type any keyboard key.");
           // input = in.next();
        //}while (!input.equalsIgnoreCase("q"));

    }

    public static String getletterGrede(int percentage) {


      String  letterGrede = "";
      if (percentage >=90){
          letterGrede = "A";
      }else if(percentage >=80){
         letterGrede = "B";
      }else if (percentage >=70){
          letterGrede = "C";
      }else if (percentage >=60){
          letterGrede = "D";
      }else if (percentage <60){
          letterGrede = "F";
      }
     return letterGrede;


    }
}
