import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainIterador {

    public static void main(String[] args) {

        Set<String> nombres = new HashSet<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Alberto");
        nombres.add("Carlos");
        nombres.add("Andrés");

        System.out.println("Antes de eliminar:");
        System.out.println(nombres);

        Iterator<String> it = nombres.iterator();

        while (it.hasNext()) {
            String nombre = it.next();

            if (nombre.startsWith("A")) {
                it.remove();
            }
        }

        System.out.println("Después de eliminar los que empiezan por A:");
        System.out.println(nombres);
    }
}
