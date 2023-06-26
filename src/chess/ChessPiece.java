package chess;

import boardGame.Board;
import boardGame.Piece;

public abstract class ChessPiece extends Piece {
	
	private Color color;
	private Integer moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
