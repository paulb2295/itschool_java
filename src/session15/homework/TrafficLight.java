package session15.homework;

public enum TrafficLight {
    RED("STOP", 30),
    YELLOW("CAUTION", 5),
    GREEN("GO", 45);

    private final String indication;
    private final int duration;

    TrafficLight(String indication, int duration) {
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

class TrafficLightSimulator {
    public static void main(String[] args) throws InterruptedException {
        int run = 0;
        while (run < 10) {
            System.out.println("RED: " + TrafficLight.RED.getIndication());
            Thread.sleep(TrafficLight.RED.getDuration() * 1000L);
            System.out.println("YELLOW: " + TrafficLight.YELLOW.getIndication());
            Thread.sleep(TrafficLight.YELLOW.getDuration() * 1000L);
            System.out.println("GREEN: " + TrafficLight.GREEN.getIndication());
            Thread.sleep(TrafficLight.GREEN.getDuration() * 1000L);
            run++;
        }
    }
}
