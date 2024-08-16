package sprproj;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SUBSCRIBER")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subscriber_seq_gen")
    @SequenceGenerator(name = "subscriber_seq_gen", sequenceName = "subscriber_seq", allocationSize = 1)
    @Column(name = "SUBSC_ID")
    public Long subscId;

    @Column(name = "SUBSC_NAME")
    public String subscName;

    @Column(name = "SUBSC_SURNAME")
    public String subscSurname;

    @Column(name = "MSISDN")
    public String msisdn;

    @Column(name = "TARIFF_ID")
    public Long tariffId;

    @Column(name = "START_DATE")
    public Date startDate;

    public Long getSubscId() {return subscId;}
    public void setSubscId(Long subscId){this.subscId=subscId;}

    public String getSubscName(){return subscName;}
    public void setSubscName(String subscName) {
        this.subscName = subscName;
    }

    public String getMsisdn(){return msisdn;}
    public void setMsisdn(String msisdn){this.msisdn=msisdn;}

    public String getSubscSurname(){return subscSurname;}
    public void setSubscSurname(String subscSurname){this.subscSurname=subscSurname;}

    public Long getTariffId(){return tariffId;}
    public void setTariffId(Long tariffId) {
        this.tariffId = tariffId;
    }

    public Date getStartDate() {return startDate;}
    public void setStartDate(Date startDate){this.startDate=startDate;}
}

