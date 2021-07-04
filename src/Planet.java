import java.util.Objects;

public class Planet {

    private String planetName;

    public Planet(String name) {
        this.planetName = name;
    }

    public String getName() {
        return planetName;
    }

    public void setName(String name) {
        this.planetName = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet)) return false;
        Planet planet = (Planet) o;
        return getName().equals(planet.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + planetName + '\'' +
                '}';
    }
}
