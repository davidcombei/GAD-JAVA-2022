package DesignPatternsChallenges.Proxy;

public class Main {
    public static void main(String[] args) {
        Apartament app01=new Apartament("Crangasi01",300);
        Apartament app02=new Apartament("Crangasi01",600);
        Apartament app03=new Apartament("Crangasi01",350);
        Apartament app04=new Apartament("Crangasi01",400);
        Apartament app05=new Apartament("Crangasi01",200);
        RealEstateAgentProxy proxy=new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);
        Student student01=new Student("Ionescu",500);
        Student student02=new Student("Popescu",330);
        Apartament apartamentForStudent01   =proxy.rent(student01);
        System.out.println(student01+ " rented "+apartamentForStudent01);
        Apartament apartamentForStudent02=proxy.rent(student02);
        System.out.println(student02+ " rented "+apartamentForStudent02);


    }
}
