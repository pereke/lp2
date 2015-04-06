import java.util.Scanner;

public class NumeroMuitoGrande {
    
    public String lerN (){
        Scanner input = new Scanner( System.in );
        System.out.println(" Digite um num muito GIGA: ");
        String n = input.next();       
        return n;
    }
        
    public int[] transformaVetor (String n){
        int[] v = new int[31];
        int t = n.length();
        int i, j;       
        for ( i = t, j = 0; i > 0; i--, j++ ){
            char caracter = n.charAt(j);
            v[30 - i] = Character.getNumericValue(caracter);
        }
        return v;
    }
    
    public void somaBig (int []x, int []y, int []soma){
        int c = 0, aux = 0;
        for (int i = 29; i >= 0; i--) {
            if (i == 0) {
                if ((soma[i] + x[i] + y[i]) > 10) {
                    System.out.println(" Menor que 30 algarismos, por favor! ");
                    aux = 1;
                    break;
                }
            }
            soma[i] = soma[i] + x[i] + y[i];
            if (soma[i] >= 10) {
                soma[i] = soma[i] - 10;
                c = 1;
            }
            if (c == 1) {
                c = 0;
                soma[i - 1] = 1;
            }
        }
        c = 0;
        System.out.print (" O resultado da soma é: ");
        for (int i = 0; i <= 29; i++) {
            if (soma[i] == 0 && c == 0) {
                if (soma[i + 1] != 0) {
                    c = 1;
                }
            }else {
                System.out.print(soma[i]);
            }
        }
        System.out.println(" ");
    } 
  
    // Método INACABADO de Multiplicação 
    // public void multBig (int []x, int []y, int []mult){
    //    int i, j;
    //    for (j = 30; j > 0; j--){
    //        int sobe = 0;
    //        for (i = j; i > 0; i--){
    //            mult[i] = ((x[i] * y[j]) + sobe) % 10;
    //            sobe = ((x[i] * y[j])) / 10;
    //            if ((x[i] & y[j]) == 0 ){
    //                mult[i] += sobe;  
    //            }
    //        }
    //    }
    //    System.out.print (" O resultado da multiplicacao é: ");
    //    for (i = 0; i <= 30; i++){
    //        if(mult[i] >= 0){
    //            System.out.print(mult[i]);
    //        }
    //    }
    //   System.out.println(" ");        
    // }
    
    public static void main (String [] args){
        NumeroMuitoGrande n = new NumeroMuitoGrande ();
               
        String n1 = n.lerN ();
        String n2 = n.lerN ();
              
        int[] v1 = new int[30];
        int[] v2 = new int[30];
        int[] vf = new int[30];
        
        v1 = n.transformaVetor(n1);
        v2 = n.transformaVetor(n2);
        
        n.somaBig (v1, v2, vf);
        // n.multBig (v1, v2, vf); Chamada método da Multiplicação
    }
  }
