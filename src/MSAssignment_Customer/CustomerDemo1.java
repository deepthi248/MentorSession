package MSAssignment_Customer;
//usig constructor
public class CustomerDemo1 {
    public static void main(String[] args){
        //assigning customer details
       Customer customer1 = new Customer(001,"Akshitha","Hyderabad,India",
                                            "Akshitha@gmail.com", 9876543210l,
                                            true);

       //calling child class - previlaged and regular customers
        if(customer1.isCustomerType()){
            PrevilagedCustomer previlagedCustomer = new PrevilagedCustomer(customer1.getCustomerId(), customer1.getCustomerName(),
                    customer1.getCustomerAddress(), customer1.getCustomerEmailId(), customer1.getCustomerPhoneNumber(),
                    customer1.isCustomerType() );
            previlagedCustomer.setDiscount(0.5f);
            System.out.print( "\nDetails of customer " + customer1.getCustomerId()  +
                    "\nName of the customer: "+ customer1.getCustomerName()+
                    "\nAddress of the customer: "+ customer1.getCustomerAddress()+
                    "\nEmail Id of the customer: "+ customer1.getCustomerEmailId()+
                    "\nPhone Number of customer: "+customer1.getCustomerPhoneNumber()+
                    "\nType of Customer: "+ customer1.isCustomerType()+
                    "\nDiscount offered: "+   previlagedCustomer.getDiscount()+
                    "\n \n"
            );
        }
        else{
            RegularCustomer regularCustomer= new RegularCustomer(customer1.getCustomerId(), customer1.getCustomerName(),
                    customer1.getCustomerAddress(), customer1.getCustomerEmailId(), customer1.getCustomerPhoneNumber(),
                    customer1.isCustomerType());
            regularCustomer.setDiscount(5.0f);
            System.out.print( "\nDetails of customer " + customer1.getCustomerId()  +
                            "\nName of the customer: "+ customer1.getCustomerName()+
                            "\nAddress of the customer: "+ customer1.getCustomerAddress()+
                            "\nEmail Id of the customer: "+ customer1.getCustomerEmailId()+
                            "\nPhone Number of customer: "+customer1.getCustomerPhoneNumber()+
                            "\nType of Customer: "+ customer1.isCustomerType()+
                            "\n Discount offered"+   regularCustomer.getDiscount()+
                    "\n \n"
            );
        }




       //printing customer details




        //assigning customer details
        Customer customer2 = new Customer(002,"Deekshitha","Hyderabad,India",
                                          "deekshitha@gmail.com", 9876540321l,
                                          true);
        //printing customer details

       // customer2.printCustomerDetails();
        //assigning customer details

        Customer customer3 = new Customer(003,"Abhinav","Hyderabad,India",
                                          "abhinav@gmail.com", 9675432910l,
                                          true);
        //printing customer details

       // customer3.printCustomerDetails();



    }

}

