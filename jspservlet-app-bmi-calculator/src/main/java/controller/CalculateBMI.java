package controller;

public class CalculateBMI {
	public static double calculate(double height,double weight)
    {
        double bmi = weight/(height*height);
        return bmi;
    }
    public static String description(double bmi)
    {
        String result=null;
        if (bmi < 18.5) {
            result="Under Weight";
        }
        else if ((18.5 <= bmi) || (bmi < 24.9)) {
            result="Normal";
        }
        else if ((25 <= bmi) || (bmi < 29.9)) {
            result="Over Weight";
        }
        else if((30<= bmi) ||(bmi < 34.9)) {
            result="Obese";
        }
        else if(bmi > 35){
            result="Extremely Obese";
        }
        return result;
	}

}
