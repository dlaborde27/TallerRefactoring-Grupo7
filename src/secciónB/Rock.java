package secciónB;

public class Rock implements Choice {

    @Override
    public Choice versus(Choice choice) {
        if(choice instanceof Paper) {
        	return choice;
        }
        if(choice instanceof Scissors) {
        	return this;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "Rock";
    }
    
}
