import java.util.Random;
public class Student 
{
    private int nrIndeksu;
    private double ocena;
    private float stypendium;
    private String imie, nazwisko;

    public static class Builder{
        private final int nrIndeksu;

        private double ocena = 0;
        private String imie = "ABC";
        private String nazwisko = "XYZ";
        private float stypendium = 0;

        public Builder(int nr){
            this.nrIndeksu = nr;
        }

        public Builder(){
            Random r = new Random();
            this.nrIndeksu = r.nextInt(9999) + 10000;
        }

        public Builder ocena(double grade){
            if(grade == 2.5){
                grade-=0.5;
            }else if(grade % 0.5 == 0 && (grade >=2 && grade <=5)){
                this.ocena = grade;
            }else{
                this.ocena = 2;
            }
            return this;
        }
        
        public Builder stypendium(float s){
            this.stypendium = s;
            return this;
        }
        
        public Builder imie(String f){
            this.imie = f;
            return this;
        }
        
        public Builder nazwisko(String s){
            this.nazwisko = s;
            return this;
        }
        
        public Student build(){
            return new Student(this);
        }
    }

    public Student(Builder b){
        nrIndeksu = b.nrIndeksu;
        ocena = b.ocena;
        imie = b.imie;
        nazwisko = b.nazwisko;
        stypendium = b.stypendium;
    }
    
    public Student(){
        double licz;
        Random r = new Random();
        nrIndeksu = r.nextInt(9999) + 10000;
        if(r.nextInt(2) == 0){
            licz = 0.5;
        }else{
            licz = 0;
        }
        ocena = r.nextInt(4) + 2 + licz;
        if(ocena == 2.5 || ocena == 5.5){
            ocena-=0.5;
        }
    }

    public Student(int nr,String imie,String nazwisko,double ocena){
        nrIndeksu = nr;
        this.imie = imie;
        this.nazwisko = nazwisko;
        if(ocena == 2.5){
            ocena-=0.5;
        }else if(ocena % 0.5 == 0 && ocena >=2 || ocena <=5){
            this.ocena = ocena;
        }
    }

    public String toString(){
        return "[" + nrIndeksu + " " + imie + " " + nazwisko + " " + ocena + " " + stypendium + "]";
    }

    public void setNrIndeksu(int nr){nrIndeksu = nr;}

    public void setOcena(double ocena){
        if(ocena % 0.5 == 0 && ocena <= 5 && ocena >=2 & ocena != 2.5){
            this.ocena = ocena;
        }
    }

    public void setImie(String imie){this.imie = imie;}

    public void setNazwisko(String nazwisko){this.nazwisko = nazwisko;}

    public int getNrIndeksu(){return nrIndeksu;}
    
    public void setStypendium(float s){this.stypendium = s;}

    public float getStypendium(){return stypendium;}

    public double getOcena(){return ocena;}

    public String getImie(){return imie;}

    public String getNazwisko(){return nazwisko;}
    
    public int compareTo(Object o){
        return getNrIndeksu() - ((Student)o).getNrIndeksu();
    }
    
    public boolean equals(Object o){
        return getNrIndeksu() == ((Student)o).getNrIndeksu();
    }
}
