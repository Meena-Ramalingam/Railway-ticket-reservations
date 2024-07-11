import java.util.*;
public class ticketbooker {
    static int availableLowerBerths = 2;//normally 21
    static int availableMiddleBerths = 1;//normally 21
    static int availableUpperBerths = 1;//normally 21
    static int availableRacTickets = 1;//normally 18
    static int availableWaitingList = 1;//normally 10

    static Queue<Integer> waitingList=new LinkedList<>();
    static Queue<Integer> racList=new LinkedList<>();
    static List<Integer> bookedTicketList=new ArrayList<>();

    static List<Integer> lowerBerthsPositions = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
    static List<Integer> middleBerthsPositions = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
    static List<Integer> upperBerthsPositions = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
    static List<Integer> racPositions = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,71));
    static List<Integer> waitingListPositions = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
    
    static List<Integer> low=new ArrayList<>(Arrays.asList(1,2,3,4));
    static Map<Integer,passenger> passengers=new HashMap<>();

    public void bookticket(passenger p,int berth,String alloted){
        p.seatnumber=berth;
        p.alloted=alloted;
        passengers.put(p.passengerId,p);

        bookedTicketList.add(p.passengerId);
        System.out.println("----Booked Successfully");
    }

    public void addtorac(passenger p,int racInfo,String alloted){
        p.seatnumber=racInfo;
        p.alloted=alloted;

        passengers.put(p.passengerId,p);

        racList.add(p.passengerId);
         racPositions.remove(0);
         availableRacTickets--;
    }

    public void  addtowaitinglist(passenger p,int wlinfo,String alloted){
        p.seatnumber=wlinfo;
        p.alloted=alloted;
        passengers.put(p.passengerId,p);


    }



}
