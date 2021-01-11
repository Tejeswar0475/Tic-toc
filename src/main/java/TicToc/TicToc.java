package TicToc;

import java.util.Scanner;
public class TicToc {
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to tictoc game");
		
		TicToc tictoc=new TicToc();
		String userSelectedOption=tictoc.userChoice();

		char[] currentBoard=tictoc.createBoard();
		tictoc.showBoard(currentBoard);
		
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
	
	public void showBoard(char[] board)
	{
		System.out.println(board[ 1 ]+" | "+board[ 2 ]+" | "+board[ 3 ] );
		System.out.println(board[ 4 ]+" | "+board[ 5 ]+" | "+board[ 6 ] );
		System.out.println(board[ 7 ]+" | "+board[ 8 ]+" | "+board[ 9 ] );			
	}
	
	

}
