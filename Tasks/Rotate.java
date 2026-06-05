import java.util.*;
public class Rotate 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        for(int i=0;i<k;i++)
        {
            int temp=arr[n-1];
            for(int j=n-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        for(int l=0;l<n;l++)
        {
            System.out.print(arr[l]+" ");
        }   
    }
    
}
