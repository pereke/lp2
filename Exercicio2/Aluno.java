public class Aluno{
	String name, mat;
	int age;
	
	public void imprimirDadosCadastrais (){
		System.out.println (" Nome: " +this.name);
		System.out.println (" Numero de Matricula: " +this.mat);
		System.out.println (" Idade: " +this.age);
		System.out.println ("");
	}
	
	public static void main (String [] args){
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		System.out.println (""); 
		
		a1.name = "lekaço";
		a1.num = "666-666-666";
		a1.age = 17;
		
		a2.name = "Lekeira";
		a2.num = "24-24-24";
		a2.age = 17;
		
		a3.name = "Lekudo";
		a3.num = "69-69-69";
		a3.age = 17;
		
		a4.name = "Lek";
		a4.num = "11-11-11";
		a4.age = 17;
		
		a1.imprimirDadosCadastrais(); 		
		
		a2.imprimirDadosCadastrais(); 
		
		a3.imprimirDadosCadastrais(); 
		
		a4.imprimirDadosCadastrais(); 
	}
}
