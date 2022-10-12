package uaslp.objetos.list.ArrayList;
import uaslp.objetos.list.Iterator;

class ArrayListIterator implements Iterator{
    private ArrayList arrayList;
    private int currentItem;
    public ArrayListIterator(ArrayList arrayList)
    {
        this.arrayList=arrayList;
    }

    public boolean hasNext(){
        return currentItem < arrayList.getSize() ;
    }

    public String next(){
        return arrayList.getAt(currentItem++);
        /*
        String data=arrayList.getAt(currentItem);
        currentItem++;
        return data; //Disculpe por el comentario, se que es mala costumbre solo es cuestión de duda personal en el código y lo checaba, comentario para mi por asi decirlo jeje*/
    }
}
