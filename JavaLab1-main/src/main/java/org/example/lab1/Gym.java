package org.example.lab1;

/**
 * Клас для представлення спортзали.
 */
public class Gym {
    private int gymId;
    private String name;
    private String address;
    private String schedule;

    public Gym(int gymId, String name, String address, String schedule) {
        this.gymId = gymId;
        this.name = name;
        this.address = address;
        this.schedule = schedule;
    }

    public int getGymId() {
        return gymId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "gymId=" + gymId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", schedule='" + schedule + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Gym gym = (Gym) obj;
        return gymId == gym.gymId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(gymId);
    }
}
