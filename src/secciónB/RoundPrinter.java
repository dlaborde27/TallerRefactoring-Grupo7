package secciónB;

public abstract class RoundPrinter {
	
	public static void print(Round round){
	    Player winner = round.chooseWinner();
	    Player p1 = round.getP1();
	    Player p2 = round.getP2();
	    System.out.printf("Player 1: %10s\t Player 1 Total Wins: %s%n", p1.getChoice(), p1.getWins());
	    System.out.printf("Player 2: %10s\t Player 2 Total Wins: %s%n%n", p2.getChoice(), p2.getWins());
	    printWinner(winner, p1, p2);
	}
	
	public static void printStatus(RPSGame game) {
		int roundsPlayed = game.getRoundsPlayed();
		int draws = game.getDraws();
        System.out.println("\n***** Round: " + roundsPlayed + " *********************\n");
        System.out.println("Number of Draws: "+ draws + "\n");
    } 
	
	private static void printWinner(Player winner, Player p1, Player p2) {
		if(winner == p1) {
	    	System.out.println("Player 1 Wins");
	    }
	    else if(winner == p2) {
	    	System.out.println("Player 2 Wins");
	    }
	    else {
	    	System.out.println("\n\t\t\t Draw \n");
	    }
	}
	
}