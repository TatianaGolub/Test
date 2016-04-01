package Test;

public class Seasons {
	public static void main (String[] args){
		
		//Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
		int month=12;
		String seasonName;
		switch (month) {
		case 12: seasonName="Winter";
		break;
		case 1: seasonName="Winter";
		break;
		case 2: seasonName="Winter";
		break;
		case 3: seasonName="Spring";
		break;
		case 4: seasonName="Spring";
		break;
		case 5: seasonName="Spring";
		break;
		case 6: seasonName="Summer";
		break;
		case 7: seasonName="Summer";
		break;
		case 8: seasonName="Summer";
		break;
		case 9: seasonName="Autumn";
		break;
		case 10: seasonName="Autumn";
		break;
		case 11: seasonName="Autumn";
		break;
		default: seasonName="Enter valid number";
		break;
		
		}
		System.out.println(seasonName);
	}

}
