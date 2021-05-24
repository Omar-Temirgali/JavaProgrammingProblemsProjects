import java.util.*;
public class triangular
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N=input.nextInt();
        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}