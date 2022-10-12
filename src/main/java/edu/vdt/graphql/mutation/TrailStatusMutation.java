package edu.vdt.graphql.mutation;

import edu.vdt.graphql.model.TrailStatus;
import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLArguments;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

public class TrailStatusMutation {
    @GraphQLProperty(name="setTrailStatus")
    @GraphQLArguments({
            @GraphQLArgument(name="id"),
            @GraphQLArgument(name="status")
    })
    private TrailStatus setTrailStatus;

    public TrailStatus getSetTrailStatus() {
        return setTrailStatus;
    }

    public void setSetTrailStatus(TrailStatus setTrailStatus) {
        this.setTrailStatus = setTrailStatus;
    }

    @Override
    public String toString() {
        return "TrailStatusMutation{" +
                "setTrailStatus=" + setTrailStatus +
                '}';
    }
}
