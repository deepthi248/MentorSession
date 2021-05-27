public class DemoForAnimal extends Dog{

    public static void main(String[] args){

       Animal animal = new Animal();
        Dog dog = new Dog();

        animal.print();
        dog.print();
        System.out.println();

        animal.print("Mammal");
        Dog dog_2 = new Dog("Groot");
        System.out.print(dog_2);

    }
}
