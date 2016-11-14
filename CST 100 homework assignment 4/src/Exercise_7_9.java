import java.util.Scanner;

public class Exercise_7_9 {
	
	public static double min(double[] array){		// finds smallest value in a given array
		double min = array[0];
		
		for(int i = 0; i < array.length; i ++){
			if(min > array[i]){
				min = array[i];
			}
		}
		
		return min;
	}

	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < 10; i++){
			array[i] = input.nextDouble();
		}
		
		input.close();
		
		double smallest = min(array);
		
		System.out.println("The minimum number is: " + smallest);
	}
}
