public Class Perimeter{

public static void main(String args[]) {

int radius = 0;
Scanner in= new Scanner(System.in);
System.out.println("Please enter radius of a circle");

    radius=in.nextInt();

/*
 * where r is a radius of a circle then perimeter of a circle is
 *Area= pi * r * r
 *
 */

    double perimeter =2* Math.PI* radius;

    System.out.println("Perimeter of the circle ="+perimeter );

}
}
