import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Zad1
{
    static List uporz;
    static List nieuporz;
    static List czesciowo;
    static Comparator equ = new CompInt();
    public static void main(){
        SelectSort ss = new SelectSort(equ);
        InsertSort is = new InsertSort(equ);
        
        int iloscTestow = 3;
        
        //Object[][] wykresSS = new Object[iloscTestow][100];
        //Object[][] wykresIS = new Object[iloscTestow][100];
        //wykresDlaBS(iloscTestow, 200, 5);
        wykresDlaSS(iloscTestow, 300, 5);
        wykresDlaIS(iloscTestow, 300, 5);
        /*
        uporz(10);
        ss.sort(uporz);
        System.out.println(uporz+"\n");
        /*
        uporz();
        uporz = is.sort(uporz);
        System.out.println(uporz+"\n\n\n");
        
        
        
        
        nieuporz();
        System.out.println(nieuporz+"\n");
        bs.sort(nieuporz);
        System.out.println(nieuporz+"\n");
        
        nieuporz();
        ss.sort(nieuporz);
        System.out.println(nieuporz+"\n");
        
        nieuporz();
        nieuporz = is.sort(nieuporz);
        System.out.println(nieuporz+"\n\n\n");
        
        
        
        
        czesciowo();
        System.out.println(czesciowo+"\n");
        bs.sort(czesciowo);
        System.out.println(czesciowo+"\n");
        
        czesciowo();
        ss.sort(czesciowo);
        System.out.println(czesciowo+"\n");
        
        czesciowo();
        czesciowo = is.sort(czesciowo);
        System.out.println(czesciowo+"\n");
        */
    }
    
    public static void wykresDlaBS(int iloscTestow, int skala, int przeskok){
        BubbleSort bs = new BubbleSort(equ);
        Object[][] wykresBS = new Object[skala][iloscTestow];
        for(int i = 0; i < iloscTestow; i++){
            nieuporz(przeskok);
            przeskok += przeskok;
            nieuporz = bs.sort(nieuporz);
            int l = 0;
            while(bs.liczbaPrzepisan != l){
                l++;
            }
            wykresBS[l][i] = bs.liczbaPrzepisan + "Przp \t";
            l = 0;
            while(bs.liczbaPorownan != l){
                l++;
            }
            wykresBS[l][i] = bs.liczbaPorownan + "Pwt \t";
        }
        System.out.println("Ilość");
        for(int i = wykresBS.length-1; i >= 0; i--){
            for(int j = 0; j < iloscTestow; j++){
                if(j == 0 || i == 0){
                    if(wykresBS[i][j] != null);
                    else if(i == 0) wykresBS[i][j] = "[" + j + "]\t";
                    else wykresBS[i][j] = "[" + i + "]\t";
                }
                if(wykresBS[i][j] == null) System.out.print("     \t");
                else System.out.print(wykresBS[i][j]);
            }
            System.out.println();
        }
        System.out.println("Numer Pomiaru");
    }
    
    public static void wykresDlaSS(int iloscTestow, int skala, int przeskok){
        SelectSort ss = new SelectSort(equ);
        Object[][] wykresSS = new Object[skala][iloscTestow];
        for(int i = 0; i < iloscTestow; i++){
            nieuporz(przeskok);
            przeskok += przeskok;
            nieuporz = ss.sort(nieuporz);
            int l = 0;
            while(ss.liczbaPrzepisan != l){
                l++;
            }
            wykresSS[l][i] = ss.liczbaPrzepisan + "Przp \t";
            l = 0;
            while(ss.liczbaPorownan != l){
                l++;
            }
            wykresSS[l][i] = ss.liczbaPorownan + "Pwt \t";
        }
        System.out.println("Ilość");
        for(int i = wykresSS.length-1; i >= 0; i--){
            for(int j = 0; j < iloscTestow; j++){
                if(j == 0 || i == 0){
                    if(wykresSS[i][j] != null);
                    else if(i == 0) wykresSS[i][j] = "[" + j + "]\t";
                    else wykresSS[i][j] = "[" + i + "]\t";
                }
                if(wykresSS[i][j] == null) System.out.print("     \t");
                else System.out.print(wykresSS[i][j]);
            }
            System.out.println();
        }
        System.out.println("Numer Pomiaru");
    }
    
    public static void wykresDlaIS(int iloscTestow, int skala, int przeskok){
        InsertSort is = new InsertSort(equ);
        Object[][] wykresIS = new Object[skala][iloscTestow];
        for(int i = 0; i < iloscTestow; i++){
            nieuporz(przeskok);
            przeskok += przeskok;
            nieuporz = is.sort(nieuporz);
            int l = 0;
            while(is.liczbaPrzepisan != l){
                l++;
            }
            wykresIS[l][i] = is.liczbaPrzepisan + "Przp \t";
            l = 0;
            while(is.liczbaPorownan != l){
                l++;
            }
            wykresIS[l][i] = is.liczbaPorownan + "Pwt \t";
        }
        System.out.println("Ilość");
        for(int i = wykresIS.length-1; i >= 0; i--){
            for(int j = 0; j < iloscTestow; j++){
                if(j == 0 || i == 0){
                    if(wykresIS[i][j] != null);
                    else if(i == 0) wykresIS[i][j] = "[" + j + "]\t";
                    else wykresIS[i][j] = "[" + i + "]\t";
                }
                if(wykresIS[i][j] == null) System.out.print("     \t");
                else System.out.print(wykresIS[i][j]);
            }
            System.out.println();
        }
        System.out.println("Numer Pomiaru");
    }
    
    public static void uporz(int ilosc){
        uporz = new ArrayList();
        for(int i = 0; i < ilosc; i++){
            uporz.add(new Integer(i));
        }
    }
    
    public static void nieuporz(int ilosc){
        nieuporz = new ArrayList();
        Random r = new Random();
        for(int i = 0; i < ilosc; i++){
            nieuporz.add(new Integer(r.nextInt()));
        }
    }
    
    public static void czesciowo(int ilosc){
        czesciowo = new ArrayList();
        Random r = new Random();
        for(int i = 0; i < ilosc/2; i++){
            czesciowo.add(new Integer(i));
        }
        for(int i = 0; i < ilosc/2; i++){
            czesciowo.add(new Integer(r.nextInt()));
        }
    }
}
