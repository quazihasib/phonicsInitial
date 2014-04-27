package com.example.test4;

import org.andengine.entity.primitive.Rectangle;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.color.Color;

public class LetterBox 
{
	
	//LetterBox.letterbox1 for scrolling Rectangle
	public static Rectangle LetterBox1(float pX, float pY, int pWidth, int pHeight, VertexBufferObjectManager vertexBufferObjectManager)
	{

		Rectangle rect1 = new Rectangle(pX, pY, pWidth, pHeight, vertexBufferObjectManager )
		{

			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
			{

				switch (pSceneTouchEvent.getAction())
				{
				case TouchEvent.ACTION_DOWN:

					if (MainActivity.mState == MainActivity.STATE_DISABLE)
						return true;

					if (MainActivity.mState == MainActivity.STATE_MOMENTUM)
					{
						MainActivity.accel0 = MainActivity.accel1 = MainActivity.accel = 0;
						MainActivity.mState = MainActivity.STATE_WAIT;
					}

					MainActivity.mScrollDetector.onTouchEvent(pSceneTouchEvent);
					return true;

				case TouchEvent.ACTION_UP:

					break;

				case TouchEvent.ACTION_MOVE:

//					this.setPosition(125, pSceneTouchEvent.getY() -
//							this.getHeight() / 2);
					
					if (MainActivity.mState == MainActivity.STATE_DISABLE)
						return true;

					if (MainActivity.mState == MainActivity.STATE_MOMENTUM)
					{
						MainActivity.accel0 = MainActivity.accel1 = MainActivity.accel = 0;
						MainActivity.mState = MainActivity.STATE_WAIT;
					}

					MainActivity.mScrollDetector.onTouchEvent(pSceneTouchEvent);
					return true;
				}

				return true;
			}
		};
		return rect1;
	}
	
	
	public static Sprite LetterBox2(float pX, float pY, ITextureRegion Itextureregion, VertexBufferObjectManager vertexBufferObjectManager)
	{
		Sprite rect2 = new Sprite(pX, pY, Itextureregion, vertexBufferObjectManager);
		return rect2;
	}
	
	//LetterBox.Letterbox2 for Blue letter boxes in the scene
	public static Rectangle LetterBox3(float pX, float pY, int pWidth, int pHeight, VertexBufferObjectManager vertexBufferObjectManager)
	{
		Rectangle rect3 = new Rectangle(pX, pY, pWidth, pHeight, vertexBufferObjectManager)
		{

			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
			{

				switch (pSceneTouchEvent.getAction())
				{
				case TouchEvent.ACTION_DOWN:

					return true;

				case TouchEvent.ACTION_UP:

					break;

				case TouchEvent.ACTION_MOVE:
						
						this.setPosition(pSceneTouchEvent.getX() - 
								this.getWidth() / 2, pSceneTouchEvent.getY() -
								this.getHeight() / 2);
					
					return true;
				}

				return true;
			}
		};
		rect3.setColor(Color.YELLOW);
		return rect3;
	}
	
}
