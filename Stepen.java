package Test;

public class Stepen {
	public static void main (String[] args){
		
		
		//Даны переменные x и n вычислить x^n.
		int input1=4;
		int input2=5;
		int result=1;
		
		for (int i=1; i<=input2; i++){
			result=result*input1;
		}
		System.out.println (input1+"^"+input2+" is "+result);
	}

}
