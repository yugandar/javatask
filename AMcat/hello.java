class hello{
  public static void main(String[] args)
{
   int n=5,num;

   num=1;
   int l=1;
   int k=num;
   for(int i=1;i<=n;i++)
   {
     k=num-1;

       for(int j=1;j<=num;j++)
       {

           if(j%2==0)
           System.out.print("*");
           else
           {
               if(i%2==0)
               {

               System.out.print(k+l-num+i);
               l++;
               k=k-2;
               }

              else
               System.out.print(l++);
           }
       }
       num=num+2;//the loop is going on as a prime number 1,3,5,7
       System.out.print("\n");
   }
   return;
}
}
