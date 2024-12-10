package java16.service.impl;

import java16.dao.impl.MedicineDaoImpl;
import java16.models.Medicine;
import java16.service.MedicineService;

public class MedicineServiceImpl implements MedicineService {

    private final MedicineDaoImpl medicineDao;

    public MedicineServiceImpl(MedicineDaoImpl medicineDao) {
        this.medicineDao = medicineDao;
    }

    @Override
    public void addMedicineToPharmacyById(Long pharmacyId, Medicine newMedicine) {
          medicineDao.addMedicineToPharmacyById(pharmacyId,newMedicine);
    }
}
