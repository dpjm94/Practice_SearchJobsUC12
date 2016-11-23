import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by donalmaher on 23/11/2016.
 */
public class Inventory {

    private List jobs;

        public Inventory() {
            jobs = new LinkedList();
        }


        public void addJob(String job_id,String category, String location, String employType){
            Job job = new Job(job_id, category,location,employType);
            jobs.add(job);
        }


        public Job getJob(String job_id){
            for(Iterator i = jobs.iterator(); i.hasNext();){
                Job job = (Job)i.next();
                if(job.getJob_id().equals(job_id)){
                    return job;
                }
            }
            return null;
        }

        public Job search(Job searchJob){
            for(Iterator i = jobs.iterator(); i.hasNext();){
                Job job = (Job)i.next();

                String category = searchJob.getCategory();
                if((category != null) && (!category.equals("")) &&
                        (!category.equalsIgnoreCase(job.getCategory())))
                    continue;

                String location = searchJob.getLocation();
                if((location != null) && (!location.equals("")) &&
                        (!location.equals(job.getLocation())))
                    continue;

                String employType = searchJob.getEmployType();
                if((employType != null) && (!employType.equals("")) &&
                        (!category.equals(job.getEmployType())))
                    continue;
            }
            return null;
        }
    }
