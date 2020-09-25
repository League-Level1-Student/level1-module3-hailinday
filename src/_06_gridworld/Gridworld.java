package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String args []) {
		World world = new World();
		world.show();
		Bug bug1 = new Bug();
		Bug bug2 = new Bug(Color.BLUE);
		Location loc1 = new Location(5,5);
		Location loc2 = new Location(7,6);
		world.add(loc1, bug1);
		world.add(loc2, bug2);
		bug2.turn();
		bug2.turn();
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		Location loc3 = new Location(7,5);
		Location loc4 = new Location(7,7);
		world.add(loc3, flower1);
		world.add(loc4, flower2);
		for(int a = 0; a < 10; a++) {
		for(int i = 0; i < 10; i++) {
			Location loc5 = new Location(i,a);
			world.add(loc5, flower1);
		}
		}
	}
}
