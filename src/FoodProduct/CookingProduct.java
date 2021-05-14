package FoodProduct;

public class CookingProduct extends FoodProduct{
    private float pricePerKg;
    private int weightInKg;
    private String range;
    private String bagType;
    private int noOfBag;

    public boolean validateWeightInKg(){
        if( this.weightInKg>=1 && this.weightInKg <=14)
            return true;
        else
            return false;
    }
    public boolean validateBagType(){
        if( this.bagType.equals("Plastic") || this.bagType.equals("Cotton") || this.bagType.equals("Paper") )
            return true;
        else
            return false;
    }
    public double calculateBill(){
        //implementing -- validateItem
        double discount=0.0,bagCost =0.0, itemPrice=0.0,bill=0.0;

        if(validateItemType()){
            if(  validateWeightInKg() ){
                  if(  validateBagType() ){

                    if(this.noOfBag==1 && this.range.equals("small") ){
                        discount=  0.0;
                        bagCost = this.bagType.equals("Paper")?1 : this.bagType.equals("Paper") ? 3 :
                                this.bagType.equals("cotton")?10:-1;
                        //billAmount=itemPrice –(itemPrice*discount/100)+(chargePerBag*noOfBag)
                        //itemPrice=pricePerKg*weightInKg
                        itemPrice = this.pricePerKg* this.weightInKg;
                        bill = itemPrice-(itemPrice*discount/100)+(bagCost*this.noOfBag);

                    }
                    else if(this. noOfBag==2 &&this.range.equals("medium") ){
                        discount= 9.0;
                        bagCost = this.bagType.equals("Paper")?1 : this.bagType.equals("Paper") ? 3 :
                                this.bagType.equals("cotton")?10:-1;
                        //billAmount=itemPrice –(itemPrice*discount/100)+(chargePerBag*noOfBag)
                        //itemPrice=pricePerKg*weightInKg
                        itemPrice = this.pricePerKg* this.weightInKg;
                        bill = itemPrice-(itemPrice*discount/100)+(bagCost*this.noOfBag);
                    }
                    else {
                        discount= 12.0;
                        bagCost = this.bagType.equals("Paper")?1 : this.bagType.equals("Paper") ? 3 :
                                this.bagType.equals("cotton")?10:-1;
                        //billAmount=itemPrice –(itemPrice*discount/100)+(chargePerBag*noOfBag)
                        //itemPrice=pricePerKg*weightInKg
                        itemPrice = this.pricePerKg* this.weightInKg;
                        bill = itemPrice-(itemPrice*discount/100)+(bagCost*this.noOfBag);
                    }
                  }
                  else{
                      System.out.print("Invalid BagType ");
                  }

            }
            else{
                System.out.print("Weight is Invalid");
            }

        }
        else{
            System.out.print("Item is Invalid");
        }
        return bill;
    }


    public CookingProduct(String itemId, String itemName,
                          char itemType, float pricePerKg,
                          int weightInKg, String range,
                          String bagType, int noOfBag) {
        super(itemId, itemName, itemType);
        this.pricePerKg = pricePerKg;
        this.weightInKg = weightInKg;
        this.range = range;
        this.bagType = bagType;
        this.noOfBag = noOfBag;
    }
}


