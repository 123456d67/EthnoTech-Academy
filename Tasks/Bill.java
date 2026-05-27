// electricity bill 
import java.util.Scanner;
class ElectricityBill
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill = 0;
        if (units <= 250)
        {
            bill = 0;
        } 
        else if (units <= 300) 
        {
            bill = 50; 
        } 
        else if (units <= 350) 
        {
            bill = 100; 
        } 
        else 
        {
            bill = 150; 
        }
        System.out.println("Bill:" + bill);
    }
}