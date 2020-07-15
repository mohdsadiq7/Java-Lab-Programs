class A1{

	void m1(){
		System.out.println("Hello");
	}
		@Deprecated
		void m11(){
			System.out.println("Hello1");
		}
			void m12(){
				System.out.println("Hello2");
			}
	
}

class A2 extends A1{
	@Override 
	void m1(){
		System.out.println("Hai");
	}

	@Deprecated
	void m2(){
		System.out.println("old");
	}

	void m21(){
		System.out.println("new");
	}
}

public class AnnoEx1 {

	public static void main(String[] args) {
		A2 a =new A2();
		a.m1();
		a.m2();
	}
}












