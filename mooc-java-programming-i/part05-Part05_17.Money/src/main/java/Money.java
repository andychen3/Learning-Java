

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

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros+addition.euros, this.cents+addition.cents);

        return newMoney;
        
    }

    public boolean lessThan(Money compared) {
        String convert = String.valueOf(this.euros + "." + this.cents);
        String convert2 = String.valueOf(compared.euros + "." + compared.cents);

        double first = Double.valueOf(convert);
        double second = Double.valueOf(convert2);

        return first < second;

    }

    public Money minus(Money decreaser) {
        int eurosDiff = this.euros - decreaser.euros;
        int centDiff = this.cents - decreaser.cents;

        if (this.cents - decreaser.cents < 0) {
            eurosDiff--;
            centDiff = 100 + centDiff;
        }

        if (eurosDiff < 0) {
            eurosDiff = 0;
            centDiff = 0;
        }


        Money newMoney = new Money(eurosDiff, centDiff);

        return newMoney;

        }
    }

