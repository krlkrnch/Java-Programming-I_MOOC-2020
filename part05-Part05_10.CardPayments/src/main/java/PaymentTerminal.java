
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000; //amount of cash

    }

    public double eatAffordably(double payment) {
        double meal = 2.50;

        if (payment >= meal) {
            this.money = this.money + meal;
            affordableMeals++;
            return payment - meal;
        }

        if (payment < meal) {
            return payment;
        }

        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return this.money;
    }

    public double eatHeartily(double payment) {
        double meal = 4.30;
        if (payment >= meal) {
            this.money = this.money + meal;
            heartyMeals++;
            return payment - meal;

        }
        if (payment < meal) {
            return payment;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return this.money;
    }

    public boolean eatAffordably(PaymentCard card) {
        double meal = 2.50;
        if (card.balance() >= meal) {
            card.takeMoney(meal);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double meal = 4.30;
        if (card.balance() >= meal) {
            card.takeMoney(meal);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
