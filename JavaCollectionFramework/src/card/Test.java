package card;

public class Test {
    public static void main(String[] args) {
        IAtm bankomat = new Atm();
        ICard bsuirBank = new Card("Veronica", 777);
        bankomat.insertCard(bsuirBank);
        bankomat.withdraw(800);
        bankomat.withdraw(555);
        bankomat.getBalanse();
        bankomat.eject();
    }
}
