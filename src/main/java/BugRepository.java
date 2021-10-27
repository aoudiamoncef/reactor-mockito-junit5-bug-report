import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class BugRepository {

    public Flux<String> findAll() {
        return Flux.empty();
    }

}
