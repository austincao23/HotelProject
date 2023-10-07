public class Suite extends Room{
    private int numRooms;
    private boolean kitchen;

    public Suite (int roomNumber, double roomPrice, int numRooms, boolean kitchen){
        super(roomNumber, roomPrice);
        this.numRooms = numRooms;
        this.kitchen = kitchen;
    }

    public void getRoomInfo(){
        System.out.printf("Suite %d\t$%.2f \t%d rooms\t\t%s\n", number, price, numRooms, kitchen ? "Kitchen" : "No Kitchen");
    }
}
