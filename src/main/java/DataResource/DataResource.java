package DataResource;

import Producer.DataProducer;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
        System.out.println("message = " + message);
        return Response.accepted().build();
    }
}
