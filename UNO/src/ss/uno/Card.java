package ss.uno;

public class Card {

    private int cardScore;
    private Color cardColor;
    private int cardCode;


    /**
     * Create a new card
     *
     * @param cardScore : the score of the card
     * @param cardColor : the color of the card
     * @param cardCode : the code of the card
     */
    public Card(int cardScore, Color cardColor, int cardCode) {
        this. cardScore = cardScore;
        this. cardColor = cardColor;
        this.cardCode = cardCode;
    }



    /**
     * @return the score of the card
     */
    public int getCardScore()
    {
        return cardScore;
    }
    /**
     * @return the color of the card
     */
    public Color getCardColor()
    {
        return cardColor;
    }
    /**
     * @return the code of the card
     */
    public int getCardCode()
    {
        return cardCode;
    }
}
