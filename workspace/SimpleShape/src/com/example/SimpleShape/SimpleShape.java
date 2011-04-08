package com.example.SimpleShape;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;

public class SimpleShape extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SimpleView(this));
        //setContentView(R.layout.main);
       
        
    }
     
    
     private static class SimpleView extends View {       // Create View.
        	private ShapeDrawable mDrawable = new ShapeDrawable();  // Create ShapeDrawable to hold Drawable.
        	public SimpleView(Context context) {
        	super(context);
        	setFocusable(true);
        	this.mDrawable = new ShapeDrawable(new RectShape());  //Create Rectangle and  assign to mDrawable
        	this.mDrawable.getPaint().setColor(0xFFFF0000);
        	}
        	@Override
        	protected void onDraw(Canvas canvas) {  // The onDraw method draws the graphics
        	int x = 10;
        	int y = 10;
        	int width = 300;
        	int height = 50;
        	this.mDrawable.setBounds(x, y, x + width, y + height);  //Set boundaries and draw on canvas
        	this.mDrawable.draw(canvas);
        	y += height + 5;
        	} 	
    }
}
 
    