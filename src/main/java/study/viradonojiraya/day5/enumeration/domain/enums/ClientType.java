package study.viradonojiraya.day5.enumeration.domain.enums;

public enum ClientType {
    // we can associate values to each constant
    NONE {
        @Override
        public double evaluateDiscount2(double value) {
            return super.evaluateDiscount1(value);
        }
    },
    NO_UUID(1) {
        @Override
        public double evaluateDiscount2(double value) {
            return super.evaluateDiscount1(value);
        }
    },
    PF(2, "ABCD") {
        @Override
        public double evaluateDiscount2(double value) {
            return value * 0.1;
        }
    },
    PJ(3, "BCDE") {
        @Override
        public double evaluateDiscount2(double value) {
            return value * 0.05;
        }
    };

    private int id; // it initiates with the default value 0
    public final String UUID;

    ClientType() {
        this.UUID = "NONE";
    }

    ClientType(int id) {
        this.id = id;
        this.UUID = "NONE";
    }

    ClientType(int id, String uuid) {
        this.id = id;
        this.UUID = uuid;
    }

    public void getInfo() {
        System.out.printf("ID: %d | UUID: %s | Type: %s\n", this.id, this.UUID, this.name());
    }

    // there are two ways to overwrite methods in enums: with abstract methods and with if-else
    public abstract double evaluateDiscount2(double value);

    private double evaluateDiscount1(double value) {
        if (this.name().equals("PJ")) {
            return 0.05 * value;
        } else if (this.name().equals("PF")) {
            return 0.1 * value;
        } else {
            return 0;
        }
    }
}
