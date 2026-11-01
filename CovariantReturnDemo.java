class Animal {
    Animal getAnimal() {
        System.out.println("This is an Animal");
        return this;
    }
}

class Dog extends Animal {
    @Override
    Dog getAnimal() {   // Covariant return type (Dog is subclass of Animal)
        System.out.println("This is a Dog");
        return this;
    }
}

public class CovariantReturnDemo {
    public static void main(String[] args) {
        
        Animal obj1 = new Animal();
        obj1.getAnimal();
        
        Animal obj2 = new Dog();  
        obj2.getAnimal();
    }
}