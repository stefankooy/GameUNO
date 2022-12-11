package ss.uno.cards;

import ss.uno.Card;
import ss.uno.Color;

public class NumberCard extends Card {

    private int cardNumber;

    /**
     * Create a new card
     *
     * @param cardNumber : the score of the card
     * @param cardColor : the color of the card
     * @param cardCode  : the code of the card
     */
    public NumberCard(int cardNumber, Color cardColor, int cardCode) {
        super(cardNumber, cardColor, cardCode);
        this.cardNumber = cardNumber;
    }

    public int getCardNumber(){
        return cardNumber;
    }
}