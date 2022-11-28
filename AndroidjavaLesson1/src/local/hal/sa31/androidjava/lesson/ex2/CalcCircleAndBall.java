package local.hal.sa31.androidjava.lesson.ex2;

/**
 * SA31 Android用Java文法 Lesson1 Ex2
 * 円級計算クラス
 * @author nitoe
 *
 */
public class CalcCircleAndBall {
	/*
	 * 半径を表すフィールド
	 */
	private double _radius = 0;
	/*
	 * 円周率を表す定数フィールド
	 */
	private static final double PI = 3.14;
	
	public CalcCircleAndBall(double radius) {
		_radius = radius;
	}
	
	public double get_radius() {
		return _radius;
	}

	public double getCircle() {
		double circle = 2 * PI * _radius;
		return circle;
	}
	public double getArea() {
		double area = PI * _radius * _radius;
		return area;
	}
	public double getSurface() {
		double surface = 4 * PI * _radius * _radius;
		return surface;
	}
	public double getVolume() {
		double volume = 4 * PI * _radius * _radius * _radius / 3;
		return volume;
	}
}
