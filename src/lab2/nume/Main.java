package lab2.nume;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);
        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2000 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});
        Film film1 = new Film(1990, "film cu actori de Oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2000, actorOscar2010, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});
        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
        Studio[] studioDataBase = new Studio[]{studio1, studio2};

           for(int i=0;i< studioDataBase.length;i++){

               if(studioDataBase[i].filme.length>2){
                   System.out.println("Studioul cu mai mult de 2 filme este :" +studioDataBase[i].nume);
               }
           }
           for(int i=0;i< studioDataBase.length;i++){
               for(int j=0;j< studioDataBase[i].filme.length;j++) {
                   for (int k = 0; k < studioDataBase[i].filme[j].actori.length; k++) {
                       if (studioDataBase[i].filme[j].actori[k].nume.contains("actor cu 2 oscaruri")) {
                           System.out.println("Studioul cu actorul cu 2 oscaruri este :" + studioDataBase[i].nume);
                       }
                   }
               }
           }
        System.out.println("Filmele care au actori cu varsta mai mare de 50 de ani sunt: ");
           for(int i=0;i<studioDataBase.length;i++){
               for(int j=0;j<studioDataBase[i].filme.length;j++){
                   for(int k=0;k<studioDataBase[i].filme[j].actori.length;k++){
                       if(studioDataBase[i].filme[j].actori[k].varsta>50){
                           System.out.println(studioDataBase[i].filme[j].nume);
                       }
                   }
               }
           }



    }
}