package practice;

import java.time.Year;
import java.util.Scanner;

public class LeapYearprogram {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the Year");
        Scanner scanner = new Scanner(System.in);
        year= scanner.nextInt();
         if (((year % 4== 0) &&(year % 100!=0)) || (year% 400 ==0)){
             System.out.println("Specified year is a leap year");


        }else {
             System.out.println("Specified year is not a leap year");
         }
    }}




















