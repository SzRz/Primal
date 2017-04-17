import java.util.ArrayList;
public class SelectSort extends AlgorytmSortowania
{
    public SelectSort(Comparator komparator){
        super(komparator);
    }
    
    public ArrayList sort(ArrayList lista) {
        int rozmiar = lista.size();
        for(int miejsce = 0; miejsce < rozmiar - 1; miejsce++){
            int min = miejsce;
            for(int spr = miejsce +1; spr < rozmiar; spr++){
                if(this.porownaj(lista, spr, min) < 0)
                    min = spr;
            }
            zamien(lista, min, miejsce);
        }
        return lista;
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
        lista.add(gdzie, co);
    }
    protected void wstaw(ArrayList lista, int ktory, int gdzie)
    {
        wstaw(lista, lista.get(ktory), gdzie);
    }
}
