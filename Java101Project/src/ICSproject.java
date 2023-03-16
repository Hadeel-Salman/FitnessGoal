
import java.util.Scanner;

public class ICSproject {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    CalGoal Cal = new CalGoal();
	    
	    
	    System.out.println("Welcome to FittenesGoal \n");
	    System.out.println("FittenesGoal will Help you calculate & track your calories");
	    System.out.println("we will first calculate your need of calories \n");
	    System.out.println("Choose the number next to your gender: ");
	    System.out.println("1 - Male \n2 - Female "); 
	    int Gender = s.nextInt();
	    
	    
	    switch (Gender){
	        
	            case 1 :
	            
	        System.out.println("write down your weight [in Kg]");  
	        double MaleKg = s.nextDouble();
	        System.out.println("write down your Hight [in cm]");  
	        double MaleCm = s.nextDouble();
	        System.out.println("write down your Age [in years]");  
	        int MaleAge = s.nextInt();
	        
	        CalculateNeed maleCal = new Male(MaleKg, MaleCm, MaleAge);
	        
	        double MaleCalNeeds = maleCal.CalNeed();
	        
	   
	        System.out.println("How is your Daily activity ?");  
	        System.out.println(" 1 - Little to no activity at all");  
	        System.out.println(" 2 - Light exercise (1–3 days per week)");  
	        System.out.println(" 3 - Moderate exercise (3–5 days per week)"); 
	        System.out.println(" 4 - Heavy exercise (6–7 days per week)"); 
	        System.out.println(" 5 - Very heavy exercise (twice per day, extra heavy workouts)"); 
	        int MaleUserActivity = s.nextInt();
	        
	        int MaleUserCalNeed = (int) maleCal.Activity(MaleCalNeeds, MaleUserActivity);
	        
	        
	        System.out.println("Is your Goal \n 1 - stabilizing weight \n 2 - losing weight");
	        int MGoal = s.nextInt();
	        if (MGoal == 2){
	           MaleUserCalNeed = MaleUserCalNeed-500;
	        } else if (MGoal == 1){
	           MaleUserCalNeed = MaleUserCalNeed;
	        } 
	        System.out.println("\n You need "+MaleUserCalNeed+" cal a Day");

	        System.out.println("if you need to calculate your calories");
	        int Again1;
	        
	        do{
	        
	       
		System.out.println("How many calories per 100g/ml on the packeg ?");
		double mCal = s.nextDouble();
		System.out.println("How many Grams/ml will you use in your meal?");
		double mGramesneed = s.nextDouble();
	        double CalUsed = 0;
	        try{
	        CalUsed = Cal.CGoal(mCal, mGramesneed);
	        }catch (Exception e){
		System.out.println(e);}
	        
		System.out.println(CalUsed +" cal");
	        double CalLeft = MaleUserCalNeed-CalUsed;
	        
	        
	        System.out.println("the calories you Need is :"+MaleUserCalNeed+" Cal");
	        System.out.println("The calories you used is :"+CalUsed);
	        System.out.println("calories that's left is "+CalLeft);
	        
	        System.out.println("Do you want to Search for another food?");
	        
	        System.out.println(" 1 - YES!");
	        System.out.println(" 0 - NO! Exit the program");
	        Again1 = s.nextInt();
	        } while (Again1!= 0);
	        break;
	        
	            case 2 :
	            
	                
	        System.out.println("write down your weight [in Kg]");  
	        double FemaleKg = s.nextDouble();
	        System.out.println("write down your Hight [in cm]");  
	        double FemaleCm = s.nextDouble();
	        System.out.println("write down your Age [in years]");  
	        int FemaleAge = s.nextInt();
	        
	        CalculateNeed FemaleCal = new Female(FemaleKg, FemaleCm, FemaleAge);
	        
	        double FemaleCalNeeds = FemaleCal.CalNeed();
	        
	        System.out.println("How is your Daily activity ?");  
	        System.out.println(" 1 - Little to no activity at all");  
	        System.out.println(" 2 - Light exercise (1–3 days per week)");  
	        System.out.println(" 3 - Moderate exercise (3–5 days per week)"); 
	        System.out.println(" 4 - Heavy exercise (6–7 days per week)"); 
	        System.out.println(" 5 - Very heavy exercise (twice per day, extra heavy workouts)"); 
	        int FemaleUserActivity = s.nextInt();
	        
	        int FemaleUserCalNeed = (int) FemaleCal.Activity(FemaleCalNeeds, FemaleUserActivity);
	        
	        System.out.println("Is your Goal \n 1 - stabilizing weight \n 2 - losing weight");
	        int FGoal = s.nextInt();
	        if (FGoal == 2){
	           FemaleUserCalNeed = FemaleUserCalNeed-500;
	        } else if (FGoal == 1){
	           FemaleUserCalNeed = FemaleUserCalNeed;
	        } 

	        System.out.println("\n You need "+FemaleUserCalNeed+" cal a Day");
	        
	        System.out.println("if you need to calculate your calories");
	        int Again2;
	        
	        do{ 
	        
		System.out.println("How many calories per 100(g/ml) on the packeg ?");
		double fCal = s.nextDouble();
		System.out.println("How many Grams/ml will you use in your meal?");
		double fGramesneed = s.nextDouble();
	        
	        double CalUsed = 0;
	        try{
	        CalUsed =  Cal.CGoal(fCal, fGramesneed);
	        }catch (Exception e) {
		System.out.println(e);}
	        
		System.out.println(CalUsed +" cal");
	        double CalLeft = FemaleUserCalNeed-CalUsed;
	        
	        
	        System.out.println("the calories you Need is :"+FemaleUserCalNeed+" Cal");
	        System.out.println("The calories you used is :"+CalUsed);
	        System.out.println("calories that's left is "+CalLeft);
	        
	        System.out.println("Do you want to Search for another food?");
	        
	        System.out.println(" 1 - YES!");
	        System.out.println(" 0 - NO! Exit the program");
	        Again2 = s.nextInt();
	        } while (Again2!= 0);
	        
	        break;
	    
	    default:
	        
	        System.out.println("Choose the number next to your gender [1 or 2]");
	        
	        }
	    }
	}

