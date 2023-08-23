import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Desafio19 {
//    Desafio 19 - Verifique se todos os números da lista são iguais:
//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //usando a função distinct
        boolean listaDistinct = numeros.stream().distinct().count() <= 1;
        System.out.println(listaDistinct);


        //Usando Predicate e a função allMatch
        Predicate<Integer> predicate = n -> Objects.equals(numeros.get(0), n);
        var resultado = numeros.stream().allMatch(predicate);
        System.out.println(resultado);
    }
}
