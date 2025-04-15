import java.util.ArrayList;

public class WumpusTracker {
    private Room[] roomArray;
    private ArrayList<Integer> visitedRooms;

    public WumpusTracker(Room[] rooms, ArrayList<Integer> visits) {
        roomArray = rooms;
        visitedRooms = visits;
    }

    /** Returns the average danger level of all visited rooms */
    public double getAverageDanger() {
        // TODO
        //return 2.0;
        double total = 0.0;
        for(int i = 0; i < visitedRooms.size(); i++){
            total += findDanger(visitedRooms.get(i));
        }
        return((double)(total/visitedRooms.size()));
        //total = (total)
    }

    /** Returns the ID of the most dangerous room the player has visited */
    public int getMostDangerousVisitedRoom() {
        int greatestDanger = 0;
        for(int i = 0; i < visitedRooms.size(); i++){
            if(findDanger(visitedRooms.get(i)) > greatestDanger){
                greatestDanger = findDanger(visitedRooms.get(i));
            }
        }
        return greatestDanger;
    }

    public int findDanger(int ID){
        //System.out.println();
        for(int i = 0; i < roomArray.length; i++){
            if(roomArray[i].getID() == ID){
                return roomArray[i].getDangerLevel();
            }
        }
        return 0;
    }
}