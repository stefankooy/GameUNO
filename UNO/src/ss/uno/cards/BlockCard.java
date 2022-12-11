package ss.uno.cards;

import ss.uno.Card;
import ss.uno.Color;

public class BlockCard extends Card {
    /**
     * Create a new card
     *
     * @param cardColor : the color of the card
     * @param cardCode  : the code of the card
     */
    public BlockCard(Color cardColor, int cardCode) {
        super(69, cardColor, cardCode);
    }
}
