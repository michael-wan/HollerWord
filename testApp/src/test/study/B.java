package test.study;

class B extends A {
	// 覆写了fun1()方法
	public void fun1() {
		System.out.println("2、B --> public void fun1()");
	}

	// 增加了一个fun3()方法
	public void fun3() {
		System.out.println("3、B --> public void fun3()");
	}
}
