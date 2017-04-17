import java.util.ArrayList;
public class BubbleSort extends AlgorytmSortowania
{
    public BubbleSort(Comparator komparator)
    {
        super(komparator);
    }
    
    public ArrayList sort(ArrayList lista) {
        int ostZamiana = lista.size() - 1;
        while(ostZamiana > 0){
            int koniec = ostZamiana;
            ostZamiana = 0;
            for(int lewo = 0; lewo < koniec; lewo++){
                if(this.porownaj(lista, lewo, lewo+1) > 0){
                    Object tmp = lista.get(lewo);
                    while(lewo < koniec && cmp.compare(tmp, lista.get(lewo+1)) > 0){
                        this.zamien(lista, lewo, lewo+1);
                        lewo++;
                    }
                    ostZamiana = lewo;
                    lewo++;
                }
            }
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
