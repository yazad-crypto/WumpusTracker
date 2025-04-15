public class Main
{
  public static void main(String[] args){
    Room room1 = new Room(1, 4);
    Room room2 = new Room(2, 6);
    Room room3 = new Room(3. 10);
    Room room4 = new Room(4, 2);
    Room[] roomList = {room1, room2, room3, room4}
    ArrayList<Integer> visits = new ArrayList<Integer>;
    visits.add(room1);
    visits.add(room3);
    WumpusTracker wumpys = new WumpusTracker(roomList, visits);
  }
}
