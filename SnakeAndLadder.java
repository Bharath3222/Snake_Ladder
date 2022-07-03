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
		
	//uc3
		int options = random.nextInt(3);
		System.out.println("choosing option is :"+ options);
		final int noPlay = 0;
		final int ladder = 1;
		final int snake = 2;
		switch (options) {
		case noPlay:
			startPosition = startPosition;
			break;
		case ladder:
				startPosition += dieRoll;
				break;
		case snake:
		 startPosition -= dieRoll;
				break;
			}
		System.out.println("now Player postion at point : "+startPosition);
	
	}
	}


