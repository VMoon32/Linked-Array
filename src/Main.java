import uaslp.objetos.list.ArrayList.ArrayList;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.LinkedList.LinkedList;
import uaslp.objetos.list.List;

public class Main {

    public static void main(String[] args)
    {


        List listaLin = new LinkedList();

        Iterator iterator;

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
    }
}