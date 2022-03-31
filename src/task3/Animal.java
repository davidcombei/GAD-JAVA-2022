package task3;

public abstract class Animal {
protected static int legs;
protected Animal(int legs){
    this.legs=legs;
}
    abstract public void  eat();
    public void walk(int legs){
        System.out.println("Animalul foloseste "+legs+" picioare pentru a merge");
    }

    public abstract void walk();
}
