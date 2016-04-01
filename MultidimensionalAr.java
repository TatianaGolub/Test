package Test;

import java.util.Arrays;

public class MultidimensionalAr {
		public static void main(String[] args){
	
			//№1: Создайте массив размерностью 5 на 6 и заполните его случайными числами (в диапазоне от 0 до 99 ).  Выведите на консоль третью строку
		System.out.println("----Задание №1----");
		System.out.println("Исходный массив: ");
		int [] [] arr1=new int [5] [6];
		for (int i=0; i<5;i++){
			for (int j=0; j<6; j++) {
				arr1 [i][j]=(int)(Math.random()*100);
				System.out.print (arr1 [i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("3я строка массива:");
		for (int i=2; i<=2; i++){
			for (int j=0; j<6;j++) {
		
		System.out.print(arr1 [i][j]+"\t");}
	}
		
		

		//№2: Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне  от 0 до 99. 
		//Выполните по отдельности сначала сложение, потом умножения матриц друг на друга. Выведете исходные матрицы и результат вычислений на консоль
		System.out.println("\n");
		System.out.println("\n----Задание №2----");
		System.out.println("1й массив:");
		int[][] arr2=new int [3][3];
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr2[i][j]=(int)(Math.random()*100);
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("2й массив:");
		int[][] arr3=new int [3][3];
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr3[i][j]=(int)(Math.random()*100);
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Перемноженный массив:");
		int[][] arr4=new int [3][3];
		for (int i=0;i<3; i++){
			for (int j=0;j<3;j++){
				arr4[i][j]=arr2[i][j]*arr3[i][j];
				System.out.print(arr4[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Просуммированный массив:");
		int[][] arr5=new int [3][3];
		for (int i=0;i<3; i++){
			for (int j=0;j<3;j++){
				arr5[i][j]=arr2[i][j]+arr3[i][j];
				System.out.print(arr5[i][j]+"\t");
			}
			System.out.println();
		}
		
		//№3: Просуммируйте все элементы двумерного массива.
		System.out.println("\n");
		System.out.println("\n----Задание №3----");
		System.out.println("Исходный массив:");
		int sum=0;
		int [][] arr6=new int [9][4];
		for (int i=0; i<arr6.length; i++){
			for (int j=0; j<arr6[i].length;j++){
				arr6[i][j]=(int)(Math.random()*100);
				System.out.print(arr6[i][j]+"\t");
				sum=sum+arr6[i][j];
			}
			System.out.println();
		}
		System.out.println("Сумма элементов: "+sum);
		
		
		
		//№4: Дан двумерный массив, содержащий отрицательные и положительные числа. 
		//Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа.
		System.out.println("\n");
		System.out.println("\n----Задание №4----");
		System.out.println("Исходный массив:");

		int[][] arr7=new int[5][2];
		for (int i=0;i<arr7.length;i++){
		for (int j=0; j<arr7[i].length; j++){
				arr7[i][j]=(int)(Math.random()*200)-100;
				System.out.print(arr7[i][j]+"\t");
			}
			System.out.println();
		}
		for (int i=0; i<arr7.length; i++){
			for (int j=0; j<arr7[i].length; j++){
				if (arr7[i][j]<0){
					int index=i+1;
					int ind=j+1;
					System.out.print("\n"+arr7[i][j]+" - номер ячейки "+index+ind);
				}
			}
		}
		
		//№5: Отсортируйте элементы в строках двумерного массива по возрастанию
		System.out.println("\n");
		System.out.println("\n----Задание №5----");
		System.out.println("Исходный массив:");
		int [][] arr8=new int [4][5];
		for (int i=0; i<arr8.length; i++) {
			for (int j=0; j<arr8[i].length; j++) {
				arr8[i][j]=(int)(Math.random()*50)-10;
				System.out.print(arr8[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Отсортированый массив:");
		for (int i=0; i<arr8.length; i++) {
			Arrays.sort(arr8[i]);
		}
		for (int i=0; i<arr8.length;i++){
			for (int j=0; j<arr8[i].length;j++){
		System.out.print(arr8[i][j]+"\t");
			}
			System.out.println();
		}
}
}