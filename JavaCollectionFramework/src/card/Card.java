package card;

/**
 * Created by Kama on 07.08.2016.
 */
public class Card implements ICard {
    private int amount;
    private String cardholderName;
    private int uin;

    public Card(String cardholderName, int amount){
        this.amount = amount;
        this.cardholderName = cardholderName;
    }

    @Override
    public int balance() {
        return amount;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            return true;
        }
        return false;
    }
}
