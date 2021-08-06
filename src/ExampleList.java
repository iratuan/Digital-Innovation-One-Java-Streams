import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("iratuan");
        nomes.add("erika");
        nomes.add("ian");
        nomes.add("dario");

        for(String nome: nomes){
            System.out.println(nome);
        }

        Collections.sort(nomes);
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
}
