import java.io.*;
public interface Lista
{
    public Node getFirst();
    public Node getLast();
    public void clear();
    public boolean isEmpty();
    public int size();
    public void add(Object o);
    public void add(Object o, int index) throws IndexOutOfBoundsException;
    public Object delete(int index) throws IndexOutOfBoundsException;
    public Object delete(Object o);
    public void set(Object o, int index) throws IndexOutOfBoundsException;
    public Object get(int index) throws IndexOutOfBoundsException;
    public String toString();
    public boolean zawiera (Object wartosc);
    public interface Node
    {
        public Object getValue();
        public Node getNext();
        public void setValue(Object o);
        public void setNext(Pojedyncza.Node n);
        public boolean equals(Object n);
    }
}
