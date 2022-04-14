package lab3.hiding;

public class Child extends Parent{
    public String field="Child 11";
    public static void m(){
        Parent.m();
        System.out.println("Child m method");

    }
    public void testField(){
        System.out.println("Child field "+ field+ " parent field "+super.field);
    }
}
