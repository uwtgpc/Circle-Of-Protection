package com.uwtgpc.circleofprotection.gui;

import com.golden.gamedev.GameLoader;

import java.awt.Dimension;

/**
 * Created by IntelliJ IDEA. User: jim Date: 3/4/11 Time: 2:44 PM To change this template use File | Settings | File
 * Templates.
 */
public class CircleOfProtectionMain{
  public static void main(String[] args){
    GameLoader gl = new GameLoader();
    gl.setup(new CircleOfProtectionGUI(), new Dimension(640, 480), false);
    gl.start();
  }
}
