import java.io.*;
public class Pojedyncza implements Lista, Serializable
{
    protected int size;
    protected Node first,last;
    
    public Pojedyncza(){
        clear();
    }

    public Node getFirst(){return first;}

    public Node getLast(){return last;}

    public void clear(){
        last = first = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void add(Object o){
        Node nowa = new Node(o);
        if(size == 0){
            first = last = nowa;
        }else if(size == 1){
            last = nowa;
            first.setNext(nowa);
        }else{
            last.setNext(nowa);
            last = last.getNext();
        }
        size++;
    }

    public void add(Object o, int index) throws IndexOutOfBoundsException{
        if(index < 0 || index > size) throw new IndexOutOfBoundsException("Indeks poza zakresem!");
        Node nowa = new Node(o);
        if(size == 0){
            first = last = nowa;
        }else if(size == 1){
            if(index == 1){
                nowa.setNext(first);
                first = nowa;
            }else{
                last = nowa;
                first.setNext(nowa);
            }
        }else{
            if(index == 0){
                nowa.setNext(first);
                first = nowa;
            }else{
                Node tmp = first;
                int nr = 1;
                while(tmp.getNext() != null){
                    if(nr == index)break;
                    tmp = tmp.getNext();
                    nr++;
                }
                nowa.setNext(tmp.getNext());
                tmp.setNext(nowa);
            }
        }
        size++;
    }

    public Object delete(int index) throws IndexOutOfBoundsException{
        if(index < 1 || index > size) throw new IndexOutOfBoundsException("Indeks poza zakresem!");
        int nr = 2;
        Node tmp = first;
        if(index == 1){
            Object removed = first.getValue();
            if(size > 1){
                first = first.getNext();
            }else{
                clear();
            }
        }
        else{
            while(tmp.getNext() != null){
                if(nr == index)break;
                tmp = tmp.getNext();
                nr++;
            }
        }
        size--;
        Object removed = tmp.getNext().getValue();
        if(index == size){
            tmp.setNext(null);
            last = tmp;
        }
        else
            tmp.setNext(tmp.getNext().getNext());
        return removed;
    }

    public Object delete(Object o){
        Node tmp = first;
        Object removed = null;
        if(tmp.getValue() == o){
            removed = first.getValue();
            if(size > 1){
                first = first.getNext();
            }else{
                clear();
            }
            size--;
        }else{
            while(tmp.getNext() != null){
                if(tmp.getNext().getValue() == o){
                    removed = tmp.getNext().getValue();
                    if(tmp.getNext().getNext() == null){
                        tmp.setNext(null);
                        last = tmp;
                    }else{
                        tmp.setNext(tmp.getNext().getNext());
                    }
                    size--;
                    break;
                }
                tmp = tmp.getNext();
            }
        }
        return removed;
    }

    public void set(Object o, int index) throws IndexOutOfBoundsException{
        if(index < 1 || index > size) throw new IndexOutOfBoundsException("Indeks poza zakresem!");
        Node tmp = first;
        int nr = 1;
        if(index == 1){
            first.setValue(o);
        }else if(index == size){
            last.setValue(o);
        }else{
            while(tmp.getNext() != null){
                ++nr;
                tmp = tmp.getNext();
                if(nr == index){
                    tmp.setValue(o);
                }
            }
        }
    }

    public Object get(int index) throws IndexOutOfBoundsException{
        if(index < 1 || index > size) throw new IndexOutOfBoundsException("Indeks poza zakresem!");
        if(index == 1) return first.getValue();
        if(index == size) return last.getValue();
        Node tmp = first;
        int nr = 2;
        while(tmp.getNext() != null){
            tmp = tmp.getNext();
            if(nr == index)return tmp.getValue();
            nr++;
        }
        return null;
    }

    public String toString(){
        String buffer = "";
        Node tmp = first;
        if(size == 0) return null;
        if(size == 1)return tmp.toString();
        buffer += tmp.toString() + " -> ";
        while(tmp.getNext() != null){
            buffer += tmp.getNext().toString() + " -> ";
            tmp = tmp.getNext();
        }
        return buffer + "null";
    }
    
    public boolean zawiera (Object wartosc){
        Node tmp = first;
        if(tmp.getValue() == wartosc){
            return true;
        }else{
            while(tmp.getNext() != null){
                if(tmp.getNext().getValue() == wartosc){
                    return true;
                }
                tmp = tmp.getNext();
            }
        }
        return false;
    }

    public class Node implements Lista.Node, Serializable{
        public Object value;
        public Node next;
        
        public Node(Object o){
            value = o;
            next = null;
        }

        public Node(Object o, Node n){
            value = o;
            next = n;
        }
        
        public String toString(){
            return value.toString();
        }

        public Object getValue(){return value;}

        public Node getNext(){return next;}

        public void setValue(Object o){value = o;}

        public void setNext(Node n){next = n;}
    }
}
