package org.RubenG;

public class CreadorJuego {
        public Juego createRandom() {
            String titulo = tituloRandom();
            String plataforma = plataformaRandom();
            float precio = precioRandom();
            Juego juego = new Juego(titulo, plataforma, precio);
            return juego;
        }

        /**
         * Genera un titulo aleatorio
         *
         * @return titulo aleatorio
         */
        private String tituloRandom() {
            String[] lista = {"Fortnite", "Lol", "Minecraft", "GTA V", "Valorant", "Black ops 2", "Dead by Deadlight", "Phasmophobia", "CSGO"};
            int pos = (int) (Math.random() * lista.length);
            return lista[pos];
        }

        /**
         * Genera una plataforma aleatoria
         *
         * @return edad aleatoria
         */
        private String plataformaRandom() {
            String[] lista = {"PC", "Play", "Xbox", "Switch"};
            int pos = (int) (Math.random() * lista.length);
            return lista[pos];
        }

        /**
         * Genera un precio aleatorio
         *
         * @return precio aleatorio
         */
        private float precioRandom() {
            float precio = (float) (Math.random() * 200);
            precio = (float) (Math.round(precio*100.0)/100.0);
            return precio;
        }
}
