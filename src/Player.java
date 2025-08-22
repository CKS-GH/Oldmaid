
import java.util.ArrayList;

public class Player {


    private ArrayList<String> cardsBox;

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

