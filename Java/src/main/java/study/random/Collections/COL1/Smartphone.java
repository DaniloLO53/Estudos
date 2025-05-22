package study.random.Collections.COL1;

public class Smartphone {
    private String serialNumber;
    private String model;
    private String memory;

    public Smartphone(String serialNumber, String model, String memory) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.memory = memory;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this == object) return true;
        if (object.getClass() != this.getClass()) return false;
        return this.serialNumber != null && ((Smartphone) object).serialNumber.equals(this.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
