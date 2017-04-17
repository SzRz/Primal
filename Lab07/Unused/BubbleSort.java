package Unused;

/**
 * Powtarzaj, aż do całkowitego uporządkowania ciągu, operację:     
 * "porównaj parę sąsiednich elementów i jeśli ich kolejność jest nieprawidłowa      
 * to zamień te elementy miejscami" 
 */
import java.util.List;
public class BubbleSort 
{     
    private final Comparator _comparator;  
    public BubbleSort(Comparator comparator) 
    { 
        super(comparator); 
    }       
    
    public List sort(List list) {    
        int lastSwap = list.size() -1; 
        // pozycja ostatniej zamiany         
        while(lastSwap>0)
        {             
            int end=lastSwap;             
            lastSwap=0;             
            for (int left = 0; left < end; ++left) 
            {                 
                if (_comparator.compare(list.get(left), list.get(left+1)) > 0)                    
                {                 
                    Object temp=list.get(left);                      
                    while(left<end && _comparator.compare(temp, list.get(left+1)) > 0)                        
                    { 
                        list.set(left, list.get(left+1)); 
                        left++; 
                    }                      
                    lastSwap=left;                     
                    list.set(left,temp);                    
                }               
            }        
        }         
        return list;     
    } 

    private void swap(List list, int left, int right) {         
        Object temp = list.get(left);         
        list.set(left, list.get(right));         
        list.set(right, temp);     
    } 
} 