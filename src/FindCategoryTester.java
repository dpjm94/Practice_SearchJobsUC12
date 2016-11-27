import java.util.Iterator;
import java.util.List;

/**
 * Created by donalmaher on 24/11/2016.
 */
public class FindCategoryTester {


    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        JobSpec WhatUserWant = new JobSpec(Category.ACCOUNTING, Location.ANTRIM, EmployType.PARTTIME);

        List matchingJobs = inventory.search(WhatUserWant);
        if (!matchingJobs.isEmpty()) {
            System.out.println(" Customer, you might like: ");
            for(Iterator i = matchingJobs.iterator(); i.hasNext();){
                Job job = (Job)i.next();

                JobSpec spec = job.getJobSpec();
                System.out.println(" We have a "
                        + spec.getCategory() + " in " +
                        spec.getLocation() + " And they want employ type: " +
                        spec.getEmployType() + "\n ----------------------");
            }
        } else {
            System.out.println("Sorry, Customer, there is no matching job description you want.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addJob("01",
                new JobSpec(Category.ACCOUNTING,Location.ANTRIM, EmployType.PARTTIME));
        inventory.addJob("02",
                new JobSpec(Category.ACCOUNTING,Location.ANTRIM, EmployType.PARTTIME));
        inventory.addJob("03",
                new JobSpec(Category.MARKETING,Location.KERRY, EmployType.PERMANENT));
        inventory.addJob("04",
                new JobSpec(Category.ACCOUNTING,Location.TIPPERARY, EmployType.PERMANENT));
        inventory.addJob("05",
                new JobSpec(Category.ACCOUNTING,Location.DUBLIN, EmployType.PERMANENT));
        inventory.addJob("06",
                new JobSpec(Category.ARTS,Location.DUBLIN, EmployType.PERMANENT));
        inventory.addJob("07",
                new JobSpec(Category.ACCOUNTING,Location.KERRY, EmployType.PERMANENT));
        inventory.addJob("08",
                new JobSpec(Category.ARCHITECTURE,Location.DERRY, EmployType.PERMANENT));

    }
}
