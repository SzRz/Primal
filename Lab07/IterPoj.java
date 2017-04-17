
public class IterPoj implements Iterator
{
    private Pojedyncza l;
    private Pojedyncza.Node act;
    public IterPoj(Pojedyncza list){
        l = list;
        act = null;
    }
    public void first(){
        act = l.getFirst();
    }
    public void last(){
        act = l.getLast();
    }
    public void next(){
        act = act.getNext();
    }
    public void previous(){
        Pojedyncza temp = l;
        Pojedyncza.Node f = temp.getFirst();
        if(f.getValue() == current())
            act = null;
        else{
            while(!(f.getNext().getValue().equals(current()))){
                f = f.getNext();
            }
            act = f;
        }
    }
    public boolean isDone(){
        return act == null;
    }
    public Object current(){
        return act.getValue();
    }
}
