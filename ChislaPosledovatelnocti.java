package Test;

public class ChislaPosledovatelnocti {

	public static void main (String [] args){
		
		//Вывести 10 первых чисел последовательности 0, -5,-10,-15..
		int input=10;
		int result=0;
		
		
		
		//for
		/*System.out.println(result);
		for (int i=1; i<input; i++){
			result=result-5;
		System.out.println(result);
		}
		*/
		
		
		//while
		int i=1;
		System.out.println(result);
		while (i<input) {
			i++;
			result=result-5;
		System.out.println(result);
		}
	}
}
