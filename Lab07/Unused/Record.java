import java.util.Random;
public class Record
{
    int index, value;
    String name;
    char sign;
    
    public Record(){
        Random r = new Random();
        index = r.nextInt(10000);
        value = r.nextInt(1000)+100;
        name = "No Name";
        sign = 'x';
    }
    
    public Record(int a, int b, String c, char d){
        index = a;
        value = b;
        name = c;
        sign = d;
    }
    
    public Record(int a, int b, char c){
        index = a;
        value = b;
        sign = c;
        name = "No Name";
    }
    
    public String toString(){
        return index + "\t" + name + "\t" + value + "\t" + sign;
    }
}
