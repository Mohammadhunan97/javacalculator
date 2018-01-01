import java.util.*;

public class Main{
	public static void main(String args[]){
		int n1 = Integer.parseInt(args[0]);
		char operationSymbol = args[1].charAt(0);
		int n2 = Integer.parseInt(args[2]);

		Calculator myCalc = new Calculator(n1,operationSymbol,n2);

	}
}