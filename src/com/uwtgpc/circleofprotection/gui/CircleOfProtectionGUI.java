package com.uwtgpc.circleofprotection.gui;

import com.golden.gamedev.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 * Created by IntelliJ IDEA. User: jim Date: 3/4/11 Time: 2:44 PM To change this template use File | Settings | File
 * Templates.
 */
public class CircleOfProtectionGUI extends Game{
  @Override
  public void initResources(){

  }

  @Override
  public void update(long l){

  }

  @Override
  public void render(Graphics2D graphics2D){
    graphics2D.setColor(Color.white);
    graphics2D.fillRect(0, 0, getWidth(), getHeight());
    graphics2D.setColor(Color.black);
    graphics2D.setFont(new Font("Helvetica", Font.PLAIN, 18));
    graphics2D.drawString("Hello World!", 100, 100);
  }
}
