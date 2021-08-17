//Write a program to accept gender ("Male" or "Female"), Amount (1 to 10,00,000) and age (1-120) from command line arguments and //print the percentage of interest based on the given conditions.


public class main {
    public static void main(String[] args) {
    char ch = args[0].charAt(0);
    int age= Integer.parseInt(args[1]);
    if(ch=='f' && (age>=1 && age<=58)) {
    System.out.println("8.2%");
    }
    else if(ch=='f' && (age>=59 && age<=120))
    {
        System.out.println("7.6%");
    }
        else if(ch=='m' && (age>=61 && age<=120)){
            System.out.println("8.3%");
        }   
        else if(ch=='m' && (age>=1 && age<=60)){
        System.out.println("9.2%");
        }
        else{
        System.out.println("Invalid input");
        }
    }
}