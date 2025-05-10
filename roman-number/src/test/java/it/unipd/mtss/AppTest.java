package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void testAppInstanceCreation() {
        // Creo un'istanza della classe App
        App app = new App();
        
        // Verifico che l'istanza sia stata creata correttamente
        assertNotNull("L'istanza di App non dovrebbe essere null", app);
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
