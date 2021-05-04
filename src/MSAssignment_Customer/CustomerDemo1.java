package MSAssignment_Customer;
//usig constructor
public class CustomerDemo1 {
    public static void main(String[] args){
        //assigning customer details
       Customer customer1 = new Customer(001,"Akshitha","Hyderabad,India",
                                            "Akshitha@gmail.com", 9876543210l,
                                            true);
       //printing customer details
        System.out.print( "\nDetails of customer " + customer1.getCustomerId()  +
                "\nName of the customer: "+ customer1.getCustomerName()+
                "\nAddress of the customer: "+ customer1.getCustomerAddress()+
                "\nEmail Id of the customer: "+ customer1.getCustomerEmailId()+
                "\nPhone Number of customer: "+customer1.getCustomerPhoneNumber()+
                "\nType of Customer: "+ customer1.isCustomerType()+"\n \n" );

        //assigning customer details
        Customer customer2 = new Customer(002,"Deekshitha","Hyderabad,India",
                                          "deekshitha@gmail.com", 9876540321l,
                                          true);
        //printing customer details

        customer2.printCustomerDetails();
        //assigning customer details

        Customer customer3 = new Customer(003,"Abhinav","Hyderabad,India",
                                          "abhinav@gmail.com", 9675432910l,
                                          true);
        //printing customer details

        customer3.printCustomerDetails();



    }

}

