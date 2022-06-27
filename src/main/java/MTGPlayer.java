public class MTGPlayer {
    private String playerName;
    private Boolean hasADeck;
    private Integer playerAge;
    private String favoriteCardColor;
    private String hasFavoriteFormat;

    public MTGPlayer(String playerName, Boolean hasADeck, int playerAge, String favoriteCardColor, String hasFavoriteFormat) {
        this.playerName = playerName;
        this.hasADeck = hasADeck;
        this.playerAge = playerAge;
        this.favoriteCardColor = favoriteCardColor;
        this.hasFavoriteFormat = hasFavoriteFormat;

    }
    public String getPlayerName() {
        return this.playerName;
    }

    public boolean getHasADeck() {
        return this.hasADeck;
    }

    public int getPlayerAge() {
        return this.playerAge;
    }

    public String getFavoriteColor() {
        return this.favoriteCardColor;
    }

    public String getFavoriteFormat() {
        return this.hasFavoriteFormat;
    }

    public String introducePlayer() {
        String intro = "Hello, my name is " + this.playerName;
        return intro;
    }

    public String doesPlayerOwnDeck() {
        String playerResponse;
        if (this.hasADeck == true) {
            playerResponse = "Yes, " + this.playerName + " has a deck to play with";
        }
        else {
            playerResponse = "No, " + this.playerName + " does NOT have a deck to play with";
        }

        return playerResponse;
    }

    public String whatIsPlayersAge() {
        String playerResponse;
        playerResponse = this.playerName + "is " + this.playerAge + "years old";
        return playerResponse;
    }

    public String whatIsPlayersFavoriteCardColor() {
        String playerResponse;
        playerResponse = this.playerName + "'s favorite color to play in MTG is " + this.favoriteCardColor;
        return playerResponse;
    }

    public String whatIsPlayersFavoriteFormat() {
        String playerResponse;
        playerResponse = this.playerName + "'s favorite format to play MTG in is " + this.hasFavoriteFormat;
        return playerResponse;
    }
    
}
