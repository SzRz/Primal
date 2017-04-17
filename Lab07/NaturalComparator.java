
public class NaturalComparator implements Comparator
{
    public int compare(Object left, Object right) throws ClassCastException{
        return ((Student)left).compareTo((Student)right);
    }
}
