package lab3.hiding;

public class Main {
    public static void main(String[] args) {
       int y=0;
       for(; ;){
           if(y>=10) break;
           y+=++y;
           System.out.println(y);
       }

    }
}
