package java16.service.impl;

import java16.dao.impl.PharmacyDaoImpl;
import java16.db.DataBase;
import java16.models.Pharmacy;
import java16.service.PharmacyService;

import java.util.ArrayList;

public class PharmacyServiceImpl implements PharmacyService {
    //    private final DataBase dataBase = new DataBase();

    private final PharmacyDaoImpl pharmacyDaoImpl;

    public PharmacyServiceImpl(PharmacyDaoImpl pharmacyDaoImpl) {
        this.pharmacyDaoImpl = pharmacyDaoImpl;

    }


    @Override
    public void addPharmacy(Pharmacy newParmacy) {
        pharmacyDaoImpl.addPharmacy(newParmacy);
    }

    @Override
    public ArrayList<Pharmacy> getAllPharmacy() {
        return pharmacyDaoImpl.getAllPharmacy();
    }

    @Override
    public Pharmacy getByPharmacyID(Long pharmacyID) {
        return pharmacyDaoImpl.getByPharmacyID(pharmacyID);
    }

    @Override
    public void updatePharmacyById(Long pharmacyID, Pharmacy newPharmacy) {
        pharmacyDaoImpl.updatePharmacyById(pharmacyID, newPharmacy);
    }

    @Override
    public void deletePharmacyById(Long pharmacyID) {
        pharmacyDaoImpl.deletePharmacyById(pharmacyID);
    }
}
