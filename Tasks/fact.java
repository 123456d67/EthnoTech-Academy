import java.util.Scanner;
class Fact
 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=5;
        int fac=factorial(n);
        System.out.println(fac);    
    }
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
 }