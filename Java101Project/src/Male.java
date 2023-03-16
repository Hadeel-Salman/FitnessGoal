
public class Male extends CalculateNeed{

    public Male (double Weight,double Hight,int Age){
        super(Weight, Hight, Age);
    }
    public double CalNeed(){
        return 66.5+(13.7*Weight)+(5*Hight)-(6.8*Age);
    }
    public double Activity(double CalNeeded, int Activities){
        double multiActivity = CalNeeded * Activities;
        if (Activities == 1){
            return CalNeeded*1.2;
        }
        else if (Activities == 2){
            return CalNeeded*1.375;
        }
        else if (Activities == 3){
            return CalNeeded*1.55;
        }
        else if (Activities == 4){
            return CalNeeded*1.725;
        }
        else if (Activities == 5){
            return CalNeeded*1.9;
        }
        else return 0 ;
}
}