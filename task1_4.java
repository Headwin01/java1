class TestClass {
	static int field = 1;
}

public class T1_4 {
	public static void main(String[] args) {
		TestClass a1 = new TestClass();
		TestClass a2 = new TestClass();
		System.out.println(a1.field);
		a2.field = 2;
		System.out.println(a1.field);
		System.out.println(TestClass.field == a1.field && a1.field == a2.field);
	}
}