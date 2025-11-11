package edu.hs.schedule.model;

public class User {
    private int id;
    private String name;
    private String gender;
    private String birth;
    private String nickname;
    private String sleepTime;
    private String wakeTime;

    public User() {}

    public User(int id, String name, String gender, String birth, String nickname, String sleepTime, String wakeTime) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.nickname = nickname;
        this.sleepTime = sleepTime;
        this.wakeTime = wakeTime;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getBirth() { return birth; }
    public void setBirth(String birth) { this.birth = birth; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getSleepTime() { return sleepTime; }
    public void setSleepTime(String sleepTime) { this.sleepTime = sleepTime; }

    public String getWakeTime() { return wakeTime; }
    public void setWakeTime(String wakeTime) { this.wakeTime = wakeTime; }
}
