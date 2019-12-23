import java.util.*;
class Patient extends Health
{
    String pname;
    Double pwt,pht;
    double patient(double pwt,double pht)
    {
        double bmi=(pwt/(pht*pht))*703;
        return bmi;
    }
}
class Health 
{
    public static void main(String args[])
    {
        Patient p=new Patient();
        double k=p.patient(40.0,30.0);
        System.out.println("BMI is: "+k);
        
    }
}