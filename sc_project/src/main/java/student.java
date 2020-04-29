import java.io.Serializable;

public class student implements Serializable {
    private int stu_id;
    private String stu_nam;
    private String stu_sex;

    @Override
    public String toString() {
        return "student{" +
                "stu_id=" + stu_id +
                ", stu_nam='" + stu_nam + '\'' +
                ", stu_sex='" + stu_sex + '\'' +
                '}';
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_nam() {
        return stu_nam;
    }

    public void setStu_nam(String stu_nam) {
        this.stu_nam = stu_nam;
    }

    public String getStu_sex() {
        return stu_sex;
    }

    public void setStu_sex(String stu_sex) {
        this.stu_sex = stu_sex;
    }
}
