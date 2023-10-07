import java.util.ArrayList;
import java.util.Collections;
public class Hotel implements Comparable<Hotel>{

    private ArrayList<Room> Rooms = new ArrayList<>();
    private String name;
    private int stars;
    private double rating;
    private double averageRoomPrice;

    public Hotel(String name, int stars){
        this.name = name;
        this.stars = stars;
    }

    public double setRating(double rating){
        return this.rating = rating;
    }

    public double setRoomPrice(double averageRoomPrice){
        return this.averageRoomPrice = averageRoomPrice;
    }
    
    
    public double getAverageRoomPrice(){
        double sum = 0;
        for (Room r: Rooms){
            sum+= r.getPrice();
        }
        return sum/Rooms.size();
    }

    public void listRooms(){
        Collections.sort(Rooms);
        for(Room r: Rooms){
            r.getRoomInfo();
        }
    }

    public void printInfo(){
        System.out.printf("%s \tavg: $%.2f \t%d stars\t\t%.2f rating\n", name, averageRoomPrice, stars, rating);
    }

    public void addRoom(Room r){
        Rooms.add(r);
        averageRoomPrice = getAverageRoomPrice();
    }


    public int compareTo(Hotel Other){              //Review this
        if(Double.compare(this.averageRoomPrice, Other.averageRoomPrice) != 0){
            return Double.compare(this.averageRoomPrice, Other.averageRoomPrice);
        }else if(Integer.compare(this.stars, Other.stars) != 0){
            return Integer.compare(this.stars, Other.stars) * -1;
        }else{
            return Double.compare(this.rating, Other.rating) * -1;
        }
    }
}