public class ExplicitDataTypeConversion{
	public static void main(String args []){
		double a = 50.50;
		System.out.println("Double presentation " + a);

		float f = (float)a;
		System.out.println("Float representation: " + f);

		long b = (long)a;
		System.out.println("Long representaion: " + b);

		int c = (int)b;
		System.out.println("Int representation: " + c);

	}
}
