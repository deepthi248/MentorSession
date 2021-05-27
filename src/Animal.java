public class Animal {
    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }

    String name;
    public void print(){
        System.out.println("AnimalParent");
    }
    public void print(String name){
        System.out.println("Animal is Parent with name :"+name);
    }

}
