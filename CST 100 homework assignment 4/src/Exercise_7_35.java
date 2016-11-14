import java.util.Scanner;

public class Exercise_7_35 {

	public static char[] checkLetter(char[] puzzle, char guess, String answer){
		for(int i = 0; i < answer.length(); i ++){
			if(guess == answer.charAt(i)){
				puzzle[i] = guess;
			}
		}
		
		return puzzle;
	}
	
	public static char[] makePuzzle(String answer){
		char[] puzzle = new char[answer.length()];
		
		for(int i = 0; i < answer.length(); i ++){
			if(answer.charAt(i) != ' '){
				puzzle[i] = '*';
			}
			else{
				puzzle[i] = ' ';
			}
		}
		
		return puzzle;
	}
	
	public static boolean isSolved(char[] puzzle){
		int missingLetters = 0;
		
		for(int i = 0; i < puzzle.length; i ++){
			if(puzzle[i] == '*'){
				missingLetters++;
			}
		}
		
		if(missingLetters > 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	public static String choosePuzzle(String[] choices){
		int choice = (int)(Math.random() * choices.length);
		
		return choices[choice].toUpperCase();
	}
	
	public static void main(String[] args){
		String[] hiddenWords = {"program", "java", "Grand Canyon University"};
		
		String answer = choosePuzzle(hiddenWords);
		
		char[] puzzle = makePuzzle(answer);
				
		Scanner input = new Scanner(System.in);
		
		char guess;
		int wrongCount = 0;
		
		while(!isSolved(puzzle)){
			System.out.print("(Guess) Enter a letter in word");
			for(int i = 0; i < puzzle.length; i ++){
				System.out.print(puzzle[i]);
			}
			System.out.print(" > ");
			
			guess = input.next().charAt(0);
			
			if(Character.isLowerCase(guess)){
				guess = Character.toUpperCase(guess);
			}
			
			checkLetter(puzzle, guess, answer);
			
		}
		
		System.out.printf("The word is %s. You missed %d time\nDo you want to guess another word? enter y or n>", answer, wrongCount);
	}	
}
