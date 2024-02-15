public class Employee {
    private String employeeID;
    private String employeeName;
    private String phoneNumber;

    public Employee(){
        
    }
    public Employee(String employeeID,String employeeName, String phoneNumber) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.phoneNumber = phoneNumber;
    }
    public String getemployeeID() {
        return employeeID;
    }
    public String getemployeeName() {
        return employeeName;
    }
    public String getphoneNumber() {
        return phoneNumber;
    }
    public void setEmployeeProfile(String employeeID,String employeeName, String phoneNumber){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.phoneNumber = phoneNumber;
    }
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
}