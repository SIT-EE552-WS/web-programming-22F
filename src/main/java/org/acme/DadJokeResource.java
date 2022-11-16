package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/joke")
public class DadJokeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DadJoke getJoke(){
        return new DadJoke(
                "1234",
                "At the boxing match, the dad got into the popcorn line and the line for hot dogs, but he wanted to stay out of the punchline.",
                200
        );
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public DadJoke uploadJoke(DadJoke newJoke){
        return newJoke;
    }

}
