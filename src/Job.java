/**
 * Created by donalmaher on 23/11/2016.
 */
public class Job {

    private String job_id;
    private String category;
    private String location;
    private String employType;


    public Job(String job_id, String category, String location, String employType) {
        this.job_id = job_id;
        this.category = category;
        this.location = location;
        this.employType = employType;
    }


    public String getJob_id() {
        return job_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmployType() {
        return employType;
    }

    public void setEmployType(String employType) {
        this.employType = employType;
    }
}
