package card;

public class Atm implements IAtm {
    private ICard currentCard;

    @Override
    public void insertCard(ICard card) {
        currentCard = card;
    }

    @Override
    public void eject() {
        currentCard = null;
        System.out.println("Card was eject");
    }

    @Override
    public void withdraw(int amount) {
        if (currentCard.withdraw(amount)) {
            System.out.println("Cash " + amount + " , new balance: " + currentCard.balance());
        } else {
            System.out.println("Not enough money");
        }
    }

    @Override
    public void getBalanse() {
        System.out.println("Balance: " + currentCard.balance());
    }
}
