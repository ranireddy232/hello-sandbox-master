package Producer;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class DataProducer {

    @Inject
    @Channel("data-output")
    Emitter<String> emitter;

    public void sendKafkaData(String message){
        System.out.println("Received in Producer");
        emitter.send(message);
        emitter.send("health-check-bmw-confluent-cloud-health-check-69ff94f656-dxd4x-sandbox-67368499-0033-4775-88ec-413fb034a1fe");
        emitter.send("health-check-bmw-confluent-cloud-health-check-69ff94f656-dxd4x-sandbox-1-5b2355bc-47eb-42aa-a13e-f3ddaf716053");
        emitter.send("health-check-pen-test-bmw-confluent-cloud-health-check-959h75hn-otd-sandbox-fb993461-3231-48f2-bc6c-21d2c4fad877");
        System.out.println("Sending done");
    }
}
