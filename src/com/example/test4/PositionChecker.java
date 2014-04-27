package com.example.test4;

import org.andengine.util.debug.Debug;

public class PositionChecker 
{
	public static int akar, mo, lo, ko;
	
	public static int checkValue, mergeValue;
	
	//Individual position check
	public static void individualPositionCheck()
	{
		for(int i=0; i<6; i++)
		{
			if(MainActivity.akar[i]!=null)
			{
				akar = 1;
				//Debug.d("akar present");
			}
			
			if(MainActivity.mo[i]!=null)
			{
				mo = 1;
				//Debug.d("mo present");
			}
			
			if(MainActivity.lo[i]!=null)
			{
				lo = 1;
				//Debug.d("lo present");
			}
			
			if(MainActivity.ko[i]!=null)
			{
				ko = 1;
				//Debug.d("ko present");
			}
		}
	}

	public static void checkArarPosition()
	{
		// TODO Auto-generated method stub
		
		 if(MainActivity.akar[3]!=null)
			{
				if(MainActivity.posX == MainActivity.akar[3].getX() && MainActivity.posY == MainActivity.akar[3].getY())
				{
					Debug.d("3");
				} 
			}

		 if(MainActivity.akar[2]!=null)
			{
				if(MainActivity.posX == MainActivity.akar[2].getX() && MainActivity.posY == MainActivity.akar[2].getY())
				{
					Debug.d("2");
				}
			}
		 if(MainActivity.akar[1]!=null)
			{
				if(MainActivity.posX == MainActivity.akar[1].getX() && MainActivity.posY == MainActivity.akar[1].getY())
				{
					Debug.d("1");
					checkValue = whoArePresent.checkValue;
					float d1 = 0, d2 = 0;
					
					//akar-mo-lo
					if(checkValue == 1)
					{
						if(MainActivity.akar[1]!= null)
						{
							for(int i=0; i<6; i++)
							{
								if(MainActivity.mo[i]!= null)
								{
									d1 =BlockPositionCheck.dist1(MainActivity.akar[1].getX(),
											MainActivity.akar[1].getY(), MainActivity.mo[i].getX(), 
											MainActivity.mo[i].getY());
									
									if(MainActivity.mo[2]!= null)
									{
										d2 =BlockPositionCheck.dist1(MainActivity.akar[1].getX(),
												MainActivity.akar[1].getY(), MainActivity.mo[2].getX(), 
												MainActivity.mo[2].getY()); 
										
										checkValue = 0;
									}
								}
							}
								
								
							if((d2-d1>90 && d2-d1<110) || (d2-d1<-90 && d2-d1>-110))
							{
								mergeValue = 1;
								Debug.d("They are merged");
							}
							

						}
						
					}
				}
			}
		 
	}

	public static void isOutOfScrollingArea() 
	{
		// TODO Auto-generated method stub
		for(int i=0; i<6; i++)
		{
			if(MainActivity.mo[i]!= null)
			{
				if(MainActivity.mo[i].getX()<=130)
				{
					MainActivity.mo[i].setX(130);
				}
			}
			if(MainActivity.akar[i]!= null)
			{
				if(MainActivity.akar[i].getX()<=130)
				{
					MainActivity.akar[i].setX(130);
				}
			}
		}
	}

	
}
