public class Dikdortgen {
    private int aKenari;
    private int bKenari;
    private int a;
    private int b;

    public Dikdortgen(int aKenari, int bKenari) {
        this.bKenari = bKenari;
        this.aKenari = aKenari;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getAKenari() {
        return aKenari;
    }

    public int getBKenari() {
        return bKenari;
    }

    public void setAKenari(int aKenari) {
        this.aKenari = aKenari;
    }

    public void setBKenari(int bKenari) {
        this.bKenari = bKenari;
    }

    public void dikdortgenCiz() {
        setB(getBKenari());
        //Ici Dolu Dikdortgen Cizme Kodlari
        for (getB(); getB() >= 0; setB(getB() - 1)) {
            for (getA(); getA() > 0; setA(getA() - 1)) {
                System.out.print("*");
            }
            System.out.println("");
            setA(getAKenari());
        }
        System.out.println();
        setB(getBKenari());
        //Ici Bos Dikdortgen Cizme Kodlari
        for (getB(); getB() > 0; setB(getB() - 1)) {
            for (getA(); getA() > 0; setA(getA() - 1)) {
                if (getB() == 1 || getB() == getBKenari() ) {
                    System.out.print("*");
                }
                else if(getA() == 1 || getA() == getAKenari()) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            setA(getAKenari());
        }
    }
}
