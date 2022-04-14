package lab5.factory;

public abstract class Pizza {
    public void bake(){
        System.out.println("bake for 25 min at 358 C");
    }
    public void cut(){
        System.out.println("Cutting pizza in 8 slices");
    }
    public void box(){
        System.out.println("Pace pizza in a box");
    }

}
