package uaslp.objetos.list;

public interface List {

    void addAtTail(String data);
    void addAtFront(String data);
    void removeAll();
    void remove(int index);
    void removeAllWithValue(String data);
    void setAt(int index,String data);
    String getAt(int index);
    int getSize();
    Iterator getIterator();

}
