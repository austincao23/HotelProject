public class Room implements Comparable<Room>{      //Review this

    protected int number;
    protected double price;

    public Room(int number, double price){
        this.number = number;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public double setPrice(double RoomPrice){
        return this.price = RoomPrice;
    }

    public void getRoomInfo(){
        System.out.print("");
    }

    @Override
    public int compareTo(Room Other){
        return Double.compare(this.price, Other.price);
    }
}