package q12;

public class Emp {
    int empId;
    String empName, designation;
    double basic;
    final double hra;

    public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
        hra = calulateHra(designation);
        if (basic<500)
            throw new LowSalException();
    }

    double calulateHra(String designation) {
        double thra;
        switch (designation) {
            case "manager":
                thra = basic * .1;
                return thra;
            case "officer":
                thra = basic * .12;
                return thra;
            case "clerk":
                thra = basic * .05;
                return thra;
            default:
                return 0;
        }

    }

    void printDET() {
        System.out.println("Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", basic=" + basic +
                ", hra=" + hra +
                '}');
    }
}

class LowSalException extends Exception{

    public LowSalException() {
      System.out.println("low salary");
    }

}