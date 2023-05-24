package demo.app;

import demo.app.qualifier.MyApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
public class MyApplicationTest {

    @Inject
    private MyApplication myApplication;

    @Test
    void shouldLogToFile(){
       myApplication.process();
    }
}
