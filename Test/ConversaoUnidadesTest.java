import com.company.ConversaoUnidades;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversaoUnidadesTest {
    @Test
    public void testTemperatura(){
        double Celsius = 100;
        double Fahrenheit = ConversaoUnidades.temperatura(Celsius);
        assertEquals(212, Fahrenheit,0.01);
    }
    @Test
    public void testVelocidade(){
        double MetrosPorSegundo = 2;
        double KmPorHora = ConversaoUnidades.velocidade(MetrosPorSegundo);
        assertEquals(7.2, KmPorHora,0.01);
    }
    @Test
    public void testDistacia(){
        double Km = 2;
        double Centimetros = ConversaoUnidades.distancia(Km);
        assertEquals(200000, Centimetros,0.01);
    }
    @Test
    public void testTempo(){
        double Hora = 1.5;
        double Segundos = ConversaoUnidades.tempo(Hora);
        assertEquals(5400, Segundos,0.01);
    }
}