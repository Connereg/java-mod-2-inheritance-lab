public class Timmy extends MTGPlayer {

    public boolean likesBadCards;

    public Timmy(String playerName, boolean hasADeck, int playerAge, String favoriteCardColor, String favoriteFormat, boolean likesBadCards){
        super(playerName, hasADeck, playerAge, favoriteCardColor, favoriteFormat);
        this.likesBadCards = likesBadCards;

    }
    public void playsBigCreatureCard() {
        System.out.println("This big creature looks cool, so I will play it!");
    }

    public String doYouLikeBadCards() {
        String playerResponse;
        if (this.likesBadCards == true) {
            playerResponse = "I LOVE bad cards with high mana costs!";

        }else{
            playerResponse = "I may not actually be a Timmy, I dont like bad cards...";
        }
        return playerResponse;
    }

    
}
