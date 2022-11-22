package de.dhbw.tinf20.pattern.singleton;

public class Main {

	public static void main(String[] args) {
		//MySingleton neu = new MySingleton();
		RandomnessSingleton verwendung = RandomnessSingleton.getInstance();
		System.out.println(
			verwendung.getZufallszahl()
		);
		
		
	}
	
//	public static void vorgang() {
//		RandomnessSingleton verwendung = RandomnessSingleton.getInstance();
//		System.out.println(
//			verwendung.getZufallszahl()
//		);
//	}
}
