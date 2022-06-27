
public class Main {
    public static void main(String[] args) {
        // your code here
        Timmy Brian = new Timmy("Brian", false, 30, "Black", "Pauper Format", true);
        // String brianName = Brian.getPlayerName();
        Integer brianAge = Brian.getPlayerAge();
        String brianOwnsDeck = Brian.doesPlayerOwnDeck();
        String brianLikesBadCards = Brian.doYouLikeBadCards();
        String brianIntro = Brian.introducePlayer();

        System.out.println(brianIntro);
        System.out.println("I am " + brianAge + " years old");
        System.out.println(brianOwnsDeck);
        System.out.println(brianLikesBadCards);
        Brian.playsBigCreatureCard();

        Johnny Conner = new Johnny("Conner", true, 30, "Blue", "Modern", true);
        // String connerName = Conner.getPlayerName();
        Integer connerAge = Conner.getPlayerAge();
        String connerOwnsDeck = Conner.doesPlayerOwnDeck();
        String connerLikesComboCards = Conner.doYouLikeComboCards();
        String connerIntro = Conner.introducePlayer();

        System.out.println(connerIntro);
        System.out.println("I am " + connerAge + " years old");
        System.out.println(connerOwnsDeck);
        System.out.println(connerLikesComboCards);
        Conner.playsComboCard();

        Spike Jake = new Spike("Jake", true, 21, "Green", "Historic", true);
        // String jakeName = Jake.getPlayerName();
        Integer jakeAge = Jake.getPlayerAge();
        String jakeOwnsDeck = Jake.doesPlayerOwnDeck();
        String jakeLikesPowerfulCards = Jake.doYouLikePowerfulCards();
        String jakeIntro = Jake.introducePlayer();

        System.out.println(jakeIntro);
        System.out.println("I am " + jakeAge + " years old");
        System.out.println(jakeOwnsDeck);
        System.out.println(jakeLikesPowerfulCards);
        Jake.playsPowerfulCard();

        
    }

}

//PSEUDOCODE:
//  Class => MTG Player
//  MTG Player Standard Props:
//  playerName = String
//  hasADeck = Boolean
//  hasAnAge = Integer
//  hasFavoriteColor = String
//  hasFavoriteFormat = DEFAULT STRING
//
//  Subclasses of MTG Player => "Timmy", "Johnny", "Spike"
//
//  Properties of Timmy MTG Player:
//  likesBadCards = Boolean
//  playsBigCreatureCard = METHOD => Plays a Big Creature Card
//
//  Propteries of Johnny MTG Player:
//  likesComboCards = Boolean
//  playsComboCard = METHOD => Plays a Combo Card
//
//  Properties of Spike MTG Player:
//  likesPowerfulCards = Boolean 
//  playsPowerfulCard = METHOD => Plays a Powerful Card
