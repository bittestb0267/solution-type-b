package problem02;

public class Main {

	public static void main(String[] args) {
		String[] expressions = { "3 + 4", "12 * 4", "8 / 2", "10 - 2" };

		for (String expression : expressions) {
			String[] tokens = expression.split(" ");

			String arith = tokens[1];
			int num1 = Integer.parseInt(tokens[0]);
			int num2 = Integer.parseInt(tokens[2]);

			// num1, num2, arith 세 개의 변수와 getInstance 메소드를 사용하여
			// 문제의 결과화면에 맞게 출력하는 계산기 나머지 코드를 아래에 완성 하십시오.
			// 주어진 코드는 수정하지 않습니다.
			
			//getInstance(arith);

		}
	}

	@SuppressWarnings("null")
	public static Arithmetic getInstance(String arith)  {

		// 메소드 구현을 완성 하십시오.
		
		
		Arithmetic a = null;
		
		int num1=0;
		int num2=0;
		switch (arith) {
		case "+":
			System.out.println(a.calculate(num1, num2));
			break;
		case "-":
			System.out.println(a.calculate(num1, num2));
			break;
		case "*":
			System.out.println(a.calculate(num1, num2));
			break;
		case "/":
			System.out.println(a.calculate(num1, num2));
			break;
		default:
			System.out.println(" 알 수 없는 연산자입니다.");
			break;
			/* 코드를 완성 합니다 */
	}
	
	  return null; }
	
	public abstract class Add implements Arithmetic{
		private int a;
		private int b;

		public Add(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public int calculate(){
			return (this.a + this.b);
		}
	}
	
	public abstract class Sub implements Arithmetic{
		private int a;
		private int b;

		public Sub(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public int calculate(){
			return (this.a - this.b);
		}
	}
	
	public abstract class Mul implements Arithmetic{
		private int a;
		private int b;

		public Mul(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		public int calculate(){
			return (this.a * this.b);
		}
	}
	
	public abstract class Div implements Arithmetic{
		private int a;
		private int b;

		public Div(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		protected int calculate() {
			// TODO Auto-generated method stub
			if( b == 0 ) {
				System.out.println("Cannot calculate for divide");
				return 0;
			}
			
			return (this.a / this.b);
		}
	}
	
	
	 
}