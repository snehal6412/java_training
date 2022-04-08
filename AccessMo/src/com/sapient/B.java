package com.sapient;

import com.sapient.A;

/*public class B {
	public static void main(String args[]) {
		A obj = new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
*/
public class B extends A
{ public static void main(String args[])
{ B obj = new B();
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c);
System.out.println(obj.d);
} }