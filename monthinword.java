//Write a program to print month in words, based on input month in numbers


public class Main {
   public static void main(String[] args) {
    int num = Integer.parseInt("Enter any number equal to or between 1-12 to display the month");
    switch (num)
    {
    case 1:
        System.out.println ("The name of 1st month : January");
        break;
    case 2:
        System.out.println ("The name of 2nd month : February");
        break;
    case 3:
        System.out.println ("The name of 3rd month : March");
        break;
    case 4:
        System.out.println ("The name of 4th month : April");
        break;
    case 5:
        System.out.println ("The name of 5th month : May");
        break;
    case 6:
        System.out.println ("The name of  6th month : June");
        break;
    case 7:
        System.out.println ("The name of 7th month : July");
        break;
    case 8:
        System.out.println ("The name of 8th month : August");
        break;
    case 9:
        System.out.println ("The name of 9th month : September");
        break;
    case 10:
        System.out.println ("TThe name of 10th month : October");
        break;
    case 11:
        System.out.println ("TThe name of 11th month : November");
        break;
    case 12:
        System.out.println ("TThe name of 12th month : December");
        break;
        default:
            System.out.println ("You have entered an invalid number");
        }
    } 
}