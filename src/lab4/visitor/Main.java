package lab4.visitor;

public class Main {
    public static void main(String[] args) {
        Element elements[]=new Element[3];
        elements[0]=new Book(30,"title");
        elements[1]=new Song(22);
        elements[2]=new Movie(44);

        Visitor v=new TimeVisitor();


    }
}
