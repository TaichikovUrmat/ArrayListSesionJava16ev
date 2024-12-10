package java16.dao.impl;

import java16.dao.MedicineDao;
import java16.db.DataBase;
import java16.db.Generator;
import java16.models.Medicine;
import java16.models.Pharmacy;

import java.time.LocalDate;

public class MedicineDaoImpl implements MedicineDao {

    private final DataBase dataBase = new DataBase();

    @Override
    public void addMedicineToPharmacyById(Long pharmacyId, Medicine newMedicine) {
        boolean isbloc   = false;
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if (pharmacy.getId().equals(pharmacy)){
                isbloc = true;
                Medicine medicine =  new Medicine(Generator.setMedicineID(),"parastamol ",30,"efsf", LocalDate.of(2005,12,3));
                pharmacy.getMedicineList().add(medicine);
            }
        }
        if (!isbloc){
            System.out.println("not found " +pharmacyId);
        }

    }
}
