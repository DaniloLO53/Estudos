package study.viradonojiraya.day5.abstractClasses.domain.enums;

public enum Bonus {
    NONE {
        @Override
        public double evaluateFixedValue() {
            return 0;
        }
    },
    MANAGER(0.1, BonusType.MERIT) {
        @Override
        public double evaluateFixedValue() {
            return 1;
        }
    },
    DEVELOPER(0.05, BonusType.TIME) {
        @Override
        public double evaluateFixedValue() {
            return 2;
        }
    };

    public final double VALUE;
    private BonusType bonusType;

    Bonus() {
        this.VALUE = 0;
    }

    Bonus(double value, BonusType bonusType) {
        this.VALUE = value;
        this.bonusType = bonusType;
    }

    public abstract double evaluateFixedValue();

    public static Bonus getBonusByBonusType(String bonusType) {
        for (Bonus bonus: values()){
            System.out.println("Values()[0]:" + values()[0]);
            System.out.println("Type:" + bonus.getBonusType());
            if (bonus.getBonusType().equals(bonusType)) {
                return bonus;
            }
        }
        return null;
    }

    public BonusType getBonusType() {
        return bonusType;
    }
}
