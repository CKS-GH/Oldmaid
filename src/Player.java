import java.util.ArrayList;
import java.util.HashSet;

public class Player {


    private ArrayList<String> cardsBox;

    private HashSet<String> cardsBox2;

    public Player(HashSet<String> cardsBox2) {
        this.cardsBox2 = cardsBox2;
    }

    public HashSet<String> getCardsBox2() {
        return cardsBox2;
    }

    public void setCardsBox2(HashSet<String> cardsBox2) {
        this.cardsBox2 = new HashSet<>(cardsBox2);
    }

    public Player(ArrayList<String> cardsBoard) {

        this.cardsBox = new ArrayList<>(cardsBoard);
    }

    public ArrayList<String> getCardsBox() {

        return cardsBox;
    }

    public void setCardsBox(ArrayList<String> cardsBox) {
        this.cardsBox = cardsBox;

    }
}

