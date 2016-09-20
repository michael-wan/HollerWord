package test.study;

public class OODemo03 {
	public static void main(String args[]) {
		// 对象都态性到底该怎么用？
		// 一个print方法，此方法可以接收A和B类的对象，并调用方法打印
		// 如果是A类对象，则调用fun2()方法
		// 如果是B类对象，则调用fun2()和fun3()两个方法
		print(new C());
		// 如果A类还有20个子类，会怎么样？
		// 则此方法还要再写20遍
	}

	public static void print(A a) {
		// 对此程序的理解传的是new C(),传给 A a 即相当于 A a=new C(),这样就是向上转型了，A知道了和子类的关系，
		// 因为用new实例化了再判断是谁的实例，再进行向下转型，这样就可调用各自的方法了。

		a.fun2();
		// 缺少一个对象是否是某一个类的实例的判断
		if (a instanceof B) {
			B b = (B) a;
			b.fun3();
		}
		if (a instanceof C) {
			C c = (C) a;
			c.fun4();
		}
	}
}
