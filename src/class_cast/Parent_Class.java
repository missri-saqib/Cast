package class_cast;

public class Parent_Class {
	public void method_one() {
System.out.println("Parent Class One");
}
	public void method_two() { 
System.out.println("Parent Class two");
}
	public static void main(String[] args) {
		Parent_Class type = new Child_Class();
		type.method_one();
		type.method_two();
	}
}