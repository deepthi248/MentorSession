package MSAssignment_Customer;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmailId;
    private long customerPhoneNumber;
    private boolean customerType;

     public Customer(int customerId, String customerName, String customerAddress, String customerEmailId, long customerPhoneNumber, boolean customerType) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmailId = customerEmailId;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerType = customerType;
    }

    public void printCustomerDetails(){
            System.out.print( "\nDetails of customer " + this.customerId +
                    "\nName of the customer: "+ this.customerName+
                    "\nAddress of the customer: "+ this.customerAddress+
                    "\nEmail Id of the customer: "+ this.customerEmailId+
                    "\nPhone Number of customer: "+this.customerPhoneNumber+
                    "\nType of Customer: "+this.customerType+"\n \n" );
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmailId() {
        return customerEmailId;
    }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public boolean isCustomerType() {
        return customerType;
    }

    public void setCustomerType(boolean customerType) {
        this.customerType = customerType;
    }
}
