public class KomparatorImienia implements Comparator
{
    public int compare(Object left, Object right){
        return ((Student)left).getImie().compareTo(((Student)right).getImie());
    }
}
