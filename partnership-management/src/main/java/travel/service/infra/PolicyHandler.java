package travel.service.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import travel.service.config.kafka.KafkaProcessor;
import travel.service.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PartnershipRepository partnershipRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DestinationBooked'"
    )
    public void wheneverDestinationBooked_BookingPolicy(
        @Payload DestinationBooked destinationBooked
    ) {
        DestinationBooked event = destinationBooked;
        System.out.println(
            "\n\n##### listener BookingPolicy : " + destinationBooked + "\n\n"
        );
        // Sample Logic //

    }
}
