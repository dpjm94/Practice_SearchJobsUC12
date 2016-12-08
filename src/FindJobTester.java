import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class FindJobTester {


    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map properties = new HashMap();
        //properties.put("category",Category.ACCOUNTING);
        //properties.put("employType",EmployType.PARTTIME);
        properties.put("location",Location.KERRY);
        JobSpec custSpec;
        custSpec = new JobSpec(properties);




        //CategoryJobSpec WhatUserWant = new CategoryJobSpec(Category.MARKETING,Location.KERRY, EmployType.PERMANENT);

        List matchingJobs = inventory.search(custSpec);
        if (!matchingJobs.isEmpty()) {
            System.out.println(" Customer, you might like: ");
            for(Iterator i = matchingJobs.iterator(); i.hasNext();){
                Job job = (Job)i.next();
                JobSpec spec = job.getSpec();
                System.out.println(" We have a "
                        + spec.getProperty("employType") +
                         " with the following jobs: ");
                for (Iterator j = spec.getProperties().keySet().iterator();
                     j.hasNext(); ) {
                    String propertyName = (String) j.next();
                    if (propertyName.equals("employType"))
                        continue;
                    System.out.println("    " + propertyName + ": " +
                            spec.getProperty(propertyName));
                }
            }
        } else {
            System.out.println("Sorry, Customer, there is no matching job description you want.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        Map properties = new HashMap();
        properties.put("category", Category.ACCOUNTING);
        properties.put("location", Location.KERRY);
        properties.put("employType", EmployType.PERMANENT);
        inventory.addJob("01", new JobSpec(properties));


        properties.put("location",Location.KERRY);
        properties.put("employType",EmployType.PARTTIME);
        inventory.addJob("02", new JobSpec(properties));

        properties.put("location",Location.DUBLIN);
        properties.put("employType",EmployType.PARTTIME);
        inventory.addJob("03", new JobSpec(properties));


        properties.put("location",Location.DERRY);
        properties.put("employType",EmployType.PARTTIME);
        inventory.addJob("04", new JobSpec(properties));


        properties.put("location",Location.KERRY);
        properties.put("employType",EmployType.JOBSHARE);
        inventory.addJob("05", new JobSpec(properties));

        properties.put("category",Category.BANKING);
        properties.put("location",Location.KERRY);
        properties.put("employType",EmployType.PARTTIME);
        inventory.addJob("06", new JobSpec(properties));
        inventory.addJob("07", new JobSpec(properties));


        properties.put("category",Category.BANKING);
        properties.put("employType",EmployType.PARTTIME);
        inventory.addJob("08", new JobSpec(properties));
    }
}
