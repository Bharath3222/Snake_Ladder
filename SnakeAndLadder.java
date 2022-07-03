package org.BL.pp;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// uc1
		int player = 1;
		int startPosition = 0;
		
		//uc2
		Random random = new Random();
		int dieRoll = random.nextInt(7);
		if(dieRoll==0)
			dieRoll=1;
		else
			dieRoll=dieRoll;
		System.out.println("Rolled Die number is :"+ dieRoll);
	}
	}


