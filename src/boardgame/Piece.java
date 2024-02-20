package boardgame;

public class Piece {
	
	protected Position position; //Position class associate with Piece
	private Board board; //Board class associate with Piece
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	public boolean possibleMove(Position target) {
		return false;
	}

	
}
