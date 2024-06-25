package entities;

public class Instructor extends User {
    private String experties;

    public String getExperties() {
        return experties;
    }

    public void setExperties(String experties) {
        this.experties = experties;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "experties='" + experties + '\'' +
                '}';
    }

    public Instructor(int id, String name, String email, String experties) {
        super(id, name, email);
        this.experties = experties;



    }


}

