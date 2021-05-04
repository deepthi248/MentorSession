package MSAssignment_Customer;
//using getters and setters

public class CustomerDemo2 {
    public static void main(String[] args){
       Customer customer4= new Customer();
       //setting the customer values
        customer4.setCustomerId(004);
        customer4.setCustomerName("Cha Eun Sung");
        customer4.setCustomerEmailId("eunsang@gmail.com");
        customer4.setCustomerPhoneNumber(987654321l);
        customer4.setCustomerAddress("Seoul, Korea");
        customer4.setCustomerType(false);

        //printing the customer details -- using getter
        System.out.print( "\nDetails of customer " + customer4.getCustomerId()  +
                "\nName of the customer: "+ customer4.getCustomerName()+
                "\nAddress of the customer: "+ customer4.getCustomerAddress()+
                "\nEmail Id of the customer: "+ customer4.getCustomerEmailId()+
                "\nPhone Number of customer: "+customer4.getCustomerPhoneNumber()+
                "\nType of Customer: "+ customer4.isCustomerType()+"\n \n" );

        Customer customer5= new Customer();
        customer5.setCustomerId(005);
        customer5.setCustomerName("Kim Mi So");
        customer5.setCustomerEmailId("Miso@gmail.com");
        customer5.setCustomerPhoneNumber(987654334l);
        customer5.setCustomerAddress("Seoul, Korea");
        customer5.setCustomerType(false);

        System.out.print( "\nDetails of customer " + customer5.getCustomerId()  +
                "\nName of the customer: "+ customer5.getCustomerName()+
                "\nAddress of the customer: "+ customer5.getCustomerAddress()+
                "\nEmail Id of the customer: "+ customer5.getCustomerEmailId()+
                "\nPhone Number of customer: "+customer5.getCustomerPhoneNumber()+
                "\nType of Customer: "+ customer5.isCustomerType()+"\n \n" );


        Customer customer6= new Customer();
        customer6.setCustomerId(006);
        customer6.setCustomerName("Lee Nam");
        customer6.setCustomerEmailId("nam@gmail.com");
        customer6.setCustomerPhoneNumber(987654356l);
        customer6.setCustomerAddress("Seoul, Korea");
        customer6.setCustomerType(false);

        System.out.print( "\nDetails of customer " + customer6.getCustomerId()  +
                "\nName of the customer: "+ customer6.getCustomerName()+
                "\nAddress of the customer: "+ customer6.getCustomerAddress()+
                "\nEmail Id of the customer: "+ customer6.getCustomerEmailId()+
                "\nPhone Number of customer: "+customer6.getCustomerPhoneNumber()+
                "\nType of Customer: "+ customer6.isCustomerType()+"\n \n" );

    }
}
