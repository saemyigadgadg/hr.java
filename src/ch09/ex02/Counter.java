package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start.");
		//run = 쓰레드가 할 일이지, 쓰레드가 아니다.
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": c");
		}
		//현재 작동중인 쓰레드를 리턴시킨다.
	}
}