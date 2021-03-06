package backendApplication.model.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Country")
public class Country{
    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="country_sequence")
    //@SequenceGenerator(name="country_sequence", sequenceName="country_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true)
    @NotNull
    private String name;

    @OneToOne
    @NotNull
    private Continent continent;

    @OneToMany
    private List<City> cities;

    public Country() {
    }

    public Country(String name, Continent continent){
        this.name = name;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
