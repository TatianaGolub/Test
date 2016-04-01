package Test;
import java.util.*;

public class ArraySort {
	
	public static void main (String[] args) {
		
		//Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000) и отсортируйте массив по убыванию при помощи сортировки пузырьком.
		System.out.println("Задание №1");
		System.out.println("---- Исходный массив: ---- ");
		
		int array[]=new int [20];
		for (int i=0; i<array.length; i++) {
			array[i]=(int)(Math.random()*1000);
			System.out.print(array[i]+" ");
			}
			
			System.out.println();
			System.out.println("\n---- Отсортированый по убыванию массив: ---- ");
		
			for (int i=array.length-1; i>0; i--) {
				for (int j=0; j<i;j++) {
					if (array[j]<array[j+1]){
						int tmp=array[j];
						array[j]=array[j+1];
						array[j+1]=tmp;			
					}	
					}
					}
				for (int i=0; i<array.length; i++){
				System.out.print(array[i]+" ");
				}
				
				System.out.println();
				System.out.println();
				
		//Создайте массив содержащий марки автомобилей, отсортируйте его сначала по возрастанию, потом по убыванию.
				System.out.println("\nЗадание №2");
				System.out.println("---- Исходный массив: ---- ");
				String car[]= {"bmw", "chevrolet", "opel", "lanos", "ferrari", "shkoda", "cherry", "acura", "sitroen", "zaz"};
				for (int i=0; i<car.length; i++) {
					System.out.print(car[i]+" ");
				}
				
				System.out.println();
				System.out.println("\n---- Отсортированый по возрастанию массив: ---- ");
				
				Arrays.sort(car);
				for (int i=0; i<car.length;i++) {
					System.out.print (car[i]+" ");
				}
				
				
				System.out.println();
				System.out.println("\n---- Отсортированый по убыванию массив: ---- ");
				Arrays.sort(car, Collections.reverseOrder());
				for (int i=0; i<car.length; i++){
					System.out.print(car[i]+" ");
				}
				
				
		}
	}	
			
			




