
public class Two extends Interpol{
public Two() {
	for(int i = 0; i < list.size(); i++) {
		Data obj = list.get(i);
		double y = squart(cos(obj.getX())-1);
		obj.setY(y);
		System.out.println("F("+obj.getX()+") = " + obj.getY());
		}
}

private double cos(double x){
	return Math.cos(Math.toRadians(5*x-2));
}

private double squart(double v){
	return Math.sqrt(v * -1);
}
}
