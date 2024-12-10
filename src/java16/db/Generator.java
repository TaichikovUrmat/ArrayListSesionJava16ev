package java16.db;

public class Generator {

    private static Long phormacyID = 1L;
    private  static Long medicineID = 1L;
    private static   Long employeeID = 1L;


    public static Long setPhormacyId() {
        return phormacyID++;
    }

    public static Long  setMedicineID() {
         return  medicineID++;
    }

    public static Long  setEmployeeID() {
         return employeeID++;
    }


}
