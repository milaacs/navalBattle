package br.com.navalbattle.entity;

public class Board{

	private int boardMatrix[] [];
	
	public Board(int x, int y) {
		this.boardMatrix = new int[x] [y];
	}

	public int[][] getBoardMatrix() {
		return boardMatrix;
	}

	public void setBoardMatrix(int[][] boardMatrix) {
		this.boardMatrix = boardMatrix;
	}

}
