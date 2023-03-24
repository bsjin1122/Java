package projectOOP;
class Accounting{
    // 공급가액
    public double valueOfSupply;
    // 부가가치세율
    public static double vatRate = 0.1;

    public Accounting(double valueOfSupply){
            this.valueOfSupply = valueOfSupply;
    }


    //static은 클래스의 소속 instance의 소속 되려면 static를 없애야 한다. 
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class AccountingApp {
    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);
        Accounting a2 = new Accounting(20000.0);

        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);
        
        // Accounting.valueOfSupply = 10000.0;
        // System.out.println("Value of supply : " + Accounting.valueOfSupply);
        // System.out.println("VAT : " + Accounting.getVAT());
        // System.out.println("Total : " + Accounting.getTotal());
    }
 
}