package mk.ukim.finki.mk.lab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String capacity;
    private String description;
    @OneToMany(mappedBy = "location", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Event> events;

    public Location(String name, String address, String capacity, String description) {
//        this.id = (long) (Math.random() * 1000);
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity='" + capacity + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}