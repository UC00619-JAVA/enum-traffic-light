public class TrafficLight {

    private LightColor color;

    public TrafficLight() {
        color = LightColor.RED;
    }

    public LightColor getColor() {
        return color;
    }

    public void change() {
        switch (color) {
            case RED:
                color = LightColor.GREEN;
                break;
            case GREEN:
                color = LightColor.YELLOW;
                break;
            case YELLOW:
                color = LightColor.RED;
                break;
        }
    }

    public String getAction() {
        return switch (color) {
            case RED -> "Stop";
            case YELLOW -> "Get ready to stop";
            default -> "Go";
        };
    }
}
