import java.util.Scanner;
class hollowdiamond{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Please enter the number of rows : ");
    a=sc.nextInt();
    for(int i=1;i<=a;i++){
        int l=a;
        while(l>i){
            System.out.print(" ");
            l--;
        }
        int k=0;
        if(i<=2){
            while(k!=i){
                System.out.print(" *");
                k++;
            }
        }
        else{
            System.out.print(" *");
            int m=1;
            while(m<i){
                System.out.print("  ");
                m++;
            }
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=a-1;i>=1;i--){
        int l=a-i;
        while(l!=0){
            System.out.print(" ");
            l--;
        }
        int k=0;
        if(!(i>2)){
            if(i==2){
                System.out.print(" *  *");
            }
            if(i==1){
                System.out.print(" *");
            }
        }
        else{
            int g=0;
            System.out.print("*");
            while(g<i){
                System.out.print("  ");
                g++;
            }
            System.out.print("*");
        }
        System.out.println();
    }

}
}
