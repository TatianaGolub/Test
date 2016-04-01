package Test;

public class FindInPhrase {
	static public void main (String [] args){
		
		//поиск символа в строке. Необходимо, чтобы заданный символ встречался в строке хотя бы 2 раза.
		String searchme="this is sparta";
		char symb='h';
		boolean find=false;
		int count=0;
		
		for (int i=0;i<searchme.length(); i++){
			if (searchme.charAt(i)==symb){
				count++;
				if (count>=2) {
					find=true;
					break;
				}
			}
			
			
		}
		//System.out.println (count);
		//System.out.println (find);
		if (find) {
			System.out.println ("Symbol "+symb+ " was found at least twice");}
		else if (count<2) {System.out.println ("Symbol "+symb+ " was found less than twice");} 
			else {System.out.println ("Symbol "+symb+ " wasn't found");}
	}

}
