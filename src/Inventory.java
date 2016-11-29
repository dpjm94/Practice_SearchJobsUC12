import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by donalmaher on 23/11/2016.
 */
public class Inventory {

    private List inventory;

        public Inventory() {
            inventory = new LinkedList();
        }


        public void addJob(String job_id,JobSpec spec){
            Job job = new Job(job_id, spec);
            inventory.add(job);
        }


        public Job getJob(String job_id){
            for(Iterator i = inventory.iterator(); i.hasNext();){
                Job job = (Job)i.next();
                if(job.getJob_id().equals(job_id)){
                    return job;
                }
            }
            return null;
        }

        //search category
        public List search(JobSpec searchSpec){
            List matchingJobs = new LinkedList();
            for(Iterator i = inventory.iterator(); i.hasNext();){
                Job job = (Job) i.next();
                if(job.getSpec().matches(searchSpec))
                matchingJobs.add(job);
            }
            return matchingJobs;
        }
    }
