package lab2;

import java.util.Scanner;
 class BoxingMatch{
    Fighter fighter1;
    Fighter fighter2;
    public BoxingMatch(Fighter fighter1,Fighter fighter2){
        this.fighter1=fighter1;
        this.fighter2=fighter2;
    }
    public Fighter fight(){
        while(fighter1.getHealth()>0 && fighter2.getHealth()>0){
            fighter1.attack(fighter2);
            if(fighter2.getHealth()>0){
                fighter2.attack(fighter1);
            }
            else{
                return fighter1;
            }
        }
        return fighter2;
    }
}
public class Fighter {
    String name;
    int health;
    int damagePerAttack;

    Fighter(String nume, int viata, int damage) {
        this.name = nume;
        this.health = viata;
        this.damagePerAttack = damage;
    }

    public void attack(Fighter duel) {
        duel.health = this.health - this.damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public static void main(String[] args) {
        Fighter fighter1=new Fighter("Pops",100,10);
        Fighter fighter2=new Fighter("Floyd",100,40);
        BoxingMatch bm=new BoxingMatch(fighter1,fighter2);
        Fighter winner=bm.fight();
        System.out.println("Winner= "+winner.getName());


    }

}


