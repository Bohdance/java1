package org.example.lab1;

/**
 * Клас для представлення клієнта спортзалу.
 */
public class Client {
    private int clientId;
    private String clientName;
    private String address;
    private String contactInfo;
    private String membershipDetails;
    private Trainer assignedTrainer; // Зв'язок з класом Trainer

    private Client(ClientBuilder builder) {
        this.clientId = builder.clientId;
        this.clientName = builder.clientName;
        this.address = builder.address;
        this.contactInfo = builder.contactInfo;
        this.membershipDetails = builder.membershipDetails;
        this.assignedTrainer = builder.assignedTrainer;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getMembershipDetails() {
        return membershipDetails;
    }

    public Trainer getAssignedTrainer() {
        return assignedTrainer; // Метод для отримання призначеного тренера
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", address='" + address + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", membershipDetails='" + membershipDetails + '\'' +
                ", assignedTrainer=" + assignedTrainer + // Додано вивід призначеного тренера
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Client client = (Client) obj;
        return clientId == client.clientId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(clientId);
    }

    /**
     * Патерн Builder для класу Client.
     */
    public static class ClientBuilder {
        private int clientId;
        private String clientName;
        private String address;
        private String contactInfo;
        private String membershipDetails;
        private Trainer assignedTrainer;

        public ClientBuilder setClientId(int clientId) {
            this.clientId = clientId;
            return this;
        }

        public ClientBuilder setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public ClientBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public ClientBuilder setContactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        public ClientBuilder setMembershipDetails(String membershipDetails) {
            this.membershipDetails = membershipDetails;
            return this;
        }

        public ClientBuilder setAssignedTrainer(Trainer assignedTrainer) {
            this.assignedTrainer = assignedTrainer;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
