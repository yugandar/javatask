class employee{
    int empid;
    String address;
    String city;
    String state;
void insertRecord(int e, String a,String c,String s){
 empid=e;
 address =a;
 city = c;
 state = s;
}
void displayInformation(){
  System.out.println(empid+" "+address +""+city+""+state);
}

class Employee{
public static void main(String args[]){
 Employee s1=new employee();
 Employee s2=new employee();
 s1.insertRecord(1,"katchur","Tiruvallur","TN");
 s2.insertRecord(2,"dellu","madurai","TN");
 s1.displayInformation();
 s2.displayInformation();
}
}
}
