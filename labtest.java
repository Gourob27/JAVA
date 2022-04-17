///Factorial number
/*import java.util.Scanner;
public class labtest {
    public static void main(String[]args){
        int n, factorial=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Input number:");
        n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("factorial:"+factorial);

    }  
}*/
///prime number
/*import java.util.Scanner;
public class labtest {
    public static void main(String[]args){
        int n,i,count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Input number:");
        n=input.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0){
                count++;
                break;

        }
    }
        if(count==0)
        {
            System.out.println("Prime number");
        }else
        {
            System.out.println("Not a Prime number");
        }

    }

}*/

///Find summation of two matrix
/*public class labtest{
    public static void main(String[]args)
    {
        int a[][]={{2,7,6},{4,8,9},{6,8,9}};
        int b[][]={{3,5,7},{3,7,3},{4,5,7}};
        int c[][]=new int [3][3];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+ " ");
            }
            System.out.println();
        }

    }
}*/

///Find the fibonacci series
/*import java.util.Scanner;
public class labtest{
    public static void main(String[]args)
    {
        int n1=0,n2=1,n3,i,count;
        System.out.println("Input number:");
        Scanner input = new Scanner(System.in);
        count=input.nextInt();
        System.out.print(n1+" "+n2);
        for(i=2;i<count;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}*/
/// Leap year
import java.util.Scanner;
public class labtest{
    public static void main(String[]args){
        int year;
        System.out.println("YEAR:");
        Scanner input=new Scanner(System.in);
        year=input.nextInt();
        if((year%400==0)||(year%4==0)||(year%100!=0)){

            System.out.println("Leap Year");
        }else{
            System.out.println(" Not Leap Year");
        }
    }
}

