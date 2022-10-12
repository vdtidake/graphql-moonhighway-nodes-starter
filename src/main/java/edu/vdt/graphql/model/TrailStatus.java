package edu.vdt.graphql.model;

import edu.vdt.graphql.model.Status;

public class TrailStatus {
    private String id;
    private Status status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TrailStatus{" +
                "id='" + id + '\'' +
                ", status=" + status +
                '}';
    }
}
