package lab4.visitor;

public class Song implements Element{
private int time;

    public Song(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
