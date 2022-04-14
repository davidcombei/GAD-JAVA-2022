package lab4.builder;

public class Main {
    public static void main(String[] args) {
         Helicopter.Builder builder=new Helicopter.Builder("H123");

         builder.setColor("RED").setMaxHight(22).setMaxSpeed(33).setType(HelicopterTypes.ATTACK).setWeight(34);

         Helicopter helicopter= builder.build();

         System.out.println(builder.toString());

    }
}
