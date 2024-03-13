package covariant;

public class SBI extends RBI {
    @Override
    public Double getRateOfInterest() {
        return 7.0;
    }
    public static void main(String[] args) {
        SBI sbi = new SBI();
        RBI rbi = new RBI();
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("RBI Rate of Interest: " + rbi.getRateOfInterest());
    }
}


