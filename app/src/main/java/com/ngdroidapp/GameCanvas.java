package com.ngdroidapp;

import android.graphics.Canvas;

import istanbul.gamelab.ngdroid.base.BaseCanvas;
import istanbul.gamelab.ngdroid.util.Log;


/**
 * Created by Kadir and İsmail on 22.11.2017.
 * ??? Games Ltd.
 */


public class GameCanvas extends BaseCanvas {


    public GameCanvas(NgApp ngApp) {
        super(ngApp);
    }

    public void setup() {



    }



    public void update() {


    }

    public void draw(Canvas canvas) {
        Log.i(TAG, "draw");
    }

    public void keyPressed(int key) {

    }

    public void keyReleased(int key) {

    }

    public boolean backPressed() {
        return true;
    }

    public void surfaceChanged(int width, int height) {

    }

    public void surfaceCreated() {

    }

    public void surfaceDestroyed() {

    }

    public void touchDown(int x, int y) {
    }

    public void touchMove(int x, int y) {
    }

    public void touchUp(int x, int y) {
    }


    public void pause() {

    }


    public void resume() {

    }


    public void reloadTextures() {

    }


    public void showNotify() {
    }

    public void hideNotify() {
    }

}
