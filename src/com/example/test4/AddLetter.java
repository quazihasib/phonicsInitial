package com.example.test4;

import org.andengine.entity.sprite.Sprite;
import org.andengine.util.color.Color;
import org.andengine.util.debug.Debug;

import com.letters.Letter1;
import com.letters.Letter2;
import com.letters.Letter3;
import com.letters.Letter4;
import com.letters.Letter5;
import com.letters.Letter6;
import com.letters.Letter7;

public class AddLetter
{
	public static int moCount, akarCount, loCount, koCount, tCount, toCount, aCount;
	//Maximum number of letters for each one
	public static int totalNumberForEachLetter = 3;

	public static void add()
	{
		MainActivity.allLetter[0] = LetterBox.LetterBox2(17.5f, 0 * 100 , MainActivity.mTextureRegion0, MainActivity.vertexBufferObjectManager);
		MainActivity.mScene.registerTouchArea(MainActivity.allLetter[0]);
		MainActivity.allLetter[0].setColor(Color.BLUE);
		MainActivity.mScene.attachChild(MainActivity.allLetter[0]);
		
		
		MainActivity.allLetter[1] = LetterBox.LetterBox2(17.5f, 1 * 100 , MainActivity.mTextureRegion1, MainActivity.vertexBufferObjectManager);
		MainActivity.mScene.registerTouchArea(MainActivity.allLetter[1]);
		MainActivity.allLetter[1].setColor(Color.BLUE);
		MainActivity.mScene.attachChild(MainActivity.allLetter[1]);
		
		
		MainActivity.allLetter[2] = LetterBox.LetterBox2(17.5f, 2 * 100 , MainActivity.mTextureRegion2, MainActivity.vertexBufferObjectManager);
		MainActivity.mScene.registerTouchArea(MainActivity.allLetter[2]);
		MainActivity.allLetter[2].setColor(Color.BLUE);
		MainActivity.mScene.attachChild(MainActivity.allLetter[2]);
		
		
		MainActivity.allLetter[3] = LetterBox.LetterBox2(17.5f, 3 * 100 , MainActivity.mTextureRegion3, MainActivity.vertexBufferObjectManager);
		MainActivity.mScene.registerTouchArea(MainActivity.allLetter[3]);
		MainActivity.allLetter[3].setColor(Color.BLUE);
		MainActivity.mScene.attachChild(MainActivity.allLetter[3]);
		
		MainActivity.allLetter[4] = LetterBox.LetterBox2(17.5f, 4 * 100 , MainActivity.mTextureRegion4, MainActivity.vertexBufferObjectManager);
		MainActivity.mScene.registerTouchArea(MainActivity.allLetter[4]);
		MainActivity.allLetter[4].setColor(Color.BLUE);
		MainActivity.mScene.attachChild(MainActivity.allLetter[4]);
		
		
		MainActivity.allLetter[5] = LetterBox.LetterBox2(17.5f, 5 * 100 , MainActivity.mTextureRegion5, MainActivity.vertexBufferObjectManager);
		MainActivity.mScene.registerTouchArea(MainActivity.allLetter[5]);
		MainActivity.allLetter[5].setColor(Color.BLUE);
		MainActivity.mScene.attachChild(MainActivity.allLetter[5]);
		
		MainActivity.allLetter[6] = LetterBox.LetterBox2(17.5f, 6 * 100 , MainActivity.mTextureRegion6, MainActivity.vertexBufferObjectManager);
		MainActivity.mScene.registerTouchArea(MainActivity.allLetter[6]);
		MainActivity.allLetter[6].setColor(Color.BLUE);
		MainActivity.mScene.attachChild(MainActivity.allLetter[6]);
		
		
		MainActivity.allLetter[7] = LetterBox.LetterBox2(17.5f, 7 * 100 , MainActivity.mTextureRegion7, MainActivity.vertexBufferObjectManager);
		MainActivity.mScene.registerTouchArea(MainActivity.allLetter[7]);
		MainActivity.allLetter[7].setColor(Color.BLUE);
		MainActivity.mScene.attachChild(MainActivity.allLetter[7]);
	}
	
