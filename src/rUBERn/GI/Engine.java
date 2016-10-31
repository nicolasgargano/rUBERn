package rUBERn.GI;

// Created by nico on 10/29/16.

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class Engine extends StateBasedGame{
    public static void main(String[] args) {
        try {
            AppGameContainer game = new AppGameContainer(new Engine());
            game.setDisplayMode(1200, 600, false);
            game.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }

    }

    public Engine() {
        super("rUBERn");
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        gc.setMaximumLogicUpdateInterval(Settings.UPS);
        gc.setVSync(true);
        gc.setTargetFrameRate(Settings.UPS);

        this.addState(new SimulationState());
        this.addState(new MenuState());
    }
}