public class Triangle{
	public static void main(String[] args){
		System.out.println(length(1.0,2.0,2.0));
	}
	public static boolean length(double a, double b, double c){
		if (a>0 && b>0 && c>0){
		if (a+b >= c && a+c >= b && b+c >= a){
			return true;
			}else{
				return false;
				}
		
	}else{
		return false;
		}
		}}
