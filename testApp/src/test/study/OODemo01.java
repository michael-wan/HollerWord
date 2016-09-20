package test.study;

public class OODemo01 {
	public static void main(String args[]){
		//a是A型的，子类对象为父类实例化,向上转型，子类对象向父类对象转型
		A a = null;
		a =new B();
		a.fun2();// fun1方法被子类覆写了,输出的是B的fun1方法
		//a.fun3() ;已经转型的a类对象已经不能访问fun3方法了，主要是a是又A定义的是属于A类的
		B b = (B)a;//(向下转型，父类为子类实例化)
		b.fun2();
		/*
		
		
　　　
　　　A a = null;
     a = new B();
        // fun1方法被子类覆写了

                B  b = null ;
                b = (B)a ;
        a.fun2() ;
　　　//输出的是B的fun1方法
        a.fun3() ;//已经转型的a类对象已经不能访问fun3方法了，主要是a是又A定义的是属于A类的
        // b.fun2() ;*/
		
    }
}
