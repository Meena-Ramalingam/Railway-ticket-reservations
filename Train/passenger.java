public class passenger {
    static int id=1;
    String name;
    int age;
    String berthPreference;
    int passengerId;
    String alloted;
    int seatnumber;
public passenger(String name,int age,String berthPreference){
    this.name=name;
    this.age=age;
    this.berthPreference=berthPreference;
    this.passengerId=id++;
    alloted="";
    seatnumber =-1;
}
}
