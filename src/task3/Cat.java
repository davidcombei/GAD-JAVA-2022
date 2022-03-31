package task3;

public class Cat extends Animal implements Pet {


    protected String name;

    protected Cat(String name){
        super(Cat.legs=4);
        this.name=name;

    }

    protected Cat() {
        this(" ");
    }
    public void eat(){
        System.out.println("Cat eats fish");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void play(){
        System.out.println("Animal playing is : "+getName());
    }
    public void walk(){
        System.out.println("Cat walks using "+Cat.legs+" legs");
    }



}
