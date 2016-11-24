/**
 * Created by donalmaher on 23/11/2016.
 */
public class Job {

    private String job_id;
    private Category category;
    private Location location;
    private EmployType employType;


    public Job(String job_id, Category category, Location location, EmployType employType) {
        this.job_id = job_id;
        this.category = category;
        this.location = location;
        this.employType = employType;
    }


    public String getJob_id() {
        return job_id;
    }


    public Category getCategory() {
        return category;
    }

    public Location getLocation() {
        return location;
    }

    public EmployType getEmployType() {
        return employType;
    }
}
