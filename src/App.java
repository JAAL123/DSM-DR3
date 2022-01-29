
import java.util.Scanner;
public class App {

    private Scanner teclado;
    private int Numeros[];

    App(){
        teclado = new  Scanner(System.in);
        int n;
        System.out.print("Digite la cantidad de numeros a ingresar: ");
        n = teclado.nextInt();
        Numeros = new int[n];
        int pr = 1;
        for(int i = 0 ; i < Numeros.length ; i++){
            System.out.print("Ingrese el valor del numero " + pr + ": ");
            Numeros[i] = teclado.nextInt();
            pr = pr +1;
        }
    }

    public void par(){
        int mod;
        int cont1 = 0;
        int cont2 = 0;
        
        for (int i = 0; i < Numeros.length; i++){
            mod = Numeros[i] % 2 ;     
            if(mod == 0){
                cont1 = cont1 + 1; 
            }else{
                cont2 = cont2 + 1;
            }       
        }
        System.out.println("La cantidad de numeros par ingresados es de: " + cont1);
        System.out.println("La cantidad de numeros impar ingresados es de: " + cont2);
    }

    public static void main(String[] args) {
        App con = new App();
        con.par();
    }
}
