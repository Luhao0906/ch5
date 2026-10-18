public class Quadratic{
	public static void main(String[] args){
		equation(1.0,-3.0,2.0);
	}
	public static void equation(double a, double b, double c){
		double de = (b*b)-4*a*c;
		double solution1 = ((-b)-Math.sqrt(de))/(2.0*a);
		double solution2 = ((-b)+Math.sqrt(de))/(2.0*a);
		if (de > 0){
			System.out.println (solution1);
			System.out.println (solution2);
		}else if (de==0){
			System.out.println (solution2);
		}else {
			System.out.println ("no solution");
				}
		
		
		}}
	
	
