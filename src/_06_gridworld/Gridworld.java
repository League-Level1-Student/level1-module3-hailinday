package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
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
	}
}
