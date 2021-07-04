import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Galaxy {

    private String galaxyName;
    protected HashSet<Planet> planets;

    public Galaxy(String galaxyName) {
        this.galaxyName = galaxyName;
        planets=new HashSet<>();
    }

    public String getGalaxyName() {
        return galaxyName;
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "galaxyName='" + galaxyName + '\'' +
                '}';
    }

    public void setGalaxyName(String galaxyName) {
        this.galaxyName = galaxyName;
    }

    protected void behaviour()
    {
        System.out.println(" I am "+ this.toString() + " and my behaivour is extremely good");
        for (Planet planet:planets) {
            System.out.println(" I am planet "+ planet.toString()+" of "+this.toString());
        }
    }

    protected boolean addPlanet(Planet p)
    {
        return this.planets.add(p);
    }

    protected Planet getPlanet(String planetName)
    {
        for (Planet planet:planets)
        {
            if(planet.getName()==planetName) return planet;
        }
        return null;
    }

    protected Planet getPlanet(Planet p)
    {
       if(planets.contains(p)) return p;
       return null;
    }

    protected boolean delete(Planet p)
    {
        return planets.remove(p);
    }

    protected boolean delete (String planetName){
        Iterator itr = planets.iterator();

        while (itr.hasNext())
        {
           Planet p=(Planet)itr.next();
           if(p.getName()==planetName)
                itr.remove();
                return true;
        }
        return false;
    }

}
