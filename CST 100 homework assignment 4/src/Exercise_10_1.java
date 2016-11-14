
public class Exercise_10_1 {
	// test program for Time.java
	public static void main(String[] args){
		Time currentTime = new Time();
	
		Time specifiedTime = new Time(555550000);
	
		System.out.printf("Current Time:\n%d hours, %d minutes, %d seconds\n\n\n", currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond());
	
		System.out.printf("Specified Time\n%d hours, %d minutes, %d seconds\n", specifiedTime.getHour(), specifiedTime.getMinute(), specifiedTime.getSecond());
	}
}	
