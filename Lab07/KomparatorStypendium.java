public class KomparatorStypendium implements Comparator
{
    public int compare(Object left, Object right){
        return (int)(100f*(((Student)left).getStypendium() - ((Student)right).getStypendium()));
    }
}
