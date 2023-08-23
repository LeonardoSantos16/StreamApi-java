import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio4 {

// Desafio 4 - Remova todos os valores ímpares:
//Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosImpares = new ArrayList<>();
        //Utilizando apenas o ForEach
         numeros.forEach(n -> {if(n % 2 == 1){
            numerosImpares.add(n);
         }
         });
         numerosImpares.forEach(System.out::println);

         //Utilizando o filter e forEach para imprimir o resultado;
         var filtro =numeros.stream().filter(n -> {
             return n % 2 == 1;
         });
        filtro.forEach(System.out::println);
    }
}
