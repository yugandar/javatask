class Animal {
	int health = 100;
}

class Mammal extends Animal {
 }

class Cat extends Mammal {
 }

class Dog extends Animal {
 }
 class horse extends Animal{

 }

public class upcast {
	 public static void main(String[] args) {
		 Cat c = new Cat();
     System.out.println(c);
     Mammal m = c; // upcasting
     System.out.println(m);
	 }
}
