
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class DiaDeTrabalhoTest {

    Hora hora;
    LocalDate data = LocalDate.of(2006,2,4);
    DiaDeTrabalho dia;
    Hora hora2;

    @BeforeEach
    public void setUp(){
        //arrange
        hora = new Hora(10, 11, 12);
        hora2 = new Hora(11, 12, 13);
        dia = new DiaDeTrabalho(hora, ETrabalho.CLT, data);
    }

    @Test
        //act
        public void registrandoSaida(){
            boolean registrado = dia.registrarSaida(hora2);
            //assert
            assertTrue(registrado);
        }

    @Test
        //act
        public void registrandoSaida2(){
            boolean registrado = dia.registrarSaida(hora2);
            //assert
            assertEquals(registrado, true);
        }
    @Test
        public void toStringCorreto(){
            boolean registrado = dia.registrarSaida(hora2);
            dia.saldoDeMinutos();
            IO.println(dia.toString());
            //assert
            assertEquals(registrado, true);
        }
    }
