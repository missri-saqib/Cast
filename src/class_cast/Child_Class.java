package class_cast;

public class Child_Class extends Parent_Class{
@Override
public void method_one() {
	System.out.println("Child Class One");
	super.method_one();
}
@Override
	public void method_two() {
      System.out.println("Child Class Two");
	super.method_two();
	}
public void method_three() {
System.out.println("Child Class Three");
}
public static void main(String[] args) {
	Child_Class son = (Child_Class) new Parent_Class();
	son.method_one();
	son.method_two();
	son.method_three();
}
}