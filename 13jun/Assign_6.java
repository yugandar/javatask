import java.util.Scanner;

public class Assign_6 {

    public static void main(String[] args){

        int num,number,sum=0,factor;

        System.out.print("Enter Number");
        Scanner keyboard = new Scanner (System.in);

        number=keyboard.nextInt();

        for (num=1;num<number;num++){
            for(factor=1;factor<number;factor++){
                if(num%factor==0){
                    sum= sum+factor;
                }
                if(sum==num){
                    System.out.println(sum);
                }
                sum=0;
            }

        }
    }
}
