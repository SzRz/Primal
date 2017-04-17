public class Stat
{
    private long porownania;
    private long zamiany;
    public Stat()
    {
        porownania = zamiany = 0;
    }
    public void porownanie()
    {
        porownania++;
    }
    public void zamiana()
    {
        zamiany++;
    }
    public long iloscPorownan()
    {
        return porownania;
    }
    public long iloscZamian()
    {
        return zamiany;
    }
    public String toString()
    {
        return iloscPorownan() + ";" + iloscZamian();
    }
}
