import java.util.ArrayList;
public class Tenant {

    private String tenantName;
    private int roomNumber;
    private ArrayList<Payment> payments;


    public Tenant(String tenantName, int roomNumber) {
         this.tenantName = tenantName;
         this.roomNumber = roomNumber;
         this.payments = new ArrayList<>();


    }

       public String getName() {

        return tenantName;
    }

    public int getRoomNo() {
        return roomNumber;
    }


    public void recordPayment(Payment payment) {
        payments.add(payment);
    }

    public void displayPaymentHistory() {
        for (Payment payment : payments) {
            System.out.println("Month: " + payment.getMonth() + ", Amount: " + payment.getAmount());
        }
    }

    public double calculateTotalPayment() {
        double totalPayment = 0;
        for (Payment payment : payments) {
            totalPayment += payment.getAmount();
        }
        return totalPayment;
    }

    public boolean checkPaymentStatus(int month) {
        for (Payment payment : payments) {
            if (payment.getMonth() == month) {
                return true;
            }
        }
        return false;
    }
}





