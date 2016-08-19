package card;

public interface IAtm {
    void insertCard(ICard card);

    void eject();

    void withdraw(int amount);

//    void checkPin();

    void getBalanse();
}
