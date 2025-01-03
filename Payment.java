public class Payment {
    public static void main(String[] args) {
        double amount = 100.0; // 세미콜론 추가
        boolean paymentSuccess = processPayment(amount); // 메서드 호출

        if (paymentSuccess) {
            System.out.println("Paid: " + amount); // 메시지 수정
        } else {
            System.out.println("Payment failed");
        }
    }

    // 간단한 모의 결제 처리 메서드 구현
    public static boolean processPayment(double amount) {
        if (amount > 0) {
            // 결제가 성공했다고 가정
            return true;
        } else {
            // 금액이 잘못된 경우 결제 실패
            return false;
        }
    }
}
