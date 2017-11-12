package edu.cusut.lw.graph;

/**
 * 
 * @author Amy_oyzl
 *
 */
public class Line {
private Point p1;
	
	private Point p2;
	
	Line(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}
	
	void show() {
		System.out.println("I'm Line!");
		System.out.println("P1:(" + p1.getX() + "," + p1.getY() + ")");
		System.out.println("P2:(" + p2.getX() + "," + p2.getY() + ")");
	}
}
