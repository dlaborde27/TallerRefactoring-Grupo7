package secciónB;

public class Paper implements Choice{
	
    @Override
    public Choice versus(Choice choice) {
        if(choice instanceof Scissors) {
        	return choice;
        }
        if(choice instanceof Rock) {
        	return this;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "Paper";
    }
    
}
