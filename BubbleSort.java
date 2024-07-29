import java.util.Scanner;
public class BubbleSort {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements: ");

        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        BubbleSort bs= new BubbleSort();
        bs.sort(arr,n);
        System.out.println("The sorted arrays is: ");

        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void sort(int arr[], int n)
    {
        int r,i,temp;
        for(r=1;r<=n-1;r++)
        {
            for(i=0;i<=n-1-r;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}

---------------------------------------------------------------------------------------

    public class BubbleSort {

    public static void main(String args[])
    {
        int arr[]={2,5,63,6,88};
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
