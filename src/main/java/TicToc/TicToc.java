package TicToc;

public class TicToc {
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to tictoc game");
		TicToc tictoc=new TicToc();
		tictoc.createBoard();
	
	}
	
	public char[] createBoard(){
		char[]  board=new char[10];
		for(int i=1;i<=10;i++)
		{
			board[i]=' ';
		}
	return board;
	}

}
