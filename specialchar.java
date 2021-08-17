//Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character“


public class Main {
    public static void main(String[] args) {
    char cha = args[0].charAt(0);
    if(cha>='a' && cha<='z') {
        System.out.println("Alphabet");
    }
        else if(cha>='0' && cha<='9') {
        System.out.println("Digit");
    }
        else
        {
            System.out.println("special character");
        }
    }
}
