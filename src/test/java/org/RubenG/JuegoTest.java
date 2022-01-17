package org.RubenG;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {
    Juego juego = new Juego("Minecraft", "PC", 200);

    @Test
    void getTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("Minecraft", juego.getTitulo()),
                () -> Assertions.assertEquals("PC", juego.getPlataforma()),
                () -> Assertions.assertEquals(200.00, juego.getPrecio())
        );
    }

    @Test
    void setTest() {
    }


    @Test
    void testToString() {
        Assertions.assertEquals("Juego: " + "Titulo: " + "Minecraft" + '\'' + ", Plataforma= " + "PC" + '\''
                                + ", Precio= " + "200.0" + "€", "Juego: " + "Titulo: " + juego.getTitulo() + '\'' + ", Plataforma= "
                                + juego.getPlataforma() + '\'' + ", Precio= " + juego.getPrecio() + "€");
    }
}