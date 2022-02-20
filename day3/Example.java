package com.org.gen.day3;
interface exa {
	int methodexa(int i);
}

class example implements exa {

	@Override
	public int methodexa(int i) {
		// TODO Auto-generated method stub
		return i =+ i*i;
	}
	
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e = new example();
		System.out.println(e.methodexa(5));
	}

}
