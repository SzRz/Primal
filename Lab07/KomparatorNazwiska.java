public class KomparatorNazwiska implements Comparator
{
    public int compare(Object left, Object right){
        return ((Student)left).getNazwisko().compareTo(((Student)right).getNazwisko());
    }
}
