package qdg;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceAireTest {

    List<Iforme> formes = Arrays.asList(new Cercle(2.0),new Rectange(2,4));

    @org.junit.jupiter.api.Test
    void aire() {
        assertEquals(
                20.56, CalculatriceAire.aire(formes),0.01
        );
    }
}