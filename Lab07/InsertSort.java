import java.util.ArrayList; import java.util.Iterator;
public class InsertSort extends AlgorytmSortowania
{
    public InsertSort(Comparator komparator)
    {
        super(komparator);
    }

    public ArrayList sort(ArrayList lista){
        Iterator it = lista.iterator();
        Object itNext;       
        final ArrayList result = new ArrayList(); 
        while(it.hasNext()) 
        {             
            int slot = result.size();   
            itNext = it.next();
            while(slot > 0){
               if(porownaj(itNext, result.get(slot-1)) >= 0){
                   break;
               } 
               slot--;
            }
            wstaw(result, itNext, slot);
        }
        return result;
    }

    protected int porownaj(ArrayList lista, int lewy, int prawy)
    {     
        return porownaj(lista.get(lewy), lista.get(prawy));
    }

    protected int porownaj(Object lewy, Object prawy)
    {     
        stat.porownanie();
        return cmp.compare(lewy, prawy);
    }    

    protected void zamien(ArrayList lista, int lewy, int prawy) {
        stat.zamiana();
        Object tmp = lista.get(lewy);
        lista.set(lewy, lista.get(prawy));
        lista.set(prawy, tmp);
    }

    protected void wstaw(ArrayList lista, Object co, int gdzie)
    {
        lista.set(gdzie, co);
    }

    protected void wstaw(ArrayList lista, int ktory, int gdzie)
    {
        wstaw(lista, lista.get(ktory), gdzie);
    }
}
