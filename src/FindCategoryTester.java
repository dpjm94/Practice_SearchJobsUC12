/**
 * Created by donalmaher on 23/11/2016.
 */
public class FindCategoryTester {

    public static void main(String args[]){

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        //Customer looking for Accounting in Dublin, only parttime job
        Job whatCustomerWant = new Job("01","Accounting","Dublin","PartTime");

        Job job = inventory.search(whatCustomerWant);
        if(job != null){
            System.out.println(" Customer, You might like these job in the following: " +
            job.getCategory() + " in " + job.getLocation() + ". " +
            " You must be " + job.getEmployType());

        }
        else{
            System.out.println("Sorry Customer, there is no matching job what you looking for");
        }
    }

    private static void initializeInventory(Inventory inventory) {

       inventory.addJob("01","Accounting","Dublin","PartTime");
    }


}
