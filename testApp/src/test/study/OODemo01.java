package test.study;

public class OODemo01 {
	public static void main(String args[]){
		//a��A�͵ģ��������Ϊ����ʵ����,����ת�ͣ���������������ת��
		A a = null;
		a =new B();
		a.fun1();
		a.fun2();
		
		B b = (B)a;//(����ת�ͣ�����Ϊ����ʵ����)
		b.fun1();
		b.fun2();
		b.fun3();
		/*
		
		
������
������A a = null;
     a = new B();
        // fun1���������าд��

                B  b = null ;
                b = (B)a ;
        a.fun2() ;
������//�������B��fun1����
        a.fun3() ;//�Ѿ�ת�͵�a������Ѿ����ܷ���fun3�����ˣ���Ҫ��a����A�����������A���
        // b.fun2() ;*/
		
    }
}
