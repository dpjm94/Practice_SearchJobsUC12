/**
 * Created by donalmaher on 27/11/2016.
 */
public class JobSpec {


        private Category category;
        private Location location;
        private EmployType employType;



        public JobSpec(Category category, Location location, EmployType employType) {
            this.category = category;
            this.location = location;
            this.employType = employType;
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

        public boolean matches(JobSpec otherSpec){
            if(category!= otherSpec.category)
                return false;
            if(location!= otherSpec.location)
                return false;
            if(employType!= otherSpec.employType)
                return false;
            return true;
        }
    }
