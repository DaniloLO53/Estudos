package study.viradonojiraya._legacy.days.day5.review;

public class College {
    private String name;
    static private String[] specialities;

    static {
        String[] specialitiesArray = {"Engineering", "Medicine", "Law", "Pharmacy", "Mathematics", "Physics", "Arts"};
        specialities = new String[specialitiesArray.length];

        for (int i = 0; i < specialitiesArray.length; i++) {
            College.specialities[i] = specialitiesArray[i];
        }

        System.out.println("Primeira especialidade: " + College.specialities[0]);
    }

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String[] getSpecialities() {
        return specialities;
    }

    public static void setSpecialities(String[] specialities) {
        College.specialities = specialities;
    }
}
