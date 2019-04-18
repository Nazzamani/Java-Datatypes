import java.util.*;
import java.io.*;
/* When an integer is signed, one of its bits becomes the sign bit, meaning that the maximum magnitude
of the number is halved. (So an unsigned 32-bit int can store up to 2^32-1, whereas its signed counterpart
has a maximum positive value of 2^31-1.) */
//In Java, all integer types are signed (except char).

class Solution{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of test cases");
        int t=sc.nextInt();
        System.out.println("Enter your test cases");
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                // A switch does not work with long
                if(x>=-128 && x<=127)
                    System.out.println("* byte" + "\n" + "* short" + "\n" + "* int" + "\n" + "* long");
                else if(x>=-32768 && x<=32767)
                    System.out.println("* short" + "\n" + "* int" + "\n" + "* long");
                else if(x>=-2147483648 && x<=2147483647)
                    System.out.println("* int" + "\n" + "* long");
                //long literals in Java end with an "L": 600851475143L
                else if(x>=-9223372036854775808L && x<=9223372036854775807L)
                    System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}



