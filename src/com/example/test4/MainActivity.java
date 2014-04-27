package com.example.test4;

import java.io.IOException;
import org.andengine.audio.sound.Sound;
import org.andengine.audio.sound.SoundFactory;
import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.IEntity;
import org.andengine.entity.primitive.Rectangle;
import org.andengine.entity.scene.IOnAreaTouchListener;
import org.andengine.entity.scene.ITouchArea;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.input.touch.detector.ScrollDetector;
import org.andengine.input.touch.detector.ScrollDetector.IScrollDetectorListener;
import org.andengine.input.touch.detector.SurfaceScrollDetector;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.buildable.builder.BlackPawnTextureAtlasBuilder;
import org.andengine.opengl.texture.atlas.buildable.builder.ITextureAtlasBuilder.TextureAtlasBuilderException;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.color.Color;
import org.andengine.util.debug.Debug;

import com.letters.Letter1;
import com.letters.Letter2;
import com.letters.Letter3;
import com.letters.Letter4;
import com.letters.Letter5;
import com.letters.Letter6;
import com.letters.Letter7;

import android.view.Display;

public class MainActivity extends SimpleBaseGameActivity implements IScrollDetectorListener ,IOnAreaTouchListener
{

	public static int CAMERA_WIDTH;
	public static int CAMERA_HEIGHT;

	private Camera mCamera;
	public static Scene mScene;

	// Bitmap Texture For Bangla 'A' Letter
	private BuildableBitmapTextureAtlas mBitmapTextureAtlas;
	public static ITextureRegion mAkarTextureRegion;
	public static ITextureRegion mMOTextureRegion;
	public static ITextureRegion mMaTextureRegion;
	public static ITextureRegion mS1TextureRegion;
	
	//Loading ItextureRegion for twenty letters
	public static ITextureRegion mTextureRegion0;
	public static ITextureRegion mTextureRegion1;
	public static ITextureRegion mTextureRegion2;
	public static ITextureRegion mTextureRegion3;
	public static ITextureRegion mTextureRegion4;
	public static ITextureRegion mTextureRegion5;
	public static ITextureRegion mTextureRegion6;
	public static ITextureRegion mTextureRegion7;
	public static ITextureRegion mTextureRegion8;
	public static ITextureRegion mTextureRegion9;
	public static ITextureRegion mTextureRegion10;
	public static ITextureRegion mTextureRegion11;
	public static ITextureRegion mTextureRegion12;
	public static ITextureRegion mTextureRegion13;
	public static ITextureRegion mTextureRegion14;
	public static ITextureRegion mTextureRegion15;
	public static ITextureRegion mTextureRegion16;
	public static ITextureRegion mTextureRegion17;
	public static ITextureRegion mTextureRegion18;
	public static ITextureRegion mTextureRegion19;
	public static ITextureRegion mTextureRegion20;
	

	public Rectangle letterBox, rect1, scrollBar;
	//static vertexBufferObjectManager for creating Sprite and Rectangles in methods
	public static VertexBufferObjectManager vertexBufferObjectManager;

	public static float centerX, centerY;

	public static Sprite maImage;
	public static Letter1[] akar = new Letter1[6];
	public static Letter2[] mo = new Letter2[6];
	public static Letter3[] lo = new Letter3[6];
	public static Letter4[] ko = new Letter4[6];
	public static Letter5[] t = new Letter5[6];
	public static Letter6[] to = new Letter6[6];
	public static Letter7[] a = new Letter7[6];
	public static Scissor Scissor;
	public static Sound moSound, akarSound, maSound;
	
	public static int letterIdentifierNumber ;
	
	public static Sprite[] allLetter = new Sprite[20];
	
	public static float posX, posY;

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	public static boolean mergeEnable1 = false;
	public static boolean mergeEnable2 = false;

	public static int count1, count2;

	//This part is for LetterBox
	static final float FREQ_D = 120.0f;

	static final int STATE_WAIT = 0;
	static final int STATE_SCROLLING = 1;
	static final int STATE_MOMENTUM = 2;
	static final int STATE_DISABLE = 3;

	static final int WRAPPER_HEIGHT = 1260;
	static final float MAX_ACCEL = 5000;

	static final double FRICTION = 0.96f;

	public static TimerHandler mHandler,mSceneHandler;
	
	
	static int mState = STATE_DISABLE;
	static double accel, accel1;
	static double accel0;
	static float mCurrentY;
	static IEntity mWrapper;
	static SurfaceScrollDetector mScrollDetector;
	static long t0;
	
	public static int [] aVal;

	@SuppressWarnings("deprecation")
	@Override
	public EngineOptions onCreateEngineOptions() 
	{
		Display display = getWindowManager().getDefaultDisplay();
		CAMERA_WIDTH = display.getWidth();
		CAMERA_HEIGHT = display.getHeight();

		this.mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);

		EngineOptions en = new EngineOptions(true,ScreenOrientation.LANDSCAPE_SENSOR, new RatioResolutionPolicy(
						   CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
		// Setting MuliTouch
		en.getTouchOptions().setNeedsMultiTouch(true);
		// Setting Sound
		en.getAudioOptions().setNeedsSound(true);

		return en;
	}

	@Override
	protected void onCreateResources()
	{

		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");

		this.mBitmapTextureAtlas = new BuildableBitmapTextureAtlas(
				this.getTextureManager(), 512, 512);

		MainActivity.mAkarTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "a.png");
		MainActivity.mMOTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "mo.png");
		MainActivity.mMaTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "ma.png");
		MainActivity.mS1TextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "s3.png");
		
		MainActivity.mTextureRegion0 = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "mo.png");
		MainActivity.mTextureRegion1 = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
		MainActivity.mTextureRegion2 = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "lo.png");
		MainActivity.mTextureRegion3 = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "k.png");
		MainActivity.mTextureRegion4 = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "T.png");
		MainActivity.mTextureRegion5 = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "to.png");
		MainActivity.mTextureRegion6 = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "a.png");
		MainActivity.mTextureRegion7 = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion8 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion9 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion10 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion11 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion12 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion13 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion14 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion15 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion16 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion17 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion18 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion19 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");
