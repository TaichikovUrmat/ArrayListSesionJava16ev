package java16.models;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class Pharmacy {
    private Long id;
    private String name;
    private String address;
    private ArrayList<Employee> employeesList;
    private ArrayList<Medicine> medicineList;

    public Pharmacy(){}

    public Pharmacy(Long id, String name, String address, ArrayList<Employee> employeesList, ArrayList<Medicine> medicineList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.employeesList = employeesList;
        this.medicineList = medicineList;
    }
    public Pharmacy(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", employeesList=" + employeesList +
                ", medicineList=" + medicineList +
                '}';
    }
}
