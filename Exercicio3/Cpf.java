import java.util.Scanner;
public class Cpf {
    public String lerCpf(){
        Scanner input = new Scanner( System.in );
        String cpf = input.next();
        return cpf;
    }
    public int[] getCaracter(String q){
        int[] v = new int[11];
        for (int i = 0; i < 9; i++) {
            char caracter = q.charAt(i);
            v[i] = Character.getNumericValue(caracter);
        }
        return v;
    }
    public int getv9(int[] v){
        int j = 10, x =0, i;
        for (i = 9; i > 0; i--) {
            x =+ v[i] * (j--);
        }    
            if( x % 11 < 2){
                v[9] = 0;
            }else{
                v[9] = (11-(x % 11));
            }
        return v[9];
    }
    public int getv10(int[] v){
        int i, x, j = 11, y = 0;
        for (i = 10; i > 0; i--) {
            x =+ v[i] * (j--);
        }
        if( y % 11 < 2){
            v[10] = 0;
        }else{
            v[10] = (11-(y%11));
        }
        return v[10];
    }
    
    
 
    public static void main (String[] args){
        int[] v = new int[11];
        Cpf n = new Cpf();
        String q;
        q = n.lerCpf();
        v = n.getCaracter(q);
        v[9] = n.getv9(v);
        v[10] = n.getv10(v);
        System.out.print("Seu CPF é: ");
        int i = 0;
        for (i = 0; i<11 ;i++){
            System.out.print(v[i]);
        }
    }
    
}
