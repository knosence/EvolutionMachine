package hello;

public class CoinManager {

    private int nickel = 30;
    private int dime = 30;
    private int quarter = 30;
    private int customerNickel = 0;
    private int customerDime = 0;
    private int customerQuarter = 0;

    //Noelle & Toby need a way to retrieve the total coin count of the MACHINE (getters)

    public void addCustomerCoins(String coin){
        if(coin.equals("quarter")){
            customerQuarter++;
        }else if(coin.equals("dime")){
            customerDime++;
        }else {
            customerNickel++;
        }
    }

    public double customerTotalInputAmount(){
        double customerQuarterValue = customerQuarter * 0.25;
        double customerDimeValue = customerDime * 0.10;
        double customerNickelValue = customerNickel * 0.05;

        return customerDimeValue + customerNickelValue + customerQuarterValue;
    }

    public boolean hasEnoughForProduct(Product product){
        boolean confirmed = false;

        if (customerTotalInputAmount() >= product.retailPrice){
             confirmed = true;
        }

        return confirmed;
    }

    public void displayCustomerTotal(){

        System.out.println(customerTotalInputAmount());
    }

    public String addCustomerCoinsToCM(){
        nickel += customerNickel;
        dime += customerDime;
        quarter += customerQuarter;

        return (nickel+ " " +dime+ " " +quarter);
    }


}
