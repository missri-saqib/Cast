package cast_type;

public class Type_Cast {
public static void main(String[] args) {
	//widening
	float f= 3457484.743424251f;
	double d= f;
	System.out.println(d);
	//narrowing
	double c = 45783.94844;
	float a = (float) c;
	System.out.println(a);
	int i = 3258595;
	byte b = (byte) i;
	System.out.println(b);
}
}
