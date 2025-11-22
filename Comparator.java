package apps;

import java.util.*;

public class A {

	String name;

	public A(String string) {
		// TODO Auto-generated constructor stub
		this.name = string;
	}

	public static void main(String[] args) {

		A a1 = new A("karthik");
		A a2 = new A("ajith");
		A a3 = new A("kavin");
		A a4 = new A("madan");

		A[] arr = { a1, a2, a3, a4 };

		String[] sarr = { "karthikeyan", "ajithkumar", "kavin", "madanop" };

		C c = new C();

		Arrays.sort(sarr, c);

		for (int i = 0; i < sarr.length; i++)
			System.out.println(sarr[i]);

	}

}

class C implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String) o1;
		String s2 = (String) o2;
		int res = s1.compareTo(s2);
//		if (res > 0)
//			return 1;
//		else if (res < 0)
//			return -1;
//		else
//			return 0;

		if (s1.length() < s2.length())
			return -1;
		else if (s1.length() > s2.length())
			return 1;
		else
			return 0;
	}

}
