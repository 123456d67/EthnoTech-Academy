
class Temperature
{
    public static void main(String args[])
    {
        System.out.println("\n=====Temperatures======");
        int arr[]={32,45,28,30,31,29, 27,33,34,36,38,40,41,39,37,35,34,32,31,30,29,28,27,26,25,24,23,22,21,20};
        int highest=arr[0];
		int lowest=arr[0];
		int avg=0;
		int hotest=arr[0];
		int hotestCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=highest)
			{
				highest=arr[i];
			}
			else if(arr[i]<=lowest)
			{
				lowest=arr[i];
			}
			else if(hotest>=arr[i])
			{
				hotestCount+=1;
			}
			else
			{
				int tot=0;
				tot+=arr[i];
				avg=tot/arr.length;
			}
		}
		System.out.println("Highest Temp: "+highest);
		System.out.println("lowest Temp: "+lowest);
		System.out.println("avg Temp: "+avg);
		System.out.println("hotestCount Temp: "+hotestCount);
		
	}
}