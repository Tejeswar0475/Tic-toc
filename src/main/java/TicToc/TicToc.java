package TicToc;

import java.util.Scanner;
public class TicToc {
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to tictoc game");
		
		TicToc tictoc=new TicToc();
		String userSelectedOption=tictoc.userChoice();
		tictoc.createBoard();
		
	}
	
	public  String userChoice()
	{
		//User choice
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please choose:X or O");
		String userChoose = scanner.next();
		if(userChoose == "X" || userChoose == "O")
		{
			return userChoose;
		}
		System.out.println("Your have entered wrong choice");
		
		return userChoose;
	}
	
	
	public char[] createBoard(){
		char[]  board=new char[10];
		for(int i=1;i<10;i++)
		{
			board[i]=' ';
		}
	return board;
	}
	
	public void showBoard()
	{
		
	}
	
	

}
