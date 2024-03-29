package votation.bestproperty.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import java.util.Date;

@Document("votes")
@Data
@NoArgsConstructor
public class Vote {

    @Id
    private String id;
    private Date date;
    private String propertyId;
    private String userUid;

}
