package sample;

import lombok.Data;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class MMELog {

    @Id
    private String id;

    private DateTime beginTime;
//    private DateTime endTime;

    private String imsi;
    private String msisdn;
    private String imei;

//    private String enbId;
//
//    private String mmeUeS1apId;
//    private String eNBUeS1apId;
//
//    private String oldMmeUeS1apId;
//    private String oldEnbUeS1apId;

    private String newTempImsi;
    private String oldTempImsi;

}
