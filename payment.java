public class payment{
    public static void main(String[] args){
      double amount = 100.0
      boolean paymentSuccess = processPayment(amount);
      if (paymentSuccess){
        System.out.println("payed" + amount);
      } else {
        System.out.println("failed");
    }
}
