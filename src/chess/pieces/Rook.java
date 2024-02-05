package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
	
	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() { //Letra que irá aparecer no tabuleiro de acordo com sua posicao
		return "R";
	}
	
}
