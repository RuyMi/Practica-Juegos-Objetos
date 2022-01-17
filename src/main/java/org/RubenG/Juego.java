package org.RubenG;

public class Juego {
        private String titulo = "";
        private String plataforma = "";
        private float precio = 0.0f;

        public Juego(String titulo, String plataforma, float precio) {
            setTitulo(titulo);
            setPlataforma(plataforma);
            setPrecio(precio);
        }

    public Juego() {

    }

    // Getter and Setter

        /**
         * Titulo del Juego
         *
         * @return El titulo del juego
         */
        public String getTitulo() {
            return titulo;
        }

        /**
         * Almacenar titulo del Juego
         *
         * @param titulo titulo del juego
         */
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        /**
         * Recibe la plataforma del juego
         *
         * @return plataforma del juego
         */
        public String getPlataforma() {
            return plataforma;
        }

        /**
         * Asigna la plataforma del juego
         *
         * @param plataforma plataforma del juego. Si la plataforma es distinta a las 4 seleccionadas, lanza una excepción
         */
        public void setPlataforma(String plataforma) {
            plataforma = plataforma.toUpperCase();
            if (plataforma.equals("PC") || plataforma.equals("PLAY") || plataforma.equals("SWITCH") || plataforma.equals("XBOX")) {
                this.plataforma = plataforma;
            } else {
                throw new IllegalArgumentException("La plataforma debe de ser pc, xbox, play o switch");
            }
        }

        /**
         * Obtiene el precio del juego
         *
         * @return precio del juego
         */
        public float getPrecio() {
                return precio;
        }

        /**
         * Asigna el precio del juego
         *
         * @param precio precio del juego, si no es un precio entre 0.00€ y 200.00€ lanzará una excepción
         */
        public void setPrecio(float precio) {
            if (precio >= 0.00 && precio <= 200.00) {
                this.precio = precio;
            } else {
                throw new IllegalArgumentException("El precio puede ser entre 0.00€ y 20.00€");
            }
        }

    public String toString() {
        return "Juego: " + "Titulo: " + titulo + '\'' + ", Plataforma= " + plataforma + '\'' + ", Precio= " + precio + "€";
    }

}
