import java.util.Scanner;
class strong
{
    static int f[] = new int[10];
    static void preCompute()
    {
        f[0] = f[1] = 1;
        for (int i = 2; i<10; ++i)
            f[i] = f[i-1] * i;
    }
    static boolean isStrong(int x)
    {
        int factSum = 0;
        int temp = x;
        while (temp>0)
        {
            factSum += f[temp%10];
            temp /= 10;
        }

        return (factSum == x);
    }
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int x = s.nextInt();
        preCompute();
        if(isStrong(x))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");

}
}
