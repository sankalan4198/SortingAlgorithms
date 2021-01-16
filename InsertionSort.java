import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,i,temp,j;
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            temp=arr[i];
            for(j=i; j>0 && temp<arr[j-1];j--)
            {
                arr[j]=arr[j-1];
            }
            arr[j]=temp;
        }
        System.out.println("The sorted array is: ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
