import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class JobSpec {

    private final Map properties;

    public JobSpec(Map properties) {
        if (properties == null) {
            this.properties = new HashMap();
        } else {
            this.properties = new HashMap(properties);
        }
    }


    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map getProperties() {
        return properties;
    }


    public boolean matches(JobSpec otherSpec) {
        for (Iterator i = otherSpec.getProperties().keySet().iterator();
             i.hasNext(); ) {
            String propertyName = (String) i.next();
            if (!properties.get(propertyName).equals(
                    otherSpec.getProperty(propertyName))) {
                return false;
            }
        }
        return true;
    }
}







    /* private Category category;
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
        }*/

