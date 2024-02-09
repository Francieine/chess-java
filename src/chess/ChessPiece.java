package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class ChessPiece extends Piece{
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().removePiece(position);
		return p!= null && p.getColor() !=color;	
	
}

	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}
}