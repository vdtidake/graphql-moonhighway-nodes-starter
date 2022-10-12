package edu.vdt.graphql.model;

public class Trail {
    private String id;
    private String name;
    private String status;
    private String difficulty;
    private boolean groomed;
    private boolean trees;
    private boolean night;

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
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isGroomed() {
        return groomed;
    }

    public void setGroomed(boolean groomed) {
        this.groomed = groomed;
    }

    public boolean isTrees() {
        return trees;
    }

    public void setTrees(boolean trees) {
        this.trees = trees;
    }

    public boolean isNight() {
        return night;
    }

    public void setNight(boolean night) {
        this.night = night;
    }

    @Override
    public String toString() {
        return "Trail{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", groomed=" + groomed +
                ", trees=" + trees +
                ", night=" + night +
                '}';
    }
}
