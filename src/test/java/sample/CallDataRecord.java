package sample;

import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CallDataRecord {

    @Id
    private String id;

    private DateTime startTime;

    private DateTime endTime;

    private String msisdn;

    private String imei;

    private String imsi;




}