	// Each Letter specifying and dragged
	public static void addLetterByTouch(Sprite pTouchArea) 
	{
		// TODO Auto-generated method stub
		if ((Sprite) pTouchArea == MainActivity.allLetter[0]) 
		{
			Debug.d("1st one is touched");

			moCount++;
			Debug.d("i:" + moCount);
			if (moCount <= totalNumberForEachLetter)
			{
				MainActivity.mo[moCount] = new Letter2(pTouchArea.getX(),
						pTouchArea.getY(), MainActivity.mTextureRegion0,
						MainActivity.vertexBufferObjectManager);
				MainActivity.mScene.registerTouchArea(MainActivity.mo[moCount]);
				MainActivity.mScene.attachChild(MainActivity.mo[moCount]);
			}
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[1])
		{
			Debug.d("2nd one is touched");

			akarCount++;
			if (akarCount <= totalNumberForEachLetter)
			{
				MainActivity.akar[akarCount] = new Letter1(pTouchArea.getX(),pTouchArea.getY(), 
				MainActivity.mTextureRegion1, MainActivity.vertexBufferObjectManager);
				
				MainActivity.mScene.registerTouchArea(MainActivity.akar[akarCount]);
				MainActivity.mScene.attachChild(MainActivity.akar[akarCount]);
			}
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[2]) 
		{
			Debug.d("3rd one is touched");

			loCount++;
			if (loCount <= totalNumberForEachLetter)
			{
				MainActivity.lo[loCount] = new Letter3(pTouchArea.getX(),
						pTouchArea.getY(), MainActivity.mTextureRegion2,
						MainActivity.vertexBufferObjectManager);

				MainActivity.mScene.registerTouchArea(MainActivity.lo[loCount]);
				MainActivity.mScene.attachChild(MainActivity.lo[loCount]);
			}
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[3]) 
		{
			Debug.d("4th one is touched");
			
			koCount++;
			if (koCount <= totalNumberForEachLetter)
			{
				MainActivity.ko[koCount] = new Letter4(pTouchArea.getX(),
						pTouchArea.getY(), MainActivity.mTextureRegion3,
						MainActivity.vertexBufferObjectManager);

				MainActivity.mScene.registerTouchArea(MainActivity.ko[koCount]);
				MainActivity.mScene.attachChild(MainActivity.ko[koCount]);
			}
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[4])
		{
			Debug.d("5th one is touched");
			
			tCount++;
			if (tCount <= totalNumberForEachLetter)
			{
				MainActivity.t[tCount] = new Letter5(pTouchArea.getX(),
						pTouchArea.getY(), MainActivity.mTextureRegion4,
						MainActivity.vertexBufferObjectManager);

				MainActivity.mScene.registerTouchArea(MainActivity.t[tCount]);
				MainActivity.mScene.attachChild(MainActivity.t[tCount]);
			}
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[5])
		{
			Debug.d("6th one is touched");
			
			toCount++;
			if (toCount <= totalNumberForEachLetter)
			{
				MainActivity.to[toCount] = new Letter6(pTouchArea.getX(),
						pTouchArea.getY(), MainActivity.mTextureRegion5,
						MainActivity.vertexBufferObjectManager);

				MainActivity.mScene.registerTouchArea(MainActivity.to[toCount]);
				MainActivity.mScene.attachChild(MainActivity.to[toCount]);
			}
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[6]) 
		{
			Debug.d("7th one is touched");
			
			aCount++;
			if (aCount <= totalNumberForEachLetter)
			{
				MainActivity.a[aCount] = new Letter7(pTouchArea.getX(),
						pTouchArea.getY(), MainActivity.mTextureRegion6,
						MainActivity.vertexBufferObjectManager);

				MainActivity.mScene.registerTouchArea(MainActivity.a[aCount]);
				MainActivity.mScene.attachChild(MainActivity.a[aCount]);
			}
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[7]) 
		{
			Debug.d("8th one is touched");
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[8]) 
		{
			Debug.d("9th one is touched");
		}
		else if ((Sprite) pTouchArea == MainActivity.allLetter[9]) 
		{
			Debug.d("10th one is touched");
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[10])
		{
			Debug.d("11th one is touched");
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[11]) 
		{
			Debug.d("12th one is touched");
		}
		else if ((Sprite) pTouchArea == MainActivity.allLetter[12])
		{
			Debug.d("13th one is touched");
		}
		else if ((Sprite) pTouchArea == MainActivity.allLetter[13])
		{
			Debug.d("14th one is touched");
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[14]) 
		{
			Debug.d("15th one is touched");
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[15]) 
		{
			Debug.d("16th one is touched");
		}
		else if ((Sprite) pTouchArea == MainActivity.allLetter[16]) 
		{
			Debug.d("17th one is touched");
		}
		else if ((Sprite) pTouchArea == MainActivity.allLetter[17])
		{
			Debug.d("18th one is touched");
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[18]) 
		{
			Debug.d("19th one is touched");
		} 
		else if ((Sprite) pTouchArea == MainActivity.allLetter[19]) 
		{
			Debug.d("20th one is touched");
		}

	}
}
