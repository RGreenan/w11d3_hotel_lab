public class Booking {
    private Bedroom bedroom;
    private int nights;
    private int bill;

    public Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
        this.bill = 0;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNights() {
        return nights;
    }

    public int getBill() {
        bill = bedroom.getRate() * nights;
        return bill;
    }
}
