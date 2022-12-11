import java.util.Scanner; 

 
 

public class exercicio5 { 

  

    public static void main(String[] args) { 

        double preço_do_produto; 

        double imposto_sobre_o_produto; 

        double preço_total_com_imposto; 

 
 

        Scanner entrada = new Scanner(System.in); 

        System.out.println("Qual é o valor do produto? "); 

        preço_do_produto = entrada.nextDouble(); 

        System.out.println(" Qual a porcentagem do imposto sobre o produto? "); 

        imposto_sobre_o_produto = entrada.nextDouble(); 

        entrada.close(); 

        preço_total_com_imposto = somaImposto(imposto_sobre_o_produto, preço_do_produto); 

        System.out.println(" O preço do produto com o imposto é R$: " + preço_total_com_imposto); 

 
 

    } 

 
 

    public static double somaImposto(double taxaImposto, double custo) { 

        double porcentagem = taxaImposto / 100; 

        return custo + (custo * porcentagem); 

    } 

} 