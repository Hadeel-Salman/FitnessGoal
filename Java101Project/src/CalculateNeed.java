
public abstract class CalculateNeed implements User{
    double CalNeeded;
    int Activities;
    double Weight ;
    double Hight ;
    int Age ;
    
    CalculateNeed(double Weight,double Hight,int Age){
        
      this.Weight=Weight;
      this.Hight=Hight;
      this.Age=Age;
      
    }
    
    public abstract double CalNeed();
    
    public abstract double Activity(double CalNeeded, int Activities);
    
    
}
