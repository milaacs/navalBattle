package br.com.navalbattle.manager;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.navalbattle.entity.Board;

public class GameManager {

	public void createBoard(){
		
		
		boolean isOk = false;
		 
		int x,y;
		 
		 Scanner scan = new Scanner(System.in);
		 
		do {
			try {
				System.out.println("Informe o x da matriz: ");
				x = scan.nextInt();
				System.out.println("Informe o y da matriz: ");
				y = scan.nextInt();
				
				isOk = true;
				Board board = new Board(x,y);
				
			} catch (InputMismatchException e) {
				scan.next();
				scan.reset();
				System.out.println("Por favor informe apenas um valor numérico!");
				
			}

		} while (!isOk);
	}
}

