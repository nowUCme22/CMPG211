import java.util.*;
class SortTest 
{
	public static void main(String[] args) 
	{
		int [] data = new int[20000000];
		Scanner input = new Scanner(System.in);
		boolean sorted = true;
		int i=-1;
		int num;
		
		long time0=System.currentTimeMillis();      
		while (input.hasNextInt())
		{
			data[++i] = input.nextInt();
		}
		num = i++;
		long time1=System.currentTimeMillis();      
		System.out.println("Finished reading data, time to read data = "+(time1-time0)/1000.0+" seconds");
		
		//call method
		quickSort(data,0,num-1);

		long time2=System.currentTimeMillis();
		System.out.println("\nFinished sorting data, time to sort data = "+(time2-time1)/1000.0+" seconds");
		
		i=1;
		while (i<num && sorted)
		{
			if (data[i]<data[i-1])
			sorted = false;
			i++;
		}
		if(sorted)
			System.out.println("Sorted");
		else
			System.out.println("Not sorted");
				
	}
	
	//create own sort method
	public static void quickSort(int arr[], int low, int high)
	{
		if (low < high)//check if there is atleast 2 elements to sort
		{
			int pi = partition(arr, low, high); //partition array to get the pivot index
			quickSort(arr, low, pi-1); //sort elements before pivot
			quickSort(arr, pi+1, high); //sort elements after index
		}
	}
	
	public static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high]; //choose the last element as the pivot
		int i = (low-1);//index of smaller element
		for(int j = low; j< high; j++)
		{
			if(arr[j] <= pivot)//if current element is smaller or equal
			{
				i++; //increment index
				//swap array
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//swap arrays
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1; //return index of the pivot
		
	}
}