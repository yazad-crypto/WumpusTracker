import java.util.ArrayList;

public class Main
{
  public static void main(String[] args){
    Room room1 = new Room(1, 4);
    Room room2 = new Room(2, 6);
    Room room3 = new Room(3, 10);
    Room room4 = new Room(4, 2);
    Room room5 = new Room(100, 7);
    Room room56 = new Room(6, 900);
    Room[] roomList = {room1, room2, room3, room4, room5, room56};
    ArrayList<Integer> visits = new ArrayList<Integer>();
    visits.add(room1.getID());
    visits.add(room3.getID());
    visits.add(room4.getID());
    visits.add(room5.getID());
    visits.add(room56.getID());
    WumpusTracker wumpys = new WumpusTracker(roomList, visits); 
    System.out.println("The greatest danger is 900, and the WumpusTracker returns " + wumpys.getMostDangerousVisitedRoom());
    System.out.println("The average danger is 184.6, and the WumpusTracker returns " + wumpys.getAverageDanger());
  }
}
