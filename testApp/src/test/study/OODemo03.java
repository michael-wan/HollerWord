package test.study;

public class OODemo03 {
	public static void main(String args[]) {
		// ����̬�Ե��׸���ô�ã�
		// һ��print�������˷������Խ���A��B��Ķ��󣬲����÷�����ӡ
		// �����A����������fun2()����
		// �����B����������fun2()��fun3()��������
		print(new C());
		// ���A�໹��20�����࣬����ô����
		// ��˷�����Ҫ��д20��
	}

	public static void print(A a) {
		// �Դ˳������⴫����new C(),���� A a ���൱�� A a=new C(),������������ת���ˣ�A֪���˺�����Ĺ�ϵ��
		// ��Ϊ��newʵ���������ж���˭��ʵ�����ٽ�������ת�ͣ������Ϳɵ��ø��Եķ����ˡ�

		a.fun2();
		// ȱ��һ�������Ƿ���ĳһ�����ʵ�����ж�
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
