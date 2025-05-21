package study.random.OOP.OOP1;

public enum EnemyMode {
    NORMAL(1, 1) {
        @Override
        public float boost(float property) {
            return super.boost(property)*this.PROPERTY_MULTIPLIER;
        }
    },
    BERSERK(2, 1.5f) {
        @Override
        public float boost(float property) {
            return super.boost(property) * this.PROPERTY_MULTIPLIER;
        }
    };

    private int id;
    public final float PROPERTY_MULTIPLIER;

    EnemyMode(int id, float propertyMultiplier) {
        this.PROPERTY_MULTIPLIER = propertyMultiplier;
        this.id = id;
    }

    public float boost(float property) {
        return property;
    }

    public int getId() {
        return id;
    }
}
