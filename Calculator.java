public class Calculator{
	private int n1;
	private char operationSymbol;
	private int n2; 
	private int n3;

	public Calculator(int n1, char operationSymbol, int n2){
		n1 = n1;
		operationSymbol = operationSymbol;
		n2 = n2;
		
		if(operationSymbol == '+'){
			n3 = n1 + n2;
			System.out.println(n3);
		}else if(operationSymbol == '-'){
			n3 = n1 - n2;
			System.out.println(n3);
		}else if(operationSymbol == '*'){
			n3 = n1 * n2;
			System.out.println(n3);
		}else if(operationSymbol == '/'){
			n3 = n1/n2;
			System.out.println(n3);
		}else{
			System.out.println("you cannot use that operation symbol, operation symbol must be one of the following: '+','-','*','/'");
		}


	}

}

