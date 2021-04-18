package View;

public class Profile {
    private String nickName;
    private int age;
    private float weight;
    private int exerciseHours;
    private int exerciseMin;
    private boolean allowNotifications;
    private boolean allowTextNotifications;
    private boolean allowEmailNotifications;
    private String email;
    private String phoneNumber;
    private String carrier;

    public Profile(){
    }

    //setter methods
    public void setAge(int a) {
        age = a;
    }

    public void setNickName(String name) {
        nickName = name;
    }

    public void setWeight(float w) {
        weight = w;
    }

    public void setExcerciseHours(int eH) {
        exerciseHours = eH;
    }

    public void setExcerciseMinutes(int eM) {
        exerciseMin = eM;
    }

    public void setAllowNotifications(boolean n) {
        allowNotifications = n;
    }

    public void setTextNotifications(boolean n) {
        allowTextNotifications = n;
    }

    public void setEmailNotifications(boolean n) {
        allowEmailNotifications = n;
    }

    public void setEmail(String mail) {
        email = mail;
    }

    public void setPhoneNumber(String p) {
        phoneNumber = p;
    }

    public void setCarrier(String c) {
        carrier = c;
    }

    //getter methods
    public int getAge() {
        return age;
    }

    public String getNickName() {
        return nickName;
    }

    public float getWeight() {
        return weight;
    }

    public int getExcerciseHours() {
        return exerciseHours;
    }

    public int getExcerciseMinutes() {
        return exerciseMin;
    }

    public boolean getAllowNotifications() {
        return allowNotifications;
    }

    public boolean getAllowEmailNotifications() {
        return allowEmailNotifications;
    }

    public boolean getAllowTextNotifications() {
        return allowTextNotifications;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCarrier() {
        return carrier;
    }

}
