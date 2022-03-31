package task3;

public class Fish extends Animal {
    public void eat(){
        System.out.println("Fish eats other fish");
    }
    @Override
    public void walk(){
        System.out.println("A fish can't walk, it swims");
    }

    protected Fish(){
        super(Fish.legs=0);
    }

}
