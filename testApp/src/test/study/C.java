package test.study;

class C extends A {
	// 覆写了fun1()方法
	public void fun1() {
		System.out.println("4、C --> public void fun1()");
	}

	// 增加了一个fun4()方法
	public void fun4() {
		System.out.println("5、C --> public void fun4()");
	}
}
