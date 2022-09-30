package team.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import team.RequestApplication;
import team.domain.ServiceCancelled;
import team.domain.ServiceRequested;

@Entity
@Table(name = "Request_table")
@Data
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String symtom;

    private String productId;

    private String customerName;

    private String phoneNumber;

    private Date date;

    @PostPersist
    public void onPostPersist() {
        ServiceRequested serviceRequested = new ServiceRequested(this);
        serviceRequested.publishAfterCommit();

        ServiceCancelled serviceCancelled = new ServiceCancelled(this);
        serviceCancelled.publishAfterCommit();
    }

    public static RequestRepository repository() {
        RequestRepository requestRepository = RequestApplication.applicationContext.getBean(
            RequestRepository.class
        );
        return requestRepository;
    }
}
