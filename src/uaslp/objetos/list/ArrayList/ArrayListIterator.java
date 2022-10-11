package uaslp.objetos.list.ArrayList;
import uaslp.objetos.list.Iterator;

public class ArrayListIterator implements Iterator{
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
        String data=arrayList.getAt(currentItem);
        currentItem++;
        return data;
    }
}
