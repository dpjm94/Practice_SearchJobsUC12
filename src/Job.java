/**
 * Created by donalmaher on 23/11/2016.
 */
public class Job {

    private String job_id;
    private JobSpec spec;


    public Job(String job_id, JobSpec spec) {
        this.job_id = job_id;
        this.spec = spec;
    }


    public String getJob_id() {
        return job_id;
    }

    public JobSpec getJobSpec(){
        return spec;
    }
}
