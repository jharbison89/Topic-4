import java.util.Scanner;

public class Exercise_10_7 {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Account[] id = new Account[10];
		int accountNumber;
		int arrayID;
		int menuChoice = 0;
		
		for(int i = 0; i < 10; i ++){
			id[i] = new Account(i, 100);
		}
		
		while(true){
			arrayID = -1;
			menuChoice = 0;
			while(arrayID < 0){
				System.out.print("Enter an id: ");
				accountNumber = input.nextInt();
			
				for(int i = 0; i < id.length; i++){
					if(accountNumber == id[i].getId()){
						arrayID = i;
						break;
					}
				}
				if(arrayID < 0){
					System.out.print("Invalid id. Please try again\n");
				}
			}
			
			while(menuChoice != 4){
				System.out.print("Main Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
				menuChoice = input.nextInt();
				while(menuChoice != 1 && menuChoice != 2 && menuChoice != 3 && menuChoice != 4){
					System.out.print("Invalid selection. Please try again: ");
					menuChoice = input.nextInt();
				}
				
				switch(menuChoice){
				case 1:
					System.out.printf("The balance is %.2f\n\n", id[arrayID].getBalance());
					break;
				case 2:
					System.out.print("Enter an amount to withdraw: ");
					double withdraw = input.nextDouble();
					id[arrayID].withdraw(withdraw);
					System.out.println("");
					break;
				case 3:
					System.out.print("Enter an amount to deposit: ");
					double deposit = input.nextDouble();
					id[arrayID].deposit(deposit);
					System.out.println("");
					break;
				case 4:
					System.out.println("Goodbye\n\n");
					arrayID = -1;
					break;
				}
			}
		}
	}
}
