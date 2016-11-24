import java.util.Iterator;
import java.util.List;

/**
 * Created by donalmaher on 23/11/2016.
 */
public class FindCategoryTester {

    public static void main(String args[]){

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        //Customer looking for Accounting
        Job whatCustomerWant = new Job("01",Category.ACCOUNTING,Location.DUBLIN,EmployType.PARTTIME);


        List matchingJobs = inventory.search(whatCustomerWant);

        if(matchingJobs.isEmpty()){

            System.out.println(" Customer, You might like these job in the following: ");
            for(Iterator i = matchingJobs.iterator(); i.hasNext();){
                Job job = (Job)i.next();
                System.out.println(" We have a " +
                job.getCategory() + " in " + job.getLocation() + "\n" +
                " You must be " + job.getEmployType());
            }
        }
        else{
            System.out.println("Sorry Customer, there is no matching job what you looking for");
        }
    }

    private static void initializeInventory(Inventory inventory) {

       inventory.addJob("",Category.ACCOUNTING,Location.DUBLIN,EmployType.PARTTIME);
    }


}
