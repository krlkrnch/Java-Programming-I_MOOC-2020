
public class Archive {

    private String name;
    private String identifier;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;

    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }
        Archive archive = (Archive) compared;

        if (this.identifier.equals(archive.identifier)) {
            //kui on võrdne, 
            return true;
    }
        return false;

}
}
