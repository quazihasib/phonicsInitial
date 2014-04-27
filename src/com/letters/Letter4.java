package com.letters;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import com.example.test4.MainActivity;



public class Letter4  extends Sprite
{

	public static int letter4Count;
	
	public Letter4(float pX, float pY, ITextureRegion pTextureRegion,VertexBufferObjectManager vertexBufferObjectManager) 
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
//					Functions.playSound(MainActivity.maSound);
				}
				else
				{
					//'mo' Sound
//					Functions.playSound(MainActivity.akarSound);
				}
				
				break;
			
			//On release stopping the merge
			case TouchEvent.ACTION_UP:
					
				break;
			
			//On Move, making it Drag
			case TouchEvent.ACTION_MOVE:
				
				this.setPosition(pSceneTouchEvent.getX() - this.getWidth() / 2, 
						pSceneTouchEvent.getY() - this.getHeight() / 2);
				//for 'akar' and 'mo'
//				if(MainActivity.mergeEnable1 == true)
//				{
//					this.setPosition(pSceneTouchEvent.getX() - this.getWidth() / 2,
//					pSceneTouchEvent.getY() - this.getHeight() / 2);
//					
//					MainActivity.mo[0].setPosition(pSceneTouchEvent.getX()+100 - 
//					MainActivity.akar[0].getWidth() / 2, pSceneTouchEvent.getY() -
//					MainActivity.akar[0].getHeight() / 2);
//
//				}
//				//for 'mo' and 'akar'
//				else if(MainActivity.mergeEnable2 == true)
//				{
//					this.setPosition(pSceneTouchEvent.getX() - this.getWidth() / 2, 
//					pSceneTouchEvent.getY() - this.getHeight() / 2);
//					
//					MainActivity.mo[0].setPosition(pSceneTouchEvent.getX()-100 - 
//					MainActivity.akar[0].getWidth() / 2, pSceneTouchEvent.getY() -
//					MainActivity.akar[0].getHeight() / 2);
//				}
//				else
//				{
//					this.setPosition(pSceneTouchEvent.getX() - this.getWidth() / 2, 
//					pSceneTouchEvent.getY() - this.getHeight() / 2);
//				}
//				
//				break;
			}

			return true;
		}

}
