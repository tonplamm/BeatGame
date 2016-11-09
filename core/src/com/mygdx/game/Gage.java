package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Gage extends ScreenAdapter{
	
	SpriteBatch batch;
	BeatGame beatGame;
	PointScore pointScore;
	
	private Texture gage;
	public int pointGage=0;
	private int positionY=406;
	
	public Gage(BeatGame beatGame, PointScore pointScore){
		this.beatGame = beatGame;
		this.pointScore = pointScore;
		batch = beatGame.batch;
		gage = new Texture("gage.png");
	}
	
	@Override
	public void render(float delta){
		pointGage = pointScore.getPointGage();
		drawGageBar(pointGage);
	}
	
	public void drawGageBar(int pointForGageBar){
		switch(pointForGageBar%28){
		case 27: batch.draw(gage,350,positionY);
		case 26: batch.draw(gage,340,positionY);
		case 25: batch.draw(gage,330,positionY);
		case 24: batch.draw(gage,320,positionY);
		case 23: batch.draw(gage,310,positionY);
		case 22: batch.draw(gage,300,positionY);
		case 21: batch.draw(gage,290,positionY);
		case 20: batch.draw(gage,280,positionY);
		case 19: batch.draw(gage,270,positionY);
		case 18: batch.draw(gage,260,positionY);
		case 17: batch.draw(gage,250,positionY);
		case 16: batch.draw(gage,240,positionY);
		case 15: batch.draw(gage,230,positionY);
		case 14: batch.draw(gage,220,positionY);
		case 13: batch.draw(gage,210,positionY);
		case 12: batch.draw(gage,200,positionY);
		case 11: batch.draw(gage,190,positionY);
		case 10: batch.draw(gage,180,positionY);
		case 9: batch.draw(gage,170,positionY);
		case 8: batch.draw(gage,160,positionY);
		case 7: batch.draw(gage,150,positionY);
		case 6: batch.draw(gage,140,positionY);
		case 5: batch.draw(gage,130,positionY);
		case 4: batch.draw(gage,120,positionY);
		case 3: batch.draw(gage,110,positionY);
		case 2: batch.draw(gage,100,positionY);
		case 1: batch.draw(gage,90,positionY);
		}
	}
}