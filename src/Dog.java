public class Dog extends Animal {
    String name;
    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void print(){
        super.print();
        System.out.print("Dog it is!!");
    }
    public String toString(){
     return name;
    }

}
