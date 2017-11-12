package edu.cusut.lw.graph;

/**
 * 
 * @author Amy_oyzl
 *
 */
public class Point {
private int x;
	
	private int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	void show() {
		System.out.println("I'm Point!");
		System.out.println("P:(" + x + "," + y + ")");
		
		
//		for(int j = 0; j < y; j++)
//			System.out.println();
//		for(int i = 0; i < x; i++)
//			System.out.print(" ");
//		System.out.print("*");
		
	}
}
