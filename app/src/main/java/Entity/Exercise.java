package Entity;

public class Exercise {

    private int id;
    private  String name;
    private String type;
    private int reps;
    private String repType;
    private String info;
    private String videoLink;
    private int userID;

    public Exercise() {

    }

    public Exercise(int id, String name, String type,
                    int reps, String repType, String info, String videoLink) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.reps = reps;
        this.repType = repType;
        this.info = info;
        this.userID = userID;
        this.videoLink = videoLink;
    }

    public String toString() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public String getRepType() {
        return repType;
    }

    public void setRepType(String repType) {
        this.repType = repType;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
