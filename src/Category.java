public enum Category {

    ACCOUNTING, ARCHITECTURE, ARTS, ENTERTAINMENT, CONSTRUCTION,
    EDUCATION, ENGINEERING, BANKING, HOTEL, HN, INSURANCE,
    IT, MARKETING, SALES, SECURITY, SCIENCE, SPORT, TECHNICAL;

    public String toString() {
        switch(this) {
            case ACCOUNTING:   return "Accounting";
            case ARCHITECTURE:   return "Architecture";
            case ARTS:   return "Arts";
            case ENTERTAINMENT: return "Entertainment";
            case CONSTRUCTION:    return "Construction";
            case EDUCATION:     return "Education";
            case ENGINEERING:    return "Engineering";
            case BANKING :     return "Engineering";
            case HOTEL :     return "Hotel";
            case HN:     return "HN";
            case INSURANCE :     return "Insurance";
            case MARKETING :     return "Marketing";
            case SALES :     return "Sales";
            case SECURITY :     return "Security";
            case SCIENCE :     return "Science";
            case SPORT :     return "Sport";
            case TECHNICAL :     return "Technical";
            case IT: return "IT";
            default:       return "Unsecified";

        }
    }


}