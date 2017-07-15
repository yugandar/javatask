class Animal {
	int health = 100;
}

class Mammal extends Animal {
 }

class Cat extends Animal {
 }

class Dog extends Animal {
 }
 class horse extends Animal{

 }

public class Animaltest {
	 public static void main(String[] args) {
		 Cat c = new Cat();
		 System.out.println(c.health);
		 Dog d = new Dog();
		 System.out.println(d.health);
		 horse h = new horse();
		 System.out.println(h.health);
	 }
}
