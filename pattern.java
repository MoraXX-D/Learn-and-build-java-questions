import java.util.Scanner;

public class pattern {
    public void pattern1(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    public void pattern2(int row,int col){
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++){
                if(i>=j){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
    public void pattern3(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i>=j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
    public static void pattern4() {
        int a,b;
        int size=15;
        for(a=size/2;a<=size;a=a+2)
        {
            for(b=1;b<size-a;b=b+2)
                System.out.print(" ");
            for(b=1;b<=a;b++)
                System.out.print("A");
            for(b=1;b<=size-a;b++)
                System.out.print(" ");            
            for(b=1;b<=a-1;b++)
                System.out.print("A");
            
        System.out.println();
        }

        for(a=size;a>=0;a--)
        {
            for(b=a;b<size;b++)
                System.out.print(" ");
            for(b=1;b<=((a*2)-1);b++)
                System.out.print("B");

        System.out.println();
        }
    }
    public static void main(String[] args) {
        int row,col;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of row and column ");
        row=sc.nextInt();
        col=sc.nextInt();
        pattern obj=new pattern();
        obj.pattern1(row,col);
        obj.pattern2(row,col);
        obj.pattern3(row,col);
        obj.pattern4();
        sc.close();
    }
}
