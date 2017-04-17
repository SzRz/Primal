public class KomparatorZlozony implements Comparator
{
    Pojedyncza _cmps;
    public KomparatorZlozony(){
        _cmps = new Pojedyncza();
    }
    
    public void dodaj(Comparator cmp){
        _cmps.add(cmp);
    }
    
    public int compare(Object left, Object right){
        int z = 0;
        IterPoj it = new IterPoj(_cmps);
        for(it.first(); !it.isDone() && (z = ((Comparator)it.current()).compare(left, right)) == 0; it.next());
        return z;
    }
}
