package com.letters;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.debug.Debug;

import com.example.test4.AddLetter;
import com.example.test4.BlockPositionCheck;
import com.example.test4.Functions;
import com.example.test4.MainActivity;
import com.example.test4.PositionChecker;


public class Letter1 extends Sprite
{

	public static int letter1Count;
	
	public Letter1(float pX, float pY, ITextureRegion pTextureRegion,VertexBufferObjectManager vertexBufferObjectManager) 
	{
		super(pX, pY, pTextureRegion, vertexBufferObjectManager);
		// TODO Auto-generated constructor stub
	}
	
		@Override
		public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
		{
			switch (pSceneTouchEvent.getAction()) 
			{
			//On touch, enabling the merge
			case TouchEvent.ACTION_DOWN:
				
				//for 'akar' and 'mo'
				if(MainActivity.mergeEnable2==true)
				{
					//'ma' Sound
					Functions.playSound(MainActivity.maSound);
				}
				else
				{
					//'mo' Sound
					Functions.playSound(MainActivity.akarSound);
				}
				
				break;
			
			//On release stopping the merge
			case TouchEvent.ACTION_UP:
					
				break;
			
			//On Move, making it Drag
			case TouchEvent.ACTION_MOVE:
	
				for(int i=0; i<6; i++)
				{
					if(MainActivity.akar[i]!=null)
					{
						this.setPosition(pSceneTouchEvent.getX() - this.getWidth() / 2, 
								pSceneTouchEvent.getY() - this.getHeight() / 2);
						
						//Passing the value for checking the letters
						MainActivity.position(pSceneTouchEvent.getX() - this.getWidth() / 2, 
								pSceneTouchEvent.getY() - this.getHeight() / 2);
					
						 
					}
				}
				

				break;
			}

			return true;
		}
}
