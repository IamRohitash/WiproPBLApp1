package flowControl;

public class Q5 {
	public static void main(String[] args)
    {
        char char1='$';
        
        if(char1>=65&&char1<=90 || char1>=97&&char1<=122)
        {
            System.out.println("Alphabet");
        }
        else if(char1>=48&&char1<=57)
        {
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }

}
