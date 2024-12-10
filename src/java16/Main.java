package java16;

import java16.dao.PharmacyDao;
import java16.dao.impl.PharmacyDaoImpl;
import java16.db.Generator;
import java16.enums.Gender;
import java16.models.Employee;
import java16.models.Medicine;
import java16.models.Pharmacy;
import java16.service.PharmacyService;
import java16.service.impl.PharmacyServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // dao
        PharmacyDaoImpl pharmacyDao = new PharmacyDaoImpl();
        // service
        PharmacyServiceImpl pharmacyService = new PharmacyServiceImpl(pharmacyDao);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1 add pharmacy
                    2 getAll pharmacy
                    3 get buy pharmacy id 
                    4 update by id 
                    5 delete  by id 
                    """);
            int word = scanner.nextInt();

            switch (word) {
                case 1:
                    pharmacyService.addPharmacy(new Pharmacy(Generator.setPhormacyId(), "Neman", "Vostok 5",new ArrayList<>(),new ArrayList<>()));
                    pharmacyService.addPharmacy(new Pharmacy(Generator.setPhormacyId(), "Aibolit", "Chyi 119"));
                    break;
                case 2:
                    System.out.println(pharmacyService.getAllPharmacy());
                    break;
                case 3:
                    System.out.println(pharmacyService.getByPharmacyID(2L));
                    break;
                case 4 :
                    pharmacyService.updatePharmacyById(2L,new Pharmacy(Generator.setPhormacyId(), "Kanchoro", "Chyi 119"));
                    break;
                case 5 :
                    pharmacyService.deletePharmacyById(2L);
                    break;
            }
        }

    }
}