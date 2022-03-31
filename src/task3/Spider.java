package task3;

public class Spider extends Animal {
    protected Spider() {
        super(Spider.legs=8);
    }

    public void eat(){
        System.out.println("Spider eats insects");
    }
    public void walk(){
        System.out.println("Spider walks using "+Spider.legs+" legs");
    }

}
