package sprproj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InsertingController {
    @Autowired
    private Repository repository;

    @PostMapping("/saveSubscriber")
    public String saveSubscriber(
            @RequestParam("subscName") String subscName,
            @RequestParam("subscSurname") String subscSurname,
            @RequestParam("msisdn") String msisdn,
            @RequestParam("tariffId") Long tariffId) {

        Subscriber subscriber = new Subscriber();
        subscriber.setSubscName(subscName);
        subscriber.setSubscSurname(subscSurname);
        subscriber.setMsisdn(msisdn);
        subscriber.setTariffId(tariffId);

        repository.save(subscriber);

        return "ht";
    }

}
