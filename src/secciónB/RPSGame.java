package secciónB;

import java.util.LinkedList;
import java.util.List;

public class RPSGame {
	
	private final Player p1;
    private final Player p2;
    private final List<Round> rounds;
    private int draws;
    
    public RPSGame() {
        p1 = new Player();
        p2 = new Player();
        this.rounds = new LinkedList<>();
        draws = 0;
    }
    
    public void play() {
        while(!isFinished()) {
        	RoundPrinter.printStatus(this);
        	Round round = new Round(p1, p2);
        	rounds.add(round);
        	round.play();
        	draws += round.getDraw();
        }
        System.out.println("\nGAME WON\n");
    }
    
    public boolean isFinished(){
    	boolean winPlayerOne = p1.getWins()>=3;
    	boolean winPlayerTwo = p2.getWins()>=3;
        return winPlayerOne || winPlayerTwo;
    }
    
    public int getDraws() {
    	return draws;
    }
    
    public int getRoundsPlayed() {
        return rounds.size();
    }
	    
}
