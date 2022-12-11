package ss.uno;

import java.util.ArrayList;

public class Person extends Player {

    private ArrayList<Card> hand;


    /**
     * Create a new Person
     *
     * @param userName : username of the person
     */
    public Person(String userName) {
        super(userName);

        hand = new ArrayList<Card>();
    }

    /**
     * @return the person's hand
     */
    public ArrayList<Card> getPlayerHand() {
        return hand;
    }

    /**
     * @return the size of the person's hand
     */
    public int getSizeOfPlayerHand () {
        return hand.size();
    }

    /**
     * Add a new card to person's hand
     *
     * @param cardToAdd : new card to add
     */
    public void addCard(Card cardToAdd){    }

    /**
     * Remove a card from person's hand
     *
     * @param cardToRemove
     * @return the removed Card
     */
    public Card removeCard(Card cardToRemove){
        return cardToRemove;
    }

    /**
     * This method check that the player have a card with given code number or not
     *
     * @param card : the card that you want to check
     * @return {@code true} if person has the card
     */
    public boolean hasCard(int card){
        return false;
    }


}
