package Set;


import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //não conseguimos fazer busca
//        System.out.println("Exiba a posição da nota 5.0: ");

        //não conseguimos trabalhar com possição no set
//        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

        //não temos como fazer isso. Somente na list
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

        
        //Utilizando o metodo contains
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //não temos o método get
//        System.out.println("Exiba a terceira nota adicionada: ");

        
        //como o no List utilizamos o min e para o maximo o max
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        
        //como no list utilizamos o interator
        //lembrando que no set não repetimos a nota
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

       System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

//       não funciona indice no set
        //System.out.println("Remova a nota da posição 0");

        //mesma forma q fizemos no list
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();//crio a variavel
        while(iterator1.hasNext()){
            Double next = iterator1.next();//variavel para o proximo elemento
            if (next < 7) iterator1.remove();//verifico se é menor que 7 e removo
        }
        System.out.println(notas);

       
        //como trabalhamos com set, não podemos usar o hasSet
        //temos que utilizar o linkedHashSet
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);//não permite elementos iguais, vai mostrar uma unica vez
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

       System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);//o Double tem o comparable
        System.out.println(notas3);

        //System.out.println("Apague todo o conjunto");
        //notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}