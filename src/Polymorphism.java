public class Polymorphism {
    public static void main(String[] args){
    CashPayment cash = new CashPayment();
    cash.pay();

    Payment p = new CashPayment();
    p.pay();

    p = new CreditPayment();
    p.pay();
    }
}

interface Payment {
    public void pay();
}

class CashPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("Este un pago en efectivo");
    }
}

class CreditPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("Este un pago con tarjeta de credito.");
    }
}