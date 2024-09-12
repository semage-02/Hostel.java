import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hostel hostel = new Hostel(50);

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1:Add Tenant");
            System.out.println("2:Remove Tenant");
            System.out.println("3:Display all tenants");
            System.out.println("4:Check room availability");
            System.out.println("5:Record payment");
            System.out.println("6:Display payment history");
            System.out.println("7:Calculate total payment for room");
            System.out.println("8:Check payment status");
            System.out.println("9:Identify tenants with missing payments");
            System.out.println("10:Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Tenant name");
                    String name = sc.next();
                    System.out.println("Enter Room number");
                    int roomNumber = sc.nextInt();
                    if (hostel.checkRoomAvailability(roomNumber)) {
                        Tenant tenant = new Tenant(name, roomNumber);
                        hostel.addTenant(tenant);
                        System.out.println("Tenant added successfully.");
                    } else {
                        System.out.println("Room not available.");
                    }
                    break;
                case 2:
                    System.out.println("Enter Tenant name");
                    String tenantName = sc.next();
                    for (Tenant t : hostel.tenants) {
                        if (t.getName().equals(tenantName)) {
                            hostel.removeTenant(t);
                            System.out.println("Tenant removed successfully.");
                            break;
                        }
                        else {
                            System.out.println("Tenant not found.");
                        }
                    }

                    break;
                case 3:
                    hostel.displayTenants();
                    break;
                case 4:
                    System.out.println("Enter Room number");
                    int roomNo = sc.nextInt();
                    System.out.println("Room availability: " + hostel.checkRoomAvailability(roomNo));
                    break;
                    case 5:
                    System.out.println("Enter Tenant name");
                    String paymentTenantName = sc.next();
                    for (Tenant t : hostel.tenants) {
                        if (t.getName().equals(paymentTenantName)) {
                            System.out.println("Enter Month");
                            int month = sc.nextInt();
                            System.out.println("Enter Amount");
                            double amount = sc.nextDouble();
                            Payment payment = new Payment(month, amount);
                            t.recordPayment(payment);
                            System.out.println("Payment recorded successfully.");
                            break;
                        }
                        else {
                            System.out.println("Tenant not found.");
                        }
                    }

                    break;

                case 6:
                    System.out.println("Enter Tenant name");
                    String historyTenantName = sc.next();
                    for (Tenant t : hostel.tenants) {
                        if (t.getName().equals(historyTenantName)) {
                            t.displayPaymentHistory();
                            break;
                        }

                        else {
                            System.out.println("Tenant not found.");
                        }
                    }

                    break;

                case 7:
                    System.out.println("Enter Tenant name");
                    String totalPaymentTenantName = sc.next();
                    for (Tenant t : hostel.tenants) {
                        if (t.getName().equals(totalPaymentTenantName)) {
                            double totalPayment = t.calculateTotalPayment();
                            System.out.println("Total payment for " + t.getName() + ": " + totalPayment);
                            break;
                        }
                        else {
                            System.out.println("Tenant not found.");
                        }
                    }

                    break;

                case 8:
                    System.out.println("Enter Tenant name");
                    String paymentStatusTenantName = sc.next();
                    for (Tenant t : hostel.tenants) {
                        if (t.getName().equals(paymentStatusTenantName)) {
                            System.out.println("Enter Month");
                            int month = sc.nextInt();
                            boolean paymentStatus = t.checkPaymentStatus(month);
                            System.out.println("Payment status for " + t.getName() + " in month " + month + ": " + paymentStatus);
                            break;
                        }
                        else {
                            System.out.println("Tenant not found.");
                        }
                    }

                    break;

                case 9:
                    System.out.println("Enter Month");
                    int missingPaymentMonth = sc.nextInt();
                    System.out.println("Tenants with missing payments for month " + missingPaymentMonth + ":");
                    for (Tenant t : hostel.tenants) {
                        if (!t.checkPaymentStatus(missingPaymentMonth)) {
                            System.out.println(t.getName());
                        }
                    }
                    break;

                case 10:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }
}
