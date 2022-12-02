import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int arr[] =  new int[n];
        System.out.println("Enter the element of array ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
            
        }
        sc.close();
    }
    
}
