package com.example.test4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.andengine.engine.camera.Camera;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class shape extends Sprite {
 
    private List<shape> mChilds = new ArrayList<shape>();
    private Sprite mParent;
 
    public shape(float pX, float pY, TextureRegion pTextureRegion, VertexBufferObjectManager v) 
    {
        super(pX, pY, pTextureRegion, v);
    }
 
    public void addEntity(shape pSprite) {
        this.mChilds.add(pSprite);
        pSprite.setParent(this);
    }
 
    public void setParent(Sprite pParent) {
        this.mParent = pParent;
    }
 
//    @Override
//    protected void onManagedDraw(GL20 pGL, Camera pCamera) {
//        super.onManagedDraw(pGL, pCamera);
//        for (Iterator<shape> it = mChilds.iterator(); it.hasNext();) {
//            it.next().onDraw(pGL, pCamera);
//        }
//    }
// 
//    @Override
//    protected void applyTranslation(GL10 pGL) {
//        if (mParent == null) {
//            super.applyTranslation(pGL);
//        } else {
//            float[] coor = mParent.convertLocalToSceneCoordinates(mX, mY);
//            pGL.glTranslatef(coor[0], coor[1], 0);
//        }
// 
//    }
// 
//    @Override
//    protected void applyRotation(GL10 pGL) {
//        if (mParent == null) {
//            super.applyRotation(pGL);
//        } else {
//            final float rotation = this.mParent.getRotation();
//            if (rotation != 0) {
//                pGL.glRotatef(rotation, 0, 0, 1);
//            }
//        }
//    }
// 
//    @Override
//    protected void applyScale(GL10 pGL) {
//        if (mParent == null) {
//            super.applyScale(pGL);
//        } else {
//            final float scaleX = this.mScaleX * this.mParent.getScaleX();
//            final float scaleY = this.mScaleY * this.mParent.getScaleY();
//            if (scaleX != 1 || scaleY != 1) {
//                pGL.glScalef(scaleX, scaleY, 1);
//            }
//        }
// 
//    }
   
}