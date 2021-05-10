package MSAssignment_Customer;


public class PrevilagedCustomer extends Customer {

    private float discount;


    public PrevilagedCustomer(int customerId, String customerName, String customerAddress, String customerEmailId, long customerPhoneNumber, boolean customerType) {
        super(customerId, customerName, customerAddress, customerEmailId, customerPhoneNumber, customerType);
    }
    public void setDiscount(float discount){
        this.discount=discount;
    }
    public float getDiscount() {
        return discount;
    }


}
