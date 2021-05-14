package FoodProduct;

public abstract class  FoodProduct {

    private String itemId;
    private String itemName;
    private char itemType;
    private static int counter;
     abstract double  calculateBill();


    public FoodProduct(String itemId, String itemName, char itemType) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        String item="F";
        int number = 90;
        this.itemId = item + number++;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public char getItemType() {
        return itemType;
    }

    public void setItemType(char itemType) {
        this.itemType = itemType;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        FoodProduct.counter = counter;
    }

    public boolean validateItemType(){
        //only accept E and C
        if(getItemType()=='E'||getItemType()=='C')
                return true;
        else
            return false;

    }



}



