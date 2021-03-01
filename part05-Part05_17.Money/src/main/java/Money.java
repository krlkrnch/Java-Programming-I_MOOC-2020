
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
//        int eurod = euros + addition.euros; 
//        int sendid = cents + addition.cents;  

        Money newMoney = new Money(euros + addition.euros, cents + addition.cents);

        return newMoney;
    }

    public Money minus(Money decreaser) {
        int euro = euros - decreaser.euros;
        int cent = cents - decreaser.cents;
        
        
        Money newMoney = new Money (euro,cent);
        
        if (cent < 0) { //0-9 = -9
            cent = cent + 100;
            euro = euro -1;
        } if (euro < 0) {
            newMoney = new Money(0,0);
        }
        return newMoney = new Money (euro,cent);
        
       
//        int eurodMinus = euros - decreaser.euros;
//        int centsMinus = cents - decreaser.cents;
//        int eurosAndCentsTogether = (eurodMinus * 100) + centsMinus;
//
//        int euros = eurosAndCentsTogether / 100;
//        int cents = eurosAndCentsTogether % 100;
//
//        Money newMoney = new Money(euros, cents);
//
//        if (eurosAndCentsTogether <= 0) {
//            newMoney = new Money(0, 0);
//        }
//
//        return newMoney;

    }

    public boolean lessThan(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;

    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Money other = (Money) obj;
        if (this.euros != other.euros) {
            return false;
        }
        if (this.cents != other.cents) {
            return false;
        }
        return true;
    }
}
