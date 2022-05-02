package DesignPatternsChallenges.Proxy;




public class RealEstateAgentProxy {
    void represent(Apartament apartament){
        String locatione= apartament.location;
        int value= apartament.monthlyRentCost;
        apartament.setLocation(locatione);
        apartament.setMonthlyRentCost(value);

    }
    Apartament rent(Student student){
      Apartament ap= new Apartament();
      Apartament apreal=new Apartament(ap.location,ap.monthlyRentCost);
      student=new Student(student.name, student.money);
        if(student.money>ap.monthlyRentCost && student.name.charAt(0)!='P'){
                   return apreal;
        }
        return null;
    }
}
