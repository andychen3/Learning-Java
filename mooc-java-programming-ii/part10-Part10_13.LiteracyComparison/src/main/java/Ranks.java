public class Ranks {
    private String country;
    private String gender;
    private double literacyPercent;
    private int year;

    
    public Ranks(String country, String gender, int year, double literacyPercent) {
        this.country = country;
        this.gender = setGender(gender);
        this.literacyPercent = literacyPercent;
        this.year = year;
    }


    public String getCountry() {
        return country;
    }


    public String getGender() {
        return gender;
    }

    public String setGender(String gender) {
        String[] parts = gender.split(" ");
        return parts[0];

    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getCountry() + " (" + getYear() + "), " + getGender() + ", " + getLiteracyPercent();
    }

    
}
