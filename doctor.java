public class doctor {
    private String id;
    private String name;//title
    private String degree;//author
    private String passoutyear;//publishedyear
    private String status;


    public doctor(String id, String name, String degree, String passoutyear, String status) {
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.passoutyear = passoutyear;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPassoutyear() {
        return passoutyear;
    }

    public void setPassoutyear(String passoutyear) {
        this.passoutyear = passoutyear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Degree='" + degree+ '\'' +
                ", In Service From='" + passoutyear + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

