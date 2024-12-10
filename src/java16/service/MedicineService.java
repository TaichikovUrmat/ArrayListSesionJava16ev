package java16.service;

import java16.models.Medicine;

public interface MedicineService {

    void addMedicineToPharmacyById(Long pharmacyId, Medicine newMedicine);


}