//		MainActivity.mTextureRegion20 = BitmapTextureAtlasTextureRegionFactory
//				.createFromAsset(this.mBitmapTextureAtlas, this, "1.png");

		try 
		{
			this.mBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource,
					BitmapTextureAtlas>(0, 0, 0));
			this.mBitmapTextureAtlas.load();
		} 
		catch (TextureAtlasBuilderException e)
		{
			Debug.e(e);
		}

		SoundFactory.setAssetBasePath("mfx/");
		try 
		{
			MainActivity.akarSound = SoundFactory.createSoundFromAsset(
					this.mEngine.getSoundManager(), this, "akar.mp3");
			MainActivity.moSound = SoundFactory.createSoundFromAsset(
					this.mEngine.getSoundManager(), this, "mo.mp3");
			MainActivity.maSound = SoundFactory.createSoundFromAsset(
					this.mEngine.getSoundManager(), this, "ma.mp3");
		} 
		catch (final IOException e)
		{
			Debug.e(e);
		}

		mHandler = new TimerHandler(1.0f / FREQ_D, true, new ITimerCallback()
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler) 
			{
				// TODO Auto-generated method stub
				
				//Calling Scrolling Function
				Functions.doSetPos();
				
				//PositionChecker.checkArarPosition();
				
				PositionChecker.individualPositionCheck();
				whoArePresent.showPresent();
				
				//Checking if letter crosses the scrolling area or not
				PositionChecker.isOutOfScrollingArea();
				
			}
		});
	}

	
	protected Scene onCreateScene()
	{
		mScene = new Scene();
		mScene.setBackground(new Background(Color.WHITE));
		mScene.setTouchAreaBindingOnActionDownEnabled(true);

		mScrollDetector = new SurfaceScrollDetector(this);

		centerX = (CAMERA_WIDTH - MainActivity.mAkarTextureRegion.getWidth()) / 2;
		centerY = (CAMERA_HEIGHT - MainActivity.mAkarTextureRegion.getHeight()) / 2;

		//LetterBox.Letterbox2 for Blue letter boxes in the scene
		AddLetter.add();
		
		//LetterBox.letterbox1 for scrolling Rectangle
		scrollBar = LetterBox.LetterBox1(125, 0, 25, CAMERA_HEIGHT, getVertexBufferObjectManager());
		scrollBar.setColor(Color.RED);
		mScene.registerTouchArea(scrollBar);
		mScene.attachChild(scrollBar);
		
		mScene.registerUpdateHandler(mHandler);
		
		
		mState = STATE_WAIT;

		// Setting the maImage invisible
		maImage = new Sprite(CAMERA_WIDTH - 150, 0, MainActivity.mMaTextureRegion,
				this.getVertexBufferObjectManager());
		mScene.attachChild(maImage);
		maImage.setVisible(false);
		
		Scissor = new Scissor(CAMERA_WIDTH - 80, CAMERA_HEIGHT - 80,
				MainActivity.mS1TextureRegion, this.getVertexBufferObjectManager());
		mScene.registerTouchArea(Scissor);
		mScene.attachChild(Scissor);
		
		mScene.setOnAreaTouchListener(this);
		return mScene;
	}


	@Override
	public void onScrollStarted(ScrollDetector pScollDetector, int pPointerID,
			float pDistanceX, float pDistanceY) 
	{
		t0 = System.currentTimeMillis();
		mState = STATE_SCROLLING;
	}

	@Override
	public void onScroll(ScrollDetector pScollDetector, int pPointerID,
			float pDistanceX, float pDistanceY)
	{
		long dt = System.currentTimeMillis() - t0;
		if (dt == 0)
			return;

		// pixel/second
		double s = pDistanceY / (double) dt * 1000.0;
		accel = (accel0 + accel1 + s) / 3;
		accel0 = accel1;
		accel1 = accel;

		t0 = System.currentTimeMillis();
		mState = STATE_SCROLLING;

	}

	@Override
	public void onScrollFinished(ScrollDetector pScollDetector, int pPointerID,
			float pDistanceX, float pDistanceY) 
	{
		mState = STATE_MOMENTUM;
	}

	@Override
	public boolean onAreaTouched(TouchEvent pSceneTouchEvent, ITouchArea pTouchArea,
			float pTouchAreaLocalX, float pTouchAreaLocalY)
	{
		// TODO Auto-generated method stub
		if (pSceneTouchEvent.isActionDown())
		{
			AddLetter.addLetterByTouch((Sprite) pTouchArea);
			
			return true;
		}
		
		
		return false;
	}
	
	public static void position(float f, float f1) {
		// TODO Auto-generated method stub
		posX=f;
		posY=f1;
	}

	//static vertexBufferObjectManager
	public VertexBufferObjectManager VBO()
	{
		return vertexBufferObjectManager = getVertexBufferObjectManager();
	}

}