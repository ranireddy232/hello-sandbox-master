package DataResource;

import Producer.DataProducer;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/datasend")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DataResource {
    @Inject
    DataProducer producer;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response send(String message){
        producer.sendKafkaData(message);
        return Response.accepted().build();
    }
}
