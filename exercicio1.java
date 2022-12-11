import java.util.Scanner; 

 
 

public class exercicio1 { 

    public static void main(String[] args) { 

        int n; 

 
 

        Scanner teclado = new Scanner(System.in); 

        System.out.println("Digite um número: "); 

        n = teclado.nextInt(); 

        teclado.close(); 

         

        imprimeNumeros(n); 

    } 

 
 

    static void imprimeNumeros(int n) { 

        int i, l; 

 
 

        for (i = 1; i <= n; i++) { 

            for (l = 0; l < i; l++) { 

                System.out.print(i + " "); 

            } 

 
 

            System.out.println(" "); 

        } 

 
 

    } 

} 