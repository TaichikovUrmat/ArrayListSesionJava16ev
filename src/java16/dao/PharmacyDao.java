package java16.dao;

import java16.models.Pharmacy;

import java.util.ArrayList;

public interface PharmacyDao {

                /// CRUD

    //  TODO add
    void  addPharmacy(Pharmacy newParmacy);

    //  TODO getALL
    ArrayList<Pharmacy> getAllPharmacy();

    // TODO  getById
    Pharmacy getByPharmacyID(Long pharmacyID);

    //  TODO update  by id
    void  updatePharmacyById(Long pharmacyID, Pharmacy newPharmacy);

    //  TODO  delete by id
    void deletePharmacyById(Long pharmacyID);
}