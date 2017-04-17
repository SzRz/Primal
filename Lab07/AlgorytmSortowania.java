import java.util.ArrayList;
public abstract class AlgorytmSortowania
{
    protected final Comparator cmp;
    protected Stat stat;
    
    public AlgorytmSortowania(Comparator komparator)
    {
        this.cmp = komparator;
        stat = new Stat();    
    }

    public ArrayList sort(ArrayList lista){
        return lista;
    }
    
    protected int porownaj(ArrayList lista, int lewy, int prawy)
    {     
        return porownaj(lista.get(lewy), lista.get(prawy));
    }

    protected int porownaj(Object lewy, Object prawy)
    {     
        stat.porownanie();
        return 0;
    }    

    protected void zamien(ArrayList lista, int lewy, int prawy) {
        //...             
    }
    protected void wstaw(ArrayList lista, Object co, int gdzie)
    {
        //...
    }
    protected void wstaw(ArrayList lista, int ktory, int gdzie)
    {
        wstaw(lista, lista.get(ktory), gdzie);
    }
}
