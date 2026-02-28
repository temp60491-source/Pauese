// RotationMode.java

public class RotationMode {
    private String mode;

    public RotationMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "RotationMode{" +
                "mode='" + mode + '\'' +
                '}';
    }
}