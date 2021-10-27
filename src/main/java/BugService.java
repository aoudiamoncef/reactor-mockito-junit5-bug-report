import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BugService {

    private final BugRepository repository;

    public BugService(final BugRepository repository) {
        this.repository = repository;
    }

    public Flux<String> findAll() {
        return this.repository.findAll();
    }

}
