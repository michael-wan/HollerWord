package test.study;

public class OODemo02 {
	public static void main(String args[]) {
		A a = new A();
		a.fun1();
		B b = (B)a;
		// A a = new A() ;
		// a.fun2();
		// B b = (B)a ;
		// 此会产生类转换异常ClassCastException,上面的不会发生是
		// 因为 A a = null ;
		// a = new B() ;子类先为父类实例化，子类extends父类当然知道父类是谁了，这样A知道有B这个子类了，才能 进行向下转型
		// 但在A a = new A() ;
		// a.fun2() ;
		// B b = (B)a ;之中父类并不知道和子类的关系
	}
};