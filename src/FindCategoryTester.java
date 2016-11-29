import java.util.Iterator;
import java.util.List;

/**
 * Created by donalmaher on 24/11/2016.
 */
public class FindCategoryTester {


    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        CategoryJobSpec WhatUserWant = new CategoryJobSpec(Category.MARKETING,Location.KERRY, EmployType.PERMANENT);

        List matchingCategorys = inventory.search(WhatUserWant);
        if (!matchingCategorys.isEmpty()) {
            System.out.println(" Customer, you might like: ");
            for(Iterator i = matchingCategorys.iterator(); i.hasNext();){
                Job job = (Job)i.next();

                JobSpec spec = job.getSpec();
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
                new CategoryJobSpec(Category.ACCOUNTING,Location.ANTRIM, EmployType.PARTTIME));
        inventory.addJob("02",
                new CategoryJobSpec(Category.ACCOUNTING,Location.ANTRIM, EmployType.PARTTIME));
        inventory.addJob("03",
                new CategoryJobSpec(Category.MARKETING,Location.KERRY, EmployType.PERMANENT));
        inventory.addJob("04",
                new CategoryJobSpec(Category.ACCOUNTING,Location.TIPPERARY, EmployType.PERMANENT));
        inventory.addJob("05",
                new CategoryJobSpec(Category.ACCOUNTING,Location.DUBLIN, EmployType.PERMANENT));
        inventory.addJob("06",
                new CategoryJobSpec(Category.ARTS,Location.DUBLIN, EmployType.PERMANENT));
        inventory.addJob("07",
                new CategoryJobSpec(Category.ACCOUNTING,Location.KERRY, EmployType.PERMANENT));
        inventory.addJob("08",
                new CategoryJobSpec(Category.ARCHITECTURE,Location.DERRY, EmployType.PERMANENT));

    }
}
