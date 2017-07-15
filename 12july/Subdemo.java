public Class Subdemo extends SuperDemo{
int a,b;
void disply(){

super.a=10;
super.b=20;

System.out.println(a);
System.out.println(b);
System.out.println(super.a);
System.out.println(super.b);

}

public static void main (String args[]) {
 Subdemo obj= new Subdemo();

obj.a=1;
obj.b=2;

obj.disply();



}
}
