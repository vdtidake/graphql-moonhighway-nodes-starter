package edu.vdt.graphql.query;

import edu.vdt.graphql.model.Trail;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

import java.util.List;



public class AllTrails {
    @GraphQLProperty(name="allTrails")
    List<Trail> trails;

    public List<Trail> getTrails() {
        return trails;
    }

    public void setTrails(List<Trail> trails) {
        this.trails = trails;
    }

    @Override
    public String toString() {
        return "AllTrails{" +
                "trails=" + trails +
                '}';
    }
}
