import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AlternativeSolutionServiceTest {

    @Mock
    BugRepository repository;

    @InjectMocks
    BugService service;

    @Nested
    class NestedClass {

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        void emptyFluxTest() {
            Mockito.when(repository.findAll())
                    .thenReturn(Flux.empty());

            service.findAll()
                    .as(StepVerifier::create)
                    .verifyComplete();
        }

    }
}
