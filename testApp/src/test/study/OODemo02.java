package test.study;

public class OODemo02 {
	public static void main(String args[]) {
		A a = new A();
		a.fun1();
		B b = (B)a;
		// A a = new A() ;
		// a.fun2();
		// B b = (B)a ;
		// �˻������ת���쳣ClassCastException,����Ĳ��ᷢ����
		// ��Ϊ A a = null ;
		// a = new B() ;������Ϊ����ʵ����������extends���൱Ȼ֪��������˭�ˣ�����A֪����B��������ˣ����� ��������ת��
		// ����A a = new A() ;
		// a.fun2() ;
		// B b = (B)a ;֮�и��ಢ��֪��������Ĺ�ϵ
	}
};