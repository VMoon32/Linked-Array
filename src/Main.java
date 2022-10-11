import uaslp.objetos.list.ArrayList.ArrayList;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.LinkedList.LinkedList;
import uaslp.objetos.list.List;

public class Main {

    public static void main(String[] args)
    {
        List listaLin = new LinkedList();
        List listaArr = new ArrayList();

        Iterator iterator;

        System.out.println("LinkedList");
        listaLin.addAtTail("uno");
        listaLin.addAtTail("dos");
        listaLin.addAtTail("tres");

        listaLin.addAtFront("3");
        listaLin.addAtFront("2");
        listaLin.addAtFront("1");

        iterator = listaLin.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        listaLin.remove(0);
        System.out.println("Primera lista contiene: " +listaLin.getSize() + " elementos");

        iterator = listaLin.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("ArrayList");
        listaArr.addAtTail("3");
        listaArr.addAtTail("2");
        listaArr.addAtTail("1");

        listaArr.addAtFront("Erik");
        listaArr.addAtFront("Vital");
        listaArr.addAtFront("Muñoz");

        iterator = listaArr.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        listaArr.remove(0);
        System.out.println("Segunda lista contiene: " +listaArr.getSize() + " elementos");

        iterator = listaArr.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}