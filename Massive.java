package Test;

public class Massive {
	
	public static void main (String [] args) {
		
		//Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
		int[] odd = new int [10];
		int x=1;
		for (int i=0; i<odd.length; i++) {
			odd [i]=x;
			x=x+2;
			System.out.print(x+" ");
		}
		System.out.println ('\n'+"-----"+'\n');
		
		
		
		//Дан массив размерности N,  найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
		//В массиве из задания 2. найти наибольший элемент.
		int[] anyArray={5, 16, 4, 3, 7, 153, 7, 0, 0, 0, -1, -1, 12, -1};
		int min=anyArray[0];
		int max=anyArray[0];

		for (int i=0; i<anyArray.length; i++) {
			if (min>anyArray[i]) {min=anyArray[i];}
		}
		System.out.println("наименьшие значения:");
		for (int j=0; j<anyArray.length; j++){
		if (min == anyArray[j]) { 
		System.out.println (anyArray[j]);}
		}
		for (int z=0; z<anyArray.length; z++) {
			if (max<anyArray[z]) {max=anyArray[z];}
		}
		System.out.println("Наибольшее значение: "+max );
		System.out.println ('\n'+"-----"+'\n');
		
		
		
		//Поменять наибольший и наименьший элементы массива местами.
		int[] startArray={4, 7, 0, 6, -8};
		int minn=startArray[0];
		int maxx=startArray[0];
		
		System.out.print ("Исходный массив: ");
		for (int b=0; b<startArray.length; b++){
		System.out.print(startArray[b]+" ");}
		
		for (int q=1; q<startArray.length; q++) {
			if (minn>startArray[q]) {minn=startArray[q];}
			if (maxx<startArray[q]) {maxx=startArray[q];}
		}
		System.out.println ('\n'+"Минимум: "+minn);
		System.out.println ("Максимум: "+ maxx);
	
		System.out.print ("Финальный массив: ");
		
		for (int i=0; i<startArray.length; i++){
		//if (startArray[i]==minn) {if (startArray[i]==maxx) {startArray[i]=minn;}}
		if (startArray[i]==minn) {startArray[i]=maxx;}
		else {if (startArray[i]==maxx) {startArray[i]=minn;}}
		
		}
		for (int b=0; b<startArray.length; b++){
			System.out.print(startArray[b]+" ");}
		
		
		//Найти среднее арифметическое всех элементов массива.
		int[] array={2, 5, 5, 7, 7, 8, 0, -7, -9, -3};
		double avarage=0;
		
		System.out.println ('\n'+"-------");
		for (int i=0; i<array.length; i++) {
			avarage=(avarage+array[i]);
			
		}
		avarage=avarage/array.length;
		System.out.println (avarage);
		
		
		
		
		
		
		
	}

}
