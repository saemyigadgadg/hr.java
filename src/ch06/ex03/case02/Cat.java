package ch06.ex03.case02;

import ch05.ex06.case02.Console;

public class Cat extends Animal {
	@Override //annotation(주석)
	public void shout() {
		Console.info("야옹야옹");
	}
}
//Oerride (재정의) 한다고 했으면서 shout2가 되면 컴파일 에러가 발생한다.