package com.example.test4;

import org.andengine.util.debug.Debug;


public class BlockPositionCheck 
{
	//moValue is holds the position value of mo letter
	//akarValue is holds the position value of akar letter
	public static int positionValue, moValue, akarValue;
	
	public static float dist1(float x1, float y1, float x2, float y2)
	{
		float X = x1-x2;
		//float Y = y1-y2;
		
		//Debug.d("Distance:"+X);
		
		return X;
	}
	
	
	
	public static int dist(float x1, float y1, float x2, float y2)
	{
		if(x1-x2>90 && x1-x2<110 && y1-y2<25 && y1-y2>-25)
		{
			//for akar - mo
			akarValue = 1;
			Debug.d("Close1");
			return akarValue;
		}
		else if(x2-x1>90 && x2-x1<110 && y2-y1<25 && y2-y1>-25)
		{
			//for mo - akar
			akarValue = 2;
			Debug.d("Close2");
			return akarValue;
		}
		else
		{
			Debug.d("Not Close");
			return 0;
		}
	}
	
//	public static int akarMoPositionCheck(int a, int b)
//	{
//		//Checking for 'akar' & 'mo' position
//		if(MainActivity.mo[a].getX() - MainActivity.akar[b].getX()>90
//		&& MainActivity.mo[a].getX() - MainActivity.akar[b].getX() < 110
//		&& MainActivity.mo[a].getY() - MainActivity.akar[b].getY() < 25
//		&& MainActivity.mo[a].getY() - MainActivity.akar[b].getY() > -25)
//		{
//			moValue= a;
//			akarValue= b;
//			//Flag for 'akar' & 'mo' position
//			positionValue= 1;
//		}
//		
//		//Checking for 'mo' & 'akar' position
//		else if(MainActivity.akar[b].getX() - MainActivity.mo[a].getX() > 90
//				&& MainActivity.akar[b].getX() - MainActivity.mo[a].getX() < 110
//				&& MainActivity.akar[b].getY() - MainActivity.mo[a].getY() < 25
//				&& MainActivity.akar[b].getY() - MainActivity.mo[a].getY() > -25)
//		{
//			moValue= a;
//			akarValue= b;
//			//Flag for 'mo' & 'akar' position
//			positionValue= 2;
//		}
//		
//		return positionValue;
//	}
	
//	public static boolean sideMergeCheck1()
//	{
//		if(MainActivity.mo[0].getX() - MainActivity.akar[0].getX() > 90
//			&& MainActivity.mo[0].getX() - MainActivity.akar[0].getX() < 110
//			&& MainActivity.mo[0].getY() - MainActivity.akar[0].getY() < 25
//			&& MainActivity.mo[0].getY() - MainActivity.akar[0].getY() > -25)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
//	
//	public static boolean sideMergeCheck2()
//	{
//		if(MainActivity.akar[0].getX() - MainActivity.mo[0].getX() > 90
//			&& MainActivity.akar[0].getX() - MainActivity.mo[0].getX() < 110
//			&& MainActivity.akar[0].getY() - MainActivity.mo[0].getY() < 25
//			&& MainActivity.akar[0].getY() - MainActivity.mo[0].getY() > -25)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
	
}