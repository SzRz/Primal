package Unused;

/**
 * Powtarzaj n–krotnie operacje:        
 * "weź największy element z ciągu nieuporządkowanego                  
 * i wpisz go na koniec ciągu już uporządkowanego" 
 */
import java.util.List;
public class SelectSort 
{     
    private final Comparator _comparator;     
    public SelectSort(Comparator comparator)  
    { 
        super(comparator); 
    }     

    public List sort(List list) 
    {         
        int size = list.size();         
        for (int slot = 0; slot < size - 1; ++slot) 
        {             
            int smallest = slot;             
            for (int check = slot + 1; check < size; ++check){                 
                if (_comparator.compare(list.get(check), list.get(smallest)) < 0){                     
                    smallest = check;          
                }
            }
                swap(list, smallest, slot);    
        }         
        return list;     
    }     

    private void swap(List list, int left, int right) 
    {         
        if (left != right) 
        { 
            // sprawdzenie, czy to są dwa różne elementy (czy przestawiać)             
            Object temp = list.get(left);             
            list.set(left, list.get(right));             
            list.set(right, temp);         
        }     
    } 
} 