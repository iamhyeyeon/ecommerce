package cls;

import inter.PrintNameInterface;

public class PrintPhoneCard implements PrintNameInterface{

	@Override
	public void print(NameCard nc) {
		System.out.println("이름: "+nc.name);
		System.out.println("폰번호: "+nc.phone);
		
	}

}
