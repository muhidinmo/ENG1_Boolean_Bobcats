package com.team5.game.Sprites.Pathfinding;

import com.badlogic.gdx.math.Vector2;

public class Room extends Node{

    /*
    Room is used to differentiate hallways and rooms in the NodeGraph class
     */

    public Room(float x, float y, String name, Vector2 dimension) {
        super(x, y, name, dimension);
    }

    public Room(float x, float y, String name) {
        super(x, y, name);
    }
}
