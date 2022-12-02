import java.util.*;
public class Arraysum {
    public void getArray(int arr[],int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    public void displayArray(int arr[],int n) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
            
        }
        sc.close();
    }
    public int sum(int arr[],int n) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    // public int prime(int arr[],int n)
    // {
    //     int num;
    //     for(int i=0;i<n;i++)
    //     {
    //         num=arr[i];
    //         if(num<=1)
    //         {
    //             return 0;
    //         }
    //         for(int j=2;j<num;j++)
    //         {
    //             if(num%j==0)
    //             {
    //                 return num;  
    //             }
    //         }
    //     }
    //     return 0;
    // }
    
    public static void main(String[] args) {
        Arraysum obj=new Arraysum();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int arr[] =  new int[n];
        System.out.println("Enter the element of array ");
        obj.getArray(arr, n);
        obj.displayArray(arr, n);
        
        System.out.println("\nSum of Array element = "+obj.sum(arr, n));
        // System.out.println("\n"+obj.prime(arr, n));
      
        sc.close();
    }
}
