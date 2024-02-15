class Animal {
  public void makeSound() {
    System.out.println("Grr...");
  }
}
//Al no declarar los métodos como estaticos, lo métodos pertenecen a los objetos

class Cat extends Animal {
  public void makeSound() {
    System.out.println("Meow");
  }
}

class Dog extends Animal {
  public void makeSound() {
    System.out.println("Woof");
  }
}

class mainSolution {
  public static void main(String[] args) {
    Animal a = new Dog();
    Animal b = new Cat();
    a.makeSound();
    b.makeSound();
  }
}


