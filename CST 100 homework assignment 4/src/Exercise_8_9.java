import java.util.Scanner;

public class Exercise_8_9 {
	
	public static int[][] markLocation(int player, int x, int y, int[][] board){
		if(player == 0){
			board[x][y] = 0;
		}
		else if(player == 1){
			board[x][y] = 1;
		}
		
		return board;
	}
	
	public static char xOrO(int marker){
		if(marker == 0){
			return 'X';
		}
		else if(marker == 1){
			return 'O';
		}
		else{
			return ' ';
		}
	}
	
	public static void displayBoard(int[][] board){
		System.out.println("-------------");		// displays game board
		for(int i = 0; i < 3; i ++){
			for(int j = 0; j < 3; j ++){
				System.out.printf("| %c ", xOrO(board[i][j]));
			}
			System.out.println("|");
			System.out.println("-------------");
		}
	}
	
	public static int winner(int[][] board){
		int win = -1;
		for(int i = 0; i < 3; i ++)		// check for horizontal win
			if(board[i][0] != -1){
				if(board[i][0] == board[i][1] && board[i][0] == board[i][2]){
					win = board[i][0];
				}
			}
		
		for(int i = 0; i < 3; i ++){	// check for vertical win
			if(board[0][i] != -1){
				if(board[0][i] == board[1][i] && board[0][i] == board[2][i]){
					win = board[0][i];
				}
			}
		}
		
		if(board[1][1] != -1){			// check for diagonal win
			if(board[0][0] == board[1][1] && board[2][2] == board[1][1]){
				win = board[1][1];
			}
			else if(board[0][2] == board[1][1] && board[2][0] == board[1][1]){
				win = board[1][1];
			}
		}
		
		return win;
	}
	
	public static int isTie(int[][] board){			// returns a non-zero value if the game is not a tie
		int emptyCount = 0;
		for(int i = 0; i < 3; i ++){
			for(int j = 0; j < 3; j++){
				if(board[i][j] == -1){
					emptyCount++;
				}
			}
		}
		
		return emptyCount;
	}
	
	public static void main(String[] args){

		int[][] board = {			// initialize array for game board
				{-1, -1, -1},
				{-1, -1, -1},
				{-1, -1, -1},
		};
		
		int player = 0;			// value for tracking player turns
		int gameOver = 0;		// value for determining when game is over
		int row = 0;
		int column = 0;
		
		Scanner input = new Scanner(System.in);
		
		displayBoard(board);
		
		while(gameOver == 0){
			
			System.out.printf("Enter a row(0, 1, or 2) for player %c:", xOrO(player%2));
			row = input.nextInt();
			System.out.printf("Enter a column (0, 1, or 2) for player %c:", xOrO(player%2));
			column = input.nextInt();
			
			board = markLocation(player%2, row, column, board);
			
			displayBoard(board);
			
			if(winner(board) != -1){
				System.out.printf("%c player won\n", xOrO(winner(board)));
				gameOver = 1;
			}
			else if(isTie(board) == 0){
				System.out.println("Game is a tie");
				gameOver = 1;
			}
			
			player++;	
		}
		
		input.close();
	}
}
