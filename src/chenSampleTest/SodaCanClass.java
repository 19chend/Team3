package chenSampleTest;

public class SodaCanClass {
	private double radius;
	private double height;
	private final double COSTOFALUMINUM;
public SodaCanClass() {
	radius = 99;
	height = 99;
	COSTOFALUMINUM = 2.60;
}
public SodaCanClass(double newRadius, double newHeight) {
	if (radius < 0 || height < 0)
	{
		radius = 0;
		height = 0;
		COSTOFALUMINUM = 2.60;
	}
	else
	{
	radius = newRadius;
	height = newHeight;
	COSTOFALUMINUM = 2.60;
	}
}
public double getRadius() {
	return radius;
}
public double getHeight() {
	return height;
}
public double getCOSTOFALUMINUM() {
	return COSTOFALUMINUM;
}
public void setRadius(double newRadius) {
	radius = newRadius;
}
public void setHeight(double newHeight) {
	height = newHeight;
}
public double getSurfaceArea() {
	double area = (Math.PI*radius*radius*2)+(radius*2*Math.PI*height);
	return area;
}
public double getVolume() {
	double volume = (Math.PI*radius*radius*height);
	return volume;
}
public double getCost() {
	double cost = 2.60 * ((Math.PI*radius*radius*2)+(radius*2*Math.PI*height));
	return cost;
}
	
	
}


