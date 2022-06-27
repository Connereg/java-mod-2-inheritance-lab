public class Spike extends MTGPlayer {

    public boolean likesPowerfulCards;

    public Spike(String playerName, boolean hasADeck, int playerAge, String favoriteCardColor, String favoriteFormat, boolean likesPowerfulCards) {
        super(playerName, hasADeck, playerAge, favoriteCardColor, favoriteFormat);
        this.likesPowerfulCards = likesPowerfulCards;

    }
    public void playsPowerfulCard() {
        System.out.println("I will play this card because I want to win at ANY cost and only have fun when I am winning");
    }

    public String doYouLikePowerfulCards() {
        String playerResponse;
        if (this.likesPowerfulCards == true) {
            playerResponse = "Will it make me win the game? Okay I like it then, easy as that"; 

        }else{
            playerResponse = "This card does not seem amazing but I still really like it... I guess im not really a Spike";
        }
        return playerResponse;
    }

    
}
