package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the students KCSE points; ");

        int kcse_points = input.nextInt();

        System.out.println("Enter the students interview scores; ");

        int interview_points = input.nextInt();

        System.out.println("Enter the students Confidence level; ");

        int confidence_level = input.nextInt();

        if (kcse_points>=65 && interview_points>=6 && confidence_level>=5)
        {
            System.out.printf("%s", "STUDENT ADMITTED:\n" );

        }
        else{
            System.out.printf("%s", "STUDENT REJECTED:\n");

        }

    }
}

