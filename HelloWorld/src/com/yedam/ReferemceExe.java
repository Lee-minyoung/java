package com.yedam;

import com.yedam.reference.ReferenceExe1;

public class ReferemceExe {
	public static void main(String[] args) {
		
		ReferenceExe1.main(args); //static 메소드는 "클래스, 메소드이름"
		
		ReferenceExe1 ref1;
		
		ref1 = new ReferenceExe1();
		
		ref1.method1(); //public:외부에 가져다 쓸 수 있음
		//ref1.method2(); //private:외부에 가져다 쓸 수 없음
	}

}
