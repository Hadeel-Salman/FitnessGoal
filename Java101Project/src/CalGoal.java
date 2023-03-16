
public class CalGoal {
	
	 private double Grams = 100;
	    double cal;
	    double Gramsneeded;
	    
	    public CalGoal(){
	        
	    }
	    
	    public double CGoal( double cal,double Gramsneeded) throws Exception {
		if (cal<0 && Gramsneeded<0) throw new Exception("calories and food weight has to be a positive integer");
	        
	        double x = Gramsneeded*cal/Grams;
		return x;}

	   
	}

