import java.util.*;
public class Main {
    public static void bookticket(passenger p){
        ticketbooker booker=new ticketbooker();
        if(ticketbooker.availableWaitingList==0){
            System.out.print("No tickets available");
            return;

        }
           if((p.berthPreference.equals("L") && ticketbooker.availableLowerBerths > 0 )||
        (p.berthPreference.equals("M") && ticketbooker.availableMiddleBerths > 0) ||
        (p.berthPreference.equals("U") && ticketbooker.availableUpperBerths > 0))
        {
            
                System.out.println("Preferred berth available");
                if(p.berthPreference.equals("L")){
                    System.out.println("Lower berth provided");
                    booker.bookticket(p,(ticketbooker.lowerBerthsPositions.get(0)),"L");

                    ticketbooker.lowerBerthsPositions.remove(0);
                    ticketbooker.availableLowerBerths--;
                      
                }
                else if(p.berthPreference.equals("M")){
                    System.out.println("Middle berth alloted");
                    booker.bookticket(p,(ticketbooker.middleBerthsPositions.get(0)),"M");
                     ticketbooker.middleBerthsPositions.remove(0);
                     ticketbooker.availableMiddleBerths--;

                    }

                else if(p.berthPreference.equals("U"))
                    {
                        System.out.println("Upper Berth Given");
                        //call booking function in the TicketBooker class
                        booker.bookticket(p,(ticketbooker.upperBerthsPositions.get(0)),"U");
                        //remove the booked position from available positions and also decrease available seats of that
                        // particular type
                        ticketbooker.upperBerthsPositions.remove(0);
                        ticketbooker.availableUpperBerths--;
                    }
                }

                else if(ticketbooker.availableLowerBerths>0){
                    System.out.println("lower given");
                    booker.bookticket(p,(ticketbooker.lowerBerthsPositions.get(0)),"L");
                    ticketbooker.lowerBerthsPositions.remove(0);
                    ticketbooker.availableLowerBerths--;
                }
                else if(ticketbooker.availableMiddleBerths > 0)
        {
            System.out.println("Middle Berth Given");
            //call booking function in the TicketBooker class
            booker.bookticket(p,(ticketbooker.middleBerthsPositions.get(0)),"M");
            //remove the booked position from available positions and also decrease available seats of that
            // particular type
            ticketbooker.middleBerthsPositions.remove(0);
            ticketbooker.availableMiddleBerths--;

        }
        else if(ticketbooker.availableUpperBerths > 0)
        {
            System.out.println("Upper Berth Given");
            //call booking function in the TicketBooker class
            booker.bookticket(p,(ticketbooker.upperBerthsPositions.get(0)),"U");
            //remove the booked position from available positions and also decrease available seats of that
            // particular type
            ticketbooker.upperBerthsPositions.remove(0);
            ticketbooker.availableUpperBerths--;

            }
            else if(ticketbooker.availableRacTickets>0){
                booker.addtorac(p,(ticketbooker.racPositions.get(0)),"RAC");
                System.out.print("RAC Available");
            }
            else if(ticketbooker.availableWaitingList>0){
                booker.addtowaitinglist(p,(ticketbooker.waitingListPositions.get(0)),"WL");

            }

        }
            
        
    


    
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
boolean loop=true;

while(loop){
System.out.println("1.Book ticket \n 2.Cancel ticket \n 3.Available Tickets  \n 4.Booked Tickets  \n 5.Exit ");
int choice=sc.nextInt();
switch(choice){
    case 1:
    {
        System.out.println("enter passenger details-Name,Age,Berth preference");
        String name=sc.next();
        int age=sc.nextInt();
        String berth=sc.next();
        passenger p=new passenger(name,age,berth);
        bookticket(p);
    }
    case 2:
    {
        System.out.print("give user Id");
        int id=sc.nextInt();
        
    }
}
}

}
}

