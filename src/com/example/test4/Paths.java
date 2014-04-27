package com.example.test4;

import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.util.debug.Debug;

public class Paths 
{
	
	//Paths after using scissor and splitting the words
	public static void splitPath()
	{
		//Splitting for 'akar' and 'mo'
		if(MainActivity.count1 == 1)
		{
			final Path splitPath = new Path(2).to(MainActivity.akar[BlockPositionCheck.akarValue].getX(), MainActivity.akar[BlockPositionCheck.akarValue].getY())
					.to(MainActivity.akar[BlockPositionCheck.akarValue].getX()-20, MainActivity.akar[BlockPositionCheck.akarValue].getY());
		
			MainActivity.akar[BlockPositionCheck.akarValue].registerEntityModifier(new PathModifier((float)0.3, splitPath, null, new IPathModifierListener() 
			{
				@Override
				public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
				{
					Debug.d("onPathStarted");
				}

				@Override
				public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
				{
					Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
			
				}

				@Override
				public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) {
					Debug.d("onPathWaypointFinished: " + pWaypointIndex);
				}

				@Override
				public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
				{
					
				}
			}));
			
			final Path moPath = new Path(2).to(MainActivity.mo[BlockPositionCheck.moValue].getX(), MainActivity.mo[BlockPositionCheck.moValue].getY())
					.to(MainActivity.mo[BlockPositionCheck.moValue].getX()+20, MainActivity.mo[BlockPositionCheck.moValue].getY());
		
			MainActivity.mo[BlockPositionCheck.moValue].registerEntityModifier(new PathModifier((float)0.3, moPath, null, new IPathModifierListener() 
			{
				@Override
				public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
				{
					Debug.d("onPathStarted");
				}

				@Override
				public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
				{
					Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
				}

				@Override
				public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
				{
					Debug.d("onPathWaypointFinished: " + pWaypointIndex);
				}

				@Override
				public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
				{

				}
			}));
		}
		//Splitting for 'mo' and 'akar'
		else if(MainActivity.count2 == 1)
		{
			final Path splitPath = new Path(2).to(MainActivity.akar[BlockPositionCheck.akarValue].getX(), MainActivity.akar[BlockPositionCheck.akarValue].getY())
					.to(MainActivity.akar[BlockPositionCheck.akarValue].getX()+20, MainActivity.akar[BlockPositionCheck.akarValue].getY());
		
			MainActivity.akar[BlockPositionCheck.akarValue].registerEntityModifier(new PathModifier((float)0.3, splitPath, null, new IPathModifierListener() 
			{
				@Override
				public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
				{
					Debug.d("onPathStarted");
				}

				@Override
				public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
				{
					Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
			
				}

				@Override
				public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) {
					Debug.d("onPathWaypointFinished: " + pWaypointIndex);
				}

				@Override
				public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
				{

				}
			}));
			
			final Path moPath = new Path(2).to(MainActivity.mo[BlockPositionCheck.moValue].getX(), MainActivity.mo[BlockPositionCheck.moValue].getY())
					.to(MainActivity.mo[BlockPositionCheck.moValue].getX()-20, MainActivity.mo[BlockPositionCheck.moValue].getY());
		
			MainActivity.mo[BlockPositionCheck.moValue].registerEntityModifier(new PathModifier((float)0.3, moPath, null, new IPathModifierListener() 
			{
				@Override
				public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
				{
					Debug.d("onPathStarted");
				}

				@Override
				public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
				{
					Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
				}

				@Override
				public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
				{
					Debug.d("onPathWaypointFinished: " + pWaypointIndex);
				}

				@Override
				public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
				{

				}
			}));
		}
	}
	
	//Scissor Paths
	public static void scissorPath()
	{
		final Path scissorPath = new Path(2).to(MainActivity.Scissor.getX(), MainActivity.Scissor.getY())
				.to(MainActivity.CAMERA_WIDTH - 80, MainActivity.CAMERA_HEIGHT - 80);
		
		MainActivity.Scissor.registerEntityModifier(new PathModifier((float)0.3, scissorPath, null, new IPathModifierListener() {
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				Debug.d("onPathStarted");
			}

			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) {
				Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
			
			}

			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) {
				Debug.d("onPathWaypointFinished: " + pWaypointIndex);
			}

			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				MainActivity.count1 = 0;
				MainActivity.count2 = 0;
			}
		}));
	}
}
