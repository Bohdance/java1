package org.example.lab1;

/**
 * Клас для представлення тренера в спортзалі.
 */
public class Trainer {
    private int trainerId;
    private String trainerName;
    private String address;
    private String contactInfo;
    private String trainingSchedule;
    private String specialization;
    private Gym gym; // Зв'язок з класом Gym

    public Trainer(int trainerId, String trainerName, String address, String contactInfo,
                   String trainingSchedule, String specialization, Gym gym) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.address = address;
        this.contactInfo = contactInfo;
        this.trainingSchedule = trainingSchedule;
        this.specialization = specialization;
        this.gym = gym;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getTrainingSchedule() {
        return trainingSchedule;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Gym getGym() {
        return gym; // Метод для отримання зв'язаного спортзалу
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", trainerName='" + trainerName + '\'' +
                ", address='" + address + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", trainingSchedule='" + trainingSchedule + '\'' +
                ", specialization='" + specialization + '\'' +
                ", gym=" + gym + // Додано вивід зв'язаного спортзалу
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trainer trainer = (Trainer) obj;
        return trainerId == trainer.trainerId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(trainerId);
    }
}
