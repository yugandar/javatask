import java.util.Scanner;
public class circle {

       public static void main(String args[]) {
               System.out.println("Enter the radius");
               Scanner s = new Scanner(System.in);
               int r=s.nextInt();


               int area = Math.PI *r*r;
               int  perimeter=2*Math.PI *r;
              System.out.print("Area is",area);
              System.out.print("perimeter is",perimeter);


}
}
