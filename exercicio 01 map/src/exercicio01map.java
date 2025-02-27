/*Exercícios Propostos

Dada a população estimada de alguns estados do NE brasileiro, faça:

Estado = PE - População = 9.616.621

Estado = AL - População = 3.351.543

Estado = CE - População = 9.187.103

Estado = RN - População = 3.534.265

Crie um dicionário e relacione os estados e suas populações;

Substitua a população do estado do RN por 3.534.165;

Confira se o estado PB está no dicionário, caso não adicione: PB -
4.039.277;

Exiba a população PE; */

import java.util.HashMap;
import java.util.Map;

public class exercicio01map {
    public static void main(String[] args){
        Map<String, Integer> estadosBrasileiro = new HashMap<>();

        estadosBrasileiro.put("PE", 9616621);
        estadosBrasileiro.put("AL", 3351543);
        estadosBrasileiro.put("CE", 9187103);
        estadosBrasileiro.put("RN", 3534265);

    //Crie um dicionário e relacione os estados e suas populações
    System.out.println(estadosBrasileiro.toString());

    //Substitua a população do estado do RN por 3.534.165
    System.out.println("Substitua a população do estado do RN por 3.534.165");
    estadosBrasileiro.put("RN", 3534165);
    System.out.println(estadosBrasileiro);

    //Confira se o estado PB está no dicionário, caso não adicione: PB -4.039.277
    System.out.println("Estado PB, está no dicionário: " +estadosBrasileiro.containsKey("PB"));

    estadosBrasileiro.put("PB", 4039277);
    System.out.println(estadosBrasileiro);

    System.out.println("Estado PB, está no dicionário: " +estadosBrasileiro.containsKey("PB"));

    //Exiba a população PE
    System.out.println("Exibir a população do estado PE: "+ estadosBrasileiro.get("PE"));

    }
}

