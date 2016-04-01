package Test;

public class MinElem {
	public static void main (String[] args) {
	
		//Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
		int a=3;
		int b=3;
		int c=3;
		int d=5;
		
		/*
		 // Вариант 1 (неверный если в исходном массиве одинаковые цифры)
		 
		if (a<=b && a<=c && a<=d) {
			System.out.println( a + " - это наименьшее число");
		} 
			else {if (b<=a && b<=c && b<=d) {
			System.out.println( b + " - это наименьшее число");
			} 
				else {if (c<=a && c<=b && c<=d) {
				System.out.println( c + " - это наименьшее число");
				} 
					else {if (d<=a && d<=b && d<=c) {
					System.out.println( d + " - это наименьшее число");
					} 
					}
					}
					}
		*/
		
		//Вариант 2 (оптимальный)
		int min=1;
		if (a<b) min=a ; else min=b;
		if (min<c) min=min; else min=c; 
		if (min<d) min=min; else min=d;
		System.out.println( min + " - это наименьшее число");
	
		
		//Вывести на консоль количество максимальных чисел среди этих четырех.
		int max;
		int numberOfMax=1;
		
        if(a > b)
            max = a;
    else if (a == b){
            max = a;
            numberOfMax++;}
    else
            max = b;
   
    if(max < c){
            max = c;
            numberOfMax = 1;}
    else if (max == c) {
            numberOfMax++;
    }
           
    if(max < d){
             max = d;
             numberOfMax = 1;
    }
    else if (max == d) {
            numberOfMax++;
    }
		System.out.println(max + " - это максимальное значение");
		System.out.println(numberOfMax + " одинаковых максимальных значений");
			}
		
		/*// Сокращенный вариант (неверный если в исходном массиве одинаковые цифры)
		int 	x= (a<b && a<c && a<d) ? a : (b<a && b<c && b<d) ? b : (c<a && c<b && c<d) ? c : d;
		System.out.println( x + " - это наименьшее число"); 
		*/
				
		
	
	}
	


 

