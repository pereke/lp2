public class Calculadora{
	int soma, sub, mult, a1, a2;
	float div;
	
	public void soma (){
		System.out.println (" A soma dos dois numeros e: " +this.soma);
	}

	public void sub (){
		System.out.println (" A subtracao dos dois numeros e: " +this.sub);
	}

	public void mult (){
		System.out.println (" A multiplicacao dos dois numeros e: " +this.mult);
	}
	
	public void div (){
		System.out.println (" A divisao dos dois numeros e: " +this.div);
	}
	
	public static void main(String [] args){
		Calculadora n1 = new Calculadora();
		Calculadora n2 = new Calculadora();
		Calculadora n3 = new Calculadora();
		
		n1.a1 = 8;
		n1.a2 = 2;
		n1.soma = n1.a1 + n1.a2;
		n1.sub = n1.a1 - n1.a2;
		n1.mult = n1.a1 * n1.a2;
		n1.div = n1.a1 / n1.a2;
		
		n2.a1 = 16;
		n2.a2 = 4;
		n2.soma = n2.a1 + n2.a2;
		n2.sub = n2.a1 - n2.a2;
		n2.mult = n2.a1 * n2.a2;
		n2.div = n2.a1 / n2.a2;
		
		n3.a1 = 36;
		n3.a2 = 12;
		n3.soma = n3.a1 + n3.a2;
		n3.sub = n3.a1 - n3.a2;
		n3.mult = n3.a1 * n3.a2;
		n3.div = n3.a1 / n3.a2;
		System.out.println ("");
		
		n1.soma();
		n1.sub();
		n1.mult();
		n1.div();
		System.out.println ("");
		
		n2.soma();
		n2.sub();
		n2.mult();
		n2.div();
		System.out.println ("");
		
		n3.soma();
		n3.sub();
		n3.mult();
		n3.div();
	}
}
