package ss.uno;

public class Player {
    private String userName;

    /**
     * Create a new Player
     *
     * @param userName
     */
    public Player(String userName){
        this.userName = userName;
    }


    /**
     * set the username of the player
     * @param userName : the username of the player
     */
    public void setUserName(String userName){
        this.userName = userName;
    }

    /**
     * @return the username of the player
     */
    public String getUserName(){
        return userName;
    }


}
