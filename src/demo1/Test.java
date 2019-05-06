package demo1;


public class Test {

	
	public static void main(String[] args) {
		
	
	
	Number odd=new Number(1,100);
	Number even=new Number(2,100);
	
	//odd.run();
	//even.run();
	odd.start();//start() behave like normal method
	even.start();
	//odd.start();
	//odd.setPriority(3);
	//even.setPriority(8);
	
	
}
}

