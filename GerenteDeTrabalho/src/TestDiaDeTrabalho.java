
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestDiaDeTrabalho {

    Hora hora;
    DiaDeTrabalho dia;

    @BeforeEach
    public void setUp(){
        //arrange
        hora = new Hora(10, 11, 12);
        dia = new DiaDeTrabalho(hora);
    }

    @Test
        //act
        public void registrandoSaida(){
            Hora hora2 = new Hora(11, 12, 13);
            boolean registrado = dia.registrarSaida(hora2);
            //assert
            assertTrue(registrado);
        }
    }
