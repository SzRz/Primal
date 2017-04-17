public class KomparatorOdwrotny implements Comparator
{
    private Comparator _comp;
    public KomparatorOdwrotny(Comparator c){
        this._comp = c;
    }
    
    public int compare(Object left, Object right){
        return _comp.compare(right, left);
    }
}
