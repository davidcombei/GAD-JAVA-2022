package task3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();
        d.eat();
        d.walk();
        c.play();
        c.eat();
        c.walk();
        a.eat();
        a.walk();
        p.setName("Thomas");
        p.play();


    }
}
