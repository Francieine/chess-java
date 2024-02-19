package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{
	
	
	

	public Bishop(Board board, Color color) {
		super(board, color);
	}
	
	
	public boolean[][] possibleMove(){
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0,0);
		
		if(getColor() == Color.WHITE) {
			p.setValues(getMoveCount() -1, getMoveCount());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()]  = true;
			}
			
			p.setValues(getMoveCount() -2, getMoveCount());
			Position p2 = new Position (position.getRow() -1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
		}else {
			
			p.setValues(getMoveCount() + 1, getMoveCount());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()]  = true;
			}
			
			p.setValues(getMoveCount() + 2, getMoveCount());
			Position p2 = new Position (position.getRow() + 1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			
		}
		return mat;
	}
@Override public String toString() {
	return "B";
} 	
	
	
	

}
