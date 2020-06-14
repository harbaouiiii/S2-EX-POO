package projet;

import exceptions.InvalidTimeException;

public class Temps {

    private int h,m,s;

    public Temps(int s) throws InvalidTimeException{
        if(s>=0){
            this.s=s;
        } else{
            throw new InvalidTimeException("Temps négtaif!");
        }
    }
    public Temps(int m,int s) throws InvalidTimeException{
        this(s);
        if(m>=0)
            this.m=m;
        else
            throw new InvalidTimeException("Temps négatif!");
    }

    public Temps(int h, int m,int s) throws InvalidTimeException{
        this(m,s);
        if(h>=0)
            this.h=h;
        else
            throw new InvalidTimeException("Temps négatif!");
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }


    public String toString(){
        while(this.s>=60 || this.m>=60){
            if(this.s>=60){
                this.s-=60;
                this.m++;
            }
            if(this.m>=60){
                this.m-=60;
                this.h++;
            }
        }
        return String.format("%02d",this.h)+":"+String.format("%02d",this.m)+":"+String.format("%02d",this.s);
    }


}
