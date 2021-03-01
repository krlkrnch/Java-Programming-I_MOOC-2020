
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;

    }

    public int priceDifference(Apartment compared) { //square*priceperSquare
        if (this.squares * this.pricePerSquare > compared.squares * compared.pricePerSquare) {
            return this.squares * this.pricePerSquare - compared.squares * compared.pricePerSquare;
        } else {
            return compared.squares * compared.pricePerSquare - this.squares * this.pricePerSquare;
        }

    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.squares * this.pricePerSquare > compared.squares * compared.pricePerSquare
                || compared.squares * compared.pricePerSquare < this.squares * this.pricePerSquare) {
            return true;
        }
        return false;

    }
}
