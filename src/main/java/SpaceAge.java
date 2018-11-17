import java.util.HashMap;
import java.util.Map;

class SpaceAge {

    private final double seconds;
    private static final double EARTH_SECONDS = 31557600;
    private static final Map<String, Double> PLANET_FACTORS;
    static
    {
        PLANET_FACTORS = new HashMap<>();
        PLANET_FACTORS.put("Earth", 1.0);
        PLANET_FACTORS.put("Mercury", 0.2408467);
        PLANET_FACTORS.put("Venus", 0.61519726);
        PLANET_FACTORS.put("Mars", 1.8808158);
        PLANET_FACTORS.put("Jupiter", 11.862615);
        PLANET_FACTORS.put("Saturn", 29.447498);
        PLANET_FACTORS.put("Uranus", 84.016846);
        PLANET_FACTORS.put("Neptune", 164.79132);
    }

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    private double onPlanet(String planet){
        double factor = PLANET_FACTORS.get(planet);
        double planet_seconds = EARTH_SECONDS * factor;
        return this.getSeconds() / planet_seconds;
    }

    double onEarth() {
        return onPlanet("Earth");
    }

    double onMercury() {
        return onPlanet("Mercury");
    }

    double onVenus() {
        return onPlanet("Venus");
    }

    double onMars() {
        return onPlanet("Mars");
    }

    double onJupiter() {
        return onPlanet("Jupiter");
    }

    double onSaturn() {
        return onPlanet("Saturn");
    }

    double onUranus() {
        return onPlanet("Uranus");
    }

    double onNeptune() {
        return onPlanet("Neptune");
    }

}
