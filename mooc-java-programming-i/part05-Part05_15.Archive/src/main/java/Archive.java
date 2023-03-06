public class Archive {
    
    private String identifier;
    private String title;

    public String getIdentifier() {
        return identifier;
    }

    public String getTitle() {
        return title;
    }

    public Archive(String identifier, String title) {
        this.identifier = identifier;
        this.title = title;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        return (this.identifier.equals(comparedArchive.identifier));
    }

}
