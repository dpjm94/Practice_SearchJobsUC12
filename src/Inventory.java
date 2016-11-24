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


        public void addJob(String job_id,Category category, Location location, EmployType employType){
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

        //search category
        public List search(Job searchJob){
            List matchingJobs = new LinkedList();
            for(Iterator i = jobs.iterator(); i.hasNext();){
                Job job = (Job)i.next();

                Category category = searchJob.getCategory();
                if((category != null) && (!category.equals("")) &&
                        (!category.equals(job.getCategory())))
                    continue;
                matchingJobs.add(job);
            }
            return matchingJobs;
        }
    }
