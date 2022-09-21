import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<MediaMes> listaDeMedias = new ArrayList<>();
        Integer mediaPorMes;

        // Pegando Media de Temperatura por mes
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a temperatura media do mes " + (i) + " : ");
            mediaPorMes = leia.nextInt();
            if(i == 1) listaDeMedias.add(new MediaMes(i, "Janeiro", mediaPorMes));
            if(i == 2) listaDeMedias.add(new MediaMes(i, "Fevereiro", mediaPorMes));
            if(i == 3) listaDeMedias.add(new MediaMes(i, "Marco", mediaPorMes));
            if(i == 4) listaDeMedias.add(new MediaMes(i, "Abril", mediaPorMes));
            if(i == 5) listaDeMedias.add(new MediaMes(i, "Maio ", mediaPorMes));
            if(i == 6) listaDeMedias.add(new MediaMes(i, "Junho", mediaPorMes));
        }
        /*System.out.println(listaDeMedias.toString());*/
        
    }
}