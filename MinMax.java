package Test;

public class MinMax {
	public static void main (String[] args){
	
		//Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
	int a=0;
	int b=6;
	int c=2;
	int d=0;
	int e=1;
	int min;
	int max;
	
	//min
	if (a<b) {min=a;}
		else {min=b;}
	if (min>c) {min=c;}
	if (min>d) {min=d;}
	if (min>e) {min=e;}
	System.out.println (min+" - это min");
	
	//max
	if (a>b) {max=a;}
		else {max=b;}
	if (max<c) {max=c;}
	if (max<d) {max=d;}
	if (max<e) {max=e;}
	System.out.println (max+" - это max");
	
	
	}

}
