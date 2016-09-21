
public class MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //MethodCalling m= new MethodCalling();
   //m.go();
   go3();
	}
	public static void go3(){
		System.out.println("Inside Go3 method");
	}
 public static void go(){
	 System.out.println("Inside Go method");
	 go1();
 }
 public static void go1(){
	 System.out.println("Inside Go1 method");
	 go2();
 }
 public static void go2(){
	 System.out.println("Inside Go2 method");
 }
}
