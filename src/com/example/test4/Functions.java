package com.example.test4;

import org.andengine.audio.sound.Sound;

public class Functions
{
	
	// Method for playing sounds
	public static void playSound(Sound s) 
	{
		// TODO Auto-generated method stub
		if (s.isReleased() == true) 
		{

		} 
		else
		{
			s.play();
		}
	}
	
	//Scrolling Function
	protected synchronized static void doSetPos()
	{

		if (MainActivity.accel == 0)
		{
			return;
		}

		if (MainActivity.mCurrentY > 0)
		{
			MainActivity.mCurrentY = 0;
			MainActivity.mState = MainActivity.STATE_WAIT;
			MainActivity.accel0 = MainActivity.accel1 = MainActivity.accel = 0;
		}
		if (MainActivity.mCurrentY < -MainActivity.WRAPPER_HEIGHT)
		{
			MainActivity.mCurrentY = -MainActivity.WRAPPER_HEIGHT;
			MainActivity.mState = MainActivity.STATE_WAIT;
			MainActivity.accel0 = MainActivity.accel1 = MainActivity.accel = 0;
		}
		//Adding 20 letter box from LetterBox.letterBox2() method to scrolling
		for(int i=0; i<8; i++)
		{
			MainActivity.allLetter[i].setPosition(17.5f, MainActivity.mCurrentY + i*100);
		}
		
		//MainActivity.mWrapper.setPosition(0, MainActivity.mCurrentY);

		if (MainActivity.accel < 0 && MainActivity.accel < -MainActivity.MAX_ACCEL)
		{
			MainActivity.accel0 = MainActivity.accel1 = MainActivity.accel = -MainActivity.MAX_ACCEL;
		}

		if (MainActivity.accel > 0 && MainActivity.accel > MainActivity.MAX_ACCEL) 
		{
			MainActivity.accel0 = MainActivity.accel1 = MainActivity.accel = MainActivity.MAX_ACCEL;
		}

		double ny = MainActivity.accel / MainActivity.FREQ_D;

		if (ny >= -1 && ny <= 1)
		{
			MainActivity.mState = MainActivity.STATE_WAIT;
			MainActivity.accel0 = MainActivity.accel1 = MainActivity.accel = 0;
			return;
		}

		if (!(Double.isNaN(ny) || Double.isInfinite(ny))) 
		{
			MainActivity.mCurrentY += ny;
			MainActivity.accel = (MainActivity.accel * MainActivity.FRICTION);
		}

	}
}
