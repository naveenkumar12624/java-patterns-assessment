import java.util.Scanner;
public class Q2 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
                System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)
                System.out.print("*");

            System.out.println();
        }

    }
}
