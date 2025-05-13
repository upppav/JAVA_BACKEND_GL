package JAVA8;

public class AnonymousClass implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying by cash");
    }
    public static void main(String[] args) {
        //normal implementation
        Payment payment=new AnonymousClass();
        payment.pay();
        // anonymous inner classes?
        // a class that implements the Payment interface and provides the implementation of pay()
        Payment payment1=new Payment() {
            @Override
            public void pay() {
                System.out.println("Paying by cheque");
            }
        };
        payment1.pay();
    }
}

