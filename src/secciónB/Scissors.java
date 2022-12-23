package secciónB;

public class Scissors implements Choice {

    @Override
    public Choice versus(Choice choice) {
        if(choice instanceof Rock) {
        	return choice;
        }
        if(choice instanceof Paper) {
        	return this;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "Scissors";
    }
    
}
