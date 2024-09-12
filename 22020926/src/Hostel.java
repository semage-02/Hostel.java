import java.lang.reflect.Array;
import java.util.ArrayList;


public class Hostel {

        public ArrayList<Tenant> tenants;
        public ArrayList<Integer> rooms;

        public Hostel(int numberOfRooms) {
            this.tenants = new ArrayList<>();
            this.rooms = new ArrayList<>();
            for (int i = 1; i <= numberOfRooms; i++) {
                this.rooms.add(i);
            }
        }

    public ArrayList<Tenant> getTenants() {
        return tenants;
    }

    public void setTenants(ArrayList<Tenant> tenants) {
        this.tenants = tenants;
    }

    public boolean checkRoomAvailability(int roomNumber) {
            for (Tenant tenant : tenants) {
                if (tenant.getRoomNo() == roomNumber) {
                    return false;
                }
            }
        return true;
    }

    public void addTenant(Tenant tenant) {
        tenants.add(tenant);
    }

    public void removeTenant(Tenant tenant) {
        tenants.remove(tenant);
    }

    public void displayTenants() {
        for (Tenant tenant : tenants) {
            System.out.println("Name: " + tenant.getName() + ", Room Number: " + tenant.getRoomNo());
        }
    }

    }

