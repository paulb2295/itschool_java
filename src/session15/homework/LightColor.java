package session15.homework;

public enum LightColor {

    RED("STOP", 30),
    YELLOW("CAUTION", 5),
    GREEN("GO", 45);

    private final String indication;
    private final int duration;

    LightColor(String indication, int duration) {
        this.indication = indication;
        this.duration = duration;
    }

    public String getIndication() {
        return indication;
    }

    public int getDuration() {
        return duration;
    }
}

class TestEnum {

    public static void main(String[] args) {

        System.out.println("Red means: " + LightColor.RED.getIndication() + " for " + LightColor.RED.getDuration() + " seconds");
        System.out.println("Yellow means: " + LightColor.YELLOW.getIndication() + " for " + LightColor.YELLOW.getDuration() + " seconds");
        System.out.println("Green means: " + LightColor.GREEN.getIndication() + " for " + LightColor.GREEN.getDuration() + " seconds");
    }
}
