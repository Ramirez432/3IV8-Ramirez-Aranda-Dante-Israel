public class DatosL {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    public DatosL() {
    }
    //constructor con parámetros
    public DatosL(String titulo, String autor, int ejemplares, int prestados) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    public int getPrestados() {
        return prestados;
    }
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //método para realizar el prestamo de un libro
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados<ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }
    //método para realizar la devolución de un libro
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;                                    
    }   
}