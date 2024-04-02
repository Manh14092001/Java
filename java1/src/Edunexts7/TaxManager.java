package Edunexts7;

public class TaxManager {
    private static final int Max = 100;
    private Taxpayer[] list = new Taxpayer[Max];
    private int count = 0;
    public boolean addTaxpayer(Taxpayer taxpayer){
        if (count >= Max){
            return false;
        }
        list[count++] = taxpayer;
        return true;
    }
    public double getTax(){
        double sum = 0;
        for (int i = 0 ; i<count; i++){
        sum += list[i].pay();
        }
        return sum;
    }
}
