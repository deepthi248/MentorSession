package FoodProduct;

public class CookingProduct extends FoodProduct{
    private float pricePerKg;
    private int weightInKg;
    private String range;
    private String bagType;
    private int noOfBag;

    public boolean validateWeightInKg(){
        return true;
    }
    public boolean validateBagType(){
        return true;

    }
    public double calculateBill(){
        return 0;
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


