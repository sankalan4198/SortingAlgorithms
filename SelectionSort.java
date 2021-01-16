import java.util.Scanner;
public class SelectionSort {
    public static void main(String args[])
    {
        int n,i,j,min;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements: ");

        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(i=0;i<n-1;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("The sorted array is: ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
