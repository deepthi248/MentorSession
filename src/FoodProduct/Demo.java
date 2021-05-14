package FoodProduct;


public class Demo {

        public static void main (String[] args){

            CookingProduct cp1 = new CookingProduct("F1001","Rice",'E',51.0f,
                    10, "medium","Paper",10);
            double bill = cp1.calculateBill();
            System.out.print(bill);
        }


}
