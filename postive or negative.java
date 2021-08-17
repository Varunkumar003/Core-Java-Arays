//Write a program to check if a given number is Positive, Negative, or Zero. 

public class Main {
    public static void main(String[] args) {
    int a=Integer.parseInt(args[0]);
    if (a>0)
    {
        System.out.println("postive");
    }
    else if (a==0)
    {
        System.out.println("zero");
       
    }
    else
    {
        System.out.println("negative");
    }
    }
}
