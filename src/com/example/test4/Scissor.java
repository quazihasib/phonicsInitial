package com.example.test4;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class Scissor extends Sprite
{

	public Scissor(float pX, float pY, ITextureRegion pTextureRegion,
			VertexBufferObjectManager vertexBufferObjectManager)
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
			
			break;
		
		//On release stopping the merge
		case TouchEvent.ACTION_UP:
				
				Paths.scissorPath();
			
			break;
		
		//On Move, making it Drag
		case TouchEvent.ACTION_MOVE:
			
			this.setPosition(pSceneTouchEvent.getX() - this.getWidth() / 2,
					pSceneTouchEvent.getY() - this.getHeight() / 2);
			
			break;
		}

		return true;
	}
	
}
