//Qinyao Zhang 11.17.19
package Main;

class OuterClass {
	int x = 10;

	  class InnerClass { //cant be private
	    int y = 5;
	  }
}

class OutClass {
	int x = 10;

	static class InClass {
	    int y = 5;
	}
}

class AccessClass {
	int x = 10;

	class InnerClass {
	    public int myInnerMethod() {
	      return x;
	  }
	}
}

public class Inner {

	public static void main(String[] args) {
		
		//access inner class form outer class
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	
		//access inner static class
		OutClass.InClass myIn = new OutClass.InClass();
	    System.out.println(myIn.y);
	    
	    //access outer class form inner class
	    AccessClass myOuter1 = new AccessClass();
	    AccessClass.InnerClass myInner1 = myOuter1.new InnerClass();
	    System.out.println(myInner1.myInnerMethod());
	}

}
