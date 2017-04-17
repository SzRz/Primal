package Unused;

/**
 * Powtarzaj n–krotnie operacje:                 
 * "weź kolejny element z ciągu nieuporządkowanego                  
 * i wstaw go na właściwe miejsce w ciągu uporządkowanym" 
 */
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class InsertSort 
{     
    private final Comparator _comparator;   
    public InsertSort(Comparator comparator)  
    { 
        super(comparator); 
    } 

    public List sort(List list) 
    {         
        final List result = new LinkedList();         
        Iterator it = list.iterator();  
        Object itNext;       
        while(it.hasNext()) 
        {             
            int slot = result.size();   
            itNext = it.next();
            while (slot>0) 
            {               
                if (_comparator.compare(itNext, result.get(slot-1)) >= 0) { 
                    break; 
                }              
                --slot;              
            }             
            result.add(slot, itNext);         
        }
        return result;     
    } 
} 