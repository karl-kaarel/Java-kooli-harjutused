package nadal_8;

import java.util.ArrayList;
import java.util.HashMap;

import nadal_8.harjutuse_klassid.RegistrationPlate;

public class harjutus_9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);
        finnish.add(reg3);

        RegistrationPlate new_plate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(new_plate)) {
            finnish.add(new_plate);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg2, "Jürgen");
        owners.put(reg3, "Mikk");


        System.out.println("owners:");
        System.out.println(owners.get(reg1));
        System.out.println(owners.get(reg2));
        System.out.println(owners.get(reg3));
        // if the hashCode hasn't been overwritten, the owners are not found
    }
}
