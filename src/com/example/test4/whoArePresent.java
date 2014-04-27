package com.example.test4;

import org.andengine.entity.Entity;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.IEntityModifier;
import org.andengine.entity.modifier.LoopEntityModifier;
import org.andengine.entity.modifier.ParallelEntityModifier;
import org.andengine.entity.modifier.RotationModifier;
import org.andengine.entity.modifier.ScaleModifier;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.util.debug.Debug;

public class whoArePresent 
{
	
	public static int akar ;
	public static int mo ;
	public static int lo ;
	public static int ko ;
	
	public static int checkValue;
	
	public static void showPresent()
	{
		
		akar = PositionChecker.akar;
		mo = PositionChecker.mo;
		lo = PositionChecker.lo;
		ko = PositionChecker.ko;

		//1-akar mo lo ko
		if(akar == 1 && mo == 1 && lo == 1 && ko == 1)
		{
			//Debug.d("akar, mo, lo, ko");
			
			for(int i=0; i<4; i++)
			{
				for(int j=0; j<4; j++)
				{
					if(MainActivity.akar[i]!= null && MainActivity.mo[j]!= null)
					{
						int a = BlockPositionCheck.dist(MainActivity.akar[i].getX(), MainActivity.akar[i].getY(),
								MainActivity.mo[j].getX(), MainActivity.mo[j].getY());
						
						if(a==1)
						{
							
							Entity s = new Entity(12,21);
					        s.registerEntityModifier(new LoopEntityModifier((IEntityModifier) new ParallelEntityModifier(
					                        new SequenceEntityModifier(
					                                new ScaleModifier(3, 1, 0.5f),
					                                new ScaleModifier(3, 0.5f, 1)
					                        ))
					                ));
					 
					        
							MainActivity.akar[i].setParent(s);
							MainActivity.mo[j].setParent(s);
							//s.attachChild(MainActivity.akar[i]);
							//s.attachChild(MainActivity.mo[j]);
							MainActivity.mScene.attachChild(s);
						}
					}
				}
			}
			
		}
		//2-akar mo lo
		else if(akar == 1 && mo == 1 && lo == 1 )
		{
			Debug.d("akar, mo, lo");
		}
		//3-akar mo ko
		else if(akar == 1 && mo == 1 && ko == 1)
		{
			Debug.d("akar, mo, ko");
		}
		//4-mo lo ko
		else if(akar == 1  && lo == 1 && ko == 1)
		{
			Debug.d("akar, lo, ko");
		}
		//5-mo akar
		else if(mo == 1 && lo == 1 && ko == 1)
		{
			Debug.d(" mo, lo, ko");
		}
		//6-mo-lo
		else if(mo == 1 && lo == 1)
		{
			Debug.d("mo, lo");
		}
		//7-mo-ko
		else if(mo == 1 && ko == 1)
		{
			Debug.d("mo, ko");
		}	
		//8-lo-ko
		else if(lo == 1 && ko == 1)
		{
			Debug.d("lo, ko");
		}
		//9-akar-ko
		else if(akar == 1 && ko == 1)
		{
			Debug.d("akar, ko");
		}
		//10-akar-lo
		else if(akar == 1 && lo == 1)
		{
			Debug.d("akar, lo");
		}
		//11-akar-mo
		else if(akar == 1 && mo == 1)
		{
			Debug.d("akar, mo");
		}
		//12-akar
		else if(akar == 1)
		{
			Debug.d("akar");
		}
		//13-mo
		else if(mo == 1)
		{
			Debug.d("mo");
		}
		//14-lo
		else if(lo == 1)
		{
			Debug.d("lo");
		}
		//14-ko
		else if(ko == 1)
		{
			Debug.d("ko");
			
		}
		
	}
}
