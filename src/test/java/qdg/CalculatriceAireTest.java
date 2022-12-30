package qdg;

import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatriceAireTest {

    List<Iforme> formes = Arrays.asList(new Cercle(2.0),new Rectange(2,4));
    CalculatriceAire calculatriceAire = new CalculatriceAire();

    @org.junit.jupiter.api.Test
    void aire() {
        assertEquals(
                20.56, CalculatriceAire.aire(formes),0.01
        );
    }

    @org.junit.jupiter.api.Test
    void testAire(){
        Iforme carre = Mockito.mock(Iforme.class);
        when(carre.aire()).thenReturn(4.0);

        List<Iforme> formes= Arrays.asList(new Cercle(2.0),new Rectange(2,4),carre);
        assertEquals(24.56,calculatriceAire.aire(formes),0.01);
        verify(carre,times(1)).aire();


    }

}