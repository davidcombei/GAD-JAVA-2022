package lab1;

public class fizzbuzz {
    public static void main(String[] args) {
        int x=100;
        for(int i=0;i<=x;i++){
            if(i%3==0){
                System.out.print(" Fizz");
            }
            else if(i%5==0) {
                System.out.print(" Buzz,");

            }
            else if(i%3==0 && i%5==0){
                System.out.print(" FizzBuzz,");
            }
            else if(i%7==0){
                System.out.print(" Rizz,");
            }
            else if(i%11==0){
                System.out.print(" Jazz,");
            }
            else{
                System.out.print(" "+i);
            }
        }
    }
}
