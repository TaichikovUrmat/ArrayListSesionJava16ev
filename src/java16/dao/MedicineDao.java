package java16.dao;

import java16.models.Medicine;

public interface MedicineDao {
    void addMedicineToPharmacyById(Long pharmacyId, Medicine newMedicine);

}
