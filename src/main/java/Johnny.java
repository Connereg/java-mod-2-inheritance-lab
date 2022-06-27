public class Johnny extends MTGPlayer {

    public boolean likesComboCards;

    public Johnny(String playerName, boolean hasADeck, int playerAge, String favoriteCardColor, String favoriteFormat, boolean likesComboCards) {
        super(playerName,hasADeck,playerAge,favoriteCardColor,favoriteFormat);
        this.likesComboCards = likesComboCards;
    }

    public void playsComboCard() {
        System.out.println("In response, I will play this, into this, into this, into this, into...");
    }

    public String doYouLikeComboCards() {
        String playerResponse;
        if (this.likesComboCards == true) {
            playerResponse = "I love playing impractical 5 card combos more than winning!";
        }else{
            playerResponse = "I actually only like playing one card a turn... I might not be a Johnny...";
        }
        return playerResponse;
    }
    
}
