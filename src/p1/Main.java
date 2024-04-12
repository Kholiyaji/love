package p1;

import p2.DiffPkgNonSubClass;
import p2.DiffPkgSubClass;

class Temp extends SubClass {
	Temp() {
		System.out.println("\n\n\tsame package subclass");
		System.out.println(e);
//		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}

class Temp1 extends DiffPkgSubClass {
	Temp1() {
		System.out.println("\n\n\tdifferent package subclass");
		System.out.println(m);
//		System.out.println(n);
		System.out.println(o);
//		System.out.println(p);
	}
}

public class Main extends SubClass {
	public int a = 10;
	private int b = 10;
	protected int c = 10;
	int d = 10;

	public static void main(String[] args) {
		Main obj = new Main();
		
		System.out.println("\n\n\tsame class");
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
		Temp o1 = new Temp();
		
		System.out.println("\n\n\tsame package non subclass");
		NonSubClass o2 = new NonSubClass();
		System.out.println(o2.a);
//		System.out.println(o2.b);
		System.out.println(o2.c);
		System.out.println(o2.d);
		
		Temp1 o3 = new Temp1();
		
		System.out.println("\n\n\tdifferent package non subclass");
		DiffPkgNonSubClass o4 = new DiffPkgNonSubClass();
		System.out.println(o4.i);
//		System.out.println(o4.j);
//		System.out.println(o4.k);
//		System.out.println(o4.l);
	}
}