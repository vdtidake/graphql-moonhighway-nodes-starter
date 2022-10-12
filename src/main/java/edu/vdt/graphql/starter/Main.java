package edu.vdt.graphql.starter;

import edu.vdt.graphql.model.Status;
import edu.vdt.graphql.mutation.TrailStatusMutation;
import edu.vdt.graphql.query.AllTrails;
import io.aexp.nodes.graphql.*;

import java.net.MalformedURLException;

public class Main {

    private static final String URL = "https://snowtooth.moonhighway.com/graphql/";

    GraphQLTemplate graphQLTemplate = new GraphQLTemplate();

    public static void main(String[] args) throws MalformedURLException{
        Main main = new Main();
        main.fetchTrails();
        main.updateTrailStatus();
    }

    private void fetchTrails() throws MalformedURLException {
        GraphQLRequestEntity requestEntity = GraphQLRequestEntity.Builder()
                .url(URL)
                .request(AllTrails.class)
                .build();
        GraphQLResponseEntity<AllTrails> responseEntity = graphQLTemplate.query(requestEntity, AllTrails.class);
        System.out.println(responseEntity.getResponse());
    }

    private void updateTrailStatus() throws MalformedURLException{
        GraphQLRequestEntity requestEntity = GraphQLRequestEntity.Builder()
                .url(URL)
                .arguments(new Arguments("setTrailStatus", new Argument<>("id", "blue-bird"), new Argument<>("status", Status.CLOSED)))
                .request(TrailStatusMutation.class)
                .build();

        GraphQLResponseEntity<TrailStatusMutation> responseEntity = graphQLTemplate.mutate(requestEntity, TrailStatusMutation.class);
        System.out.println(responseEntity.getResponse());
    }
}