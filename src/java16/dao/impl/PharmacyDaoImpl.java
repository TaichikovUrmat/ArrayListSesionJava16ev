package java16.dao.impl;

import java16.dao.PharmacyDao;
import java16.db.DataBase;
import java16.models.Employee;
import java16.models.Pharmacy;

import java.util.ArrayList;
import java.util.List;

public class PharmacyDaoImpl implements PharmacyDao {


    private  final DataBase dataBase = new DataBase();


    @Override
    public void addPharmacy(Pharmacy newParmacy) {
        ArrayList<Employee> employees = new ArrayList<>();
        newParmacy.setEmployeesList(employees);
        dataBase.pharmaciesList.add(newParmacy);
        System.out.println("Success added  !!");
    }

    @Override
    public ArrayList<Pharmacy> getAllPharmacy() {
        return dataBase.pharmaciesList;
    }

    @Override
    public Pharmacy getByPharmacyID(Long pharmacyID) {
         boolean isbloc = false;
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if (pharmacy.getId().equals(pharmacyID)){
               isbloc = true;
                System.out.println(pharmacy);
            }
        }
        if (!isbloc){
            System.out.println("not found id " + pharmacyID);
        }
        return null;
    }

    @Override
    public void updatePharmacyById(Long pharmacyID, Pharmacy newPharmacy) {
         boolean isbloc = false;
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if (pharmacy.getId().equals(pharmacyID)){
                isbloc = true;

                pharmacy.setName(newPharmacy.getName());
                pharmacy.setAddress(newPharmacy.getAddress());

                System.out.println("updateded !! ");
                break;
            }
        }
        if (!isbloc){
            System.out.println("not found pharmacyID "+pharmacyID);
        }

    }

    @Override
    public void deletePharmacyById(Long pharmacyID) {

        boolean isbloc = false;
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if (pharmacy.getId().equals(pharmacyID)){
                isbloc = true;
                dataBase.pharmaciesList.remove(pharmacy);
                System.out.println("success  deleted !! ");
                break;
            }
        }
        if (!isbloc){
            System.out.println("not found pharmacyID "+pharmacyID);
        }

    }
}
