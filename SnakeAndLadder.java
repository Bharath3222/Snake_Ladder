package org.BL.pp;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// uc1
		int player = 1;
		int startPosition = 0;
		int dieCount=0;
		

		Random random = new Random();
		while(startPosition<100) {
		int dieRoll = random.nextInt(7);
		dieCount++;
		if(dieRoll==0)
			dieRoll=1;
		else
			dieRoll=dieRoll;
		//System.out.println("Rolled Die number is :"+ dieRoll);
		
		int options = random.nextInt(3);
		//System.out.println("choosing option is :"+ options);
		final int noPlay = 0;
		final int ladder = 1;
		final int snake = 2;
		switch (options) {
		case noPlay:
			startPosition = startPosition;
			break;
		case ladder:
			int position1 = dieRoll + startPosition;
			if (position1 < 101) {
				startPosition += dieRoll;
				break;
			}
		case snake:
			int position2 = startPosition - dieRoll;
			if (position2 < 0) {
				startPosition = 0;
				break;
			}
			}
		}
		System.out.println(dieCount+" times die rolled to reach winning position number at "+startPosition);
	
	}
	}


