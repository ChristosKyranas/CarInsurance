package CarInsuranceUtils.Models;

public class Vehicle implements Comparable<Vehicle> {

    private static final int PLATE_NUMBER_LENGTH = 7;
    private Integer owner;
    private String plateNumber;
    private String insuranceDate;

    public Vehicle() {
    }

    public Vehicle(String plateNumber, String insuranceDate, int owner) {
        this.plateNumber = plateNumber;
        this.insuranceDate = insuranceDate;
        this.owner = owner;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(String insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public int compareTo(Vehicle o) {
        return compare(this.getPlateNumber(), o.getPlateNumber());
    }

    private int compare(String plateNumber1, String plateNumber2) {
        int comparison = 0;
        while (comparison == 0) {
            int index = 0;
            while (index <= (PLATE_NUMBER_LENGTH) && comparison == 0) {
                if (plateNumber1.charAt(index) != plateNumber2.charAt(index)) {
                    comparison = plateNumber1.charAt(index) - plateNumber2.charAt(index);
                }
                index++;
            }
        }
        return comparison;
    }

    @Override
    public String toString() {
        return "The " + getOwner()
                + "'s vehicle plate number is " + getPlateNumber()
                + " and expires in " + getInsuranceDate() + "\n";

    }


}
