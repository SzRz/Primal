import java.util.Random;import java.util.ArrayList; import java.util.Iterator; import java.io.*;
public class Test_Zad3
{
    public static void main() throws FileNotFoundException{
        PrintWriter z = new PrintWriter(new File("Wyniki.txt"));
        Random r = new Random();
        ArrayList all = new ArrayList();
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList();
        ArrayList l3 = new ArrayList();
        String[] imiona = {"aa", "ab", "ac", "bb", "ba", "bc", "bd", "cd", "cc", "dd", "da"};
        String[] nazwiska = imiona;
        for(int i = 0; i < 1000; i++){
            l1.add(new Student.Builder(r.nextInt(90000)+10000).imie(imiona[r.nextInt(11)]).nazwisko(nazwiska[r.nextInt(11)]).ocena(r.nextInt(5)).stypendium(r.nextInt(1000)).build());
            l2.add(new Student.Builder(i + 10000).imie(imiona[r.nextInt(11)]).nazwisko(nazwiska[r.nextInt(11)]).ocena(r.nextInt(5)).stypendium(r.nextInt(1000)).build());
            l3.add(new Student.Builder(90000 - i).imie(imiona[r.nextInt(11)]).nazwisko(nazwiska[r.nextInt(11)]).ocena(r.nextInt(5)).stypendium(r.nextInt(1000)).build());
        }
        
        
        
        all.add(l1);
        ArrayList l12 = new ArrayList();
        for(int i = 0; i < 750; i++)
            l12.add(l1.get(i));
        all.add(l12);
        ArrayList l13 = new ArrayList();
        for(int i = 0; i < 500; i++)
            l13.add(l1.get(i));
        all.add(l13);    
        ArrayList l14 = new ArrayList();
        for(int i = 0; i < 250; i++)
            l14.add(l1.get(i));
        all.add(l14);    
        ArrayList l15 = new ArrayList();
        for(int i = 0; i < 100; i++)
            l15.add(l1.get(i));
        all.add(l15);    
        
        
        
        all.add(l2);
        ArrayList l22 = new ArrayList();
        for(int i = 0; i < 750; i++)
            l22.add(l2.get(i));
        all.add(l22);
        ArrayList l23 = new ArrayList();
        for(int i = 0; i < 500; i++)
            l23.add(l2.get(i));
        all.add(l23);    
        ArrayList l24 = new ArrayList();
        for(int i = 0; i < 250; i++)
            l24.add(l2.get(i));
        all.add(l24);    
        ArrayList l25 = new ArrayList();
        for(int i = 0; i < 100; i++)
            l25.add(l2.get(i));
        all.add(l25);    
        
        
        
        
        all.add(l3);
        ArrayList l32 = new ArrayList();
        for(int i = 0; i < 750; i++)
            l32.add(l3.get(i));
        all.add(l32);
        ArrayList l33 = new ArrayList();
        for(int i = 0; i < 500; i++)
            l33.add(l3.get(i));
        all.add(l33);    
        ArrayList l34 = new ArrayList();
        for(int i = 0; i < 250; i++)
            l34.add(l3.get(i));
        all.add(l34);    
        ArrayList l35 = new ArrayList();
        for(int i = 0; i < 100; i++)
            l35.add(l3.get(i));
        all.add(l35);    
        
        /**
         * after = (ArrayList)it.next();
            kopia = (ArrayList)after.clone();
            as = new SelectSort(new NaturalComparator());
            after = as.sort(kopia);
            System.out.println(after);
            System.out.println(as.stat);
                z.println("Proba: "+ as.stat);
            kopia = (ArrayList)after.clone();
            as = new SelectSort(new KomparatorOdwrotny(new KomparatorStypendium()));
            after = as.sort(kopia);
            System.out.println(after);
            System.out.println(as.stat);

            kopia = (ArrayList)after.clone();
            KomparatorZlozony c = new KomparatorZlozony();
            c.dodaj((Comparator)new KomparatorNazwiska());
            c.dodaj(new KomparatorImienia());
            as = new SelectSort(c);
            after = as.sort(kopia);
            System.out.println(after);
            System.out.println(as.stat+"\n");
         */
        
        //
        z.println("SELECT SORT;Porównań;Przepisań;");
        Iterator it = all.iterator();
        ArrayList kopia;
        AlgorytmSortowania as;
        ArrayList after;
        String[] typ = {"Nieposortowane", "Posortowane", "Odwrotnie"};
        int i = 0;
        while(it.hasNext()){
            after = (ArrayList)it.next();
            kopia = (ArrayList)after.clone();
            as = new SelectSort(new NaturalComparator());
            after = as.sort(kopia);
            System.out.println(after);
                z.println(typ[(i/5)%typ.length] + " Proba " + after.size() + ": ;"+ as.stat + ";");
            System.out.println(as.stat+"\n");
            i++;
        }
        System.out.println("\n\n");
        z.println("BUBBLE SORT;Porównań;Przepisań;");
        it = all.iterator();
        i=0;
        while(it.hasNext()){
            after = (ArrayList)it.next();
            kopia = (ArrayList)after.clone();
            as = new BubbleSort(new NaturalComparator());
            after = as.sort(kopia);
            System.out.println(after);
                z.println(typ[(i/5)%typ.length] + " Proba " + after.size() + ": ;"+ as.stat + ";");
            System.out.println(as.stat+"\n");
            i++;
        }
        z.close();
        //

    }
}
