//En la clase Archivos se puede cambiar por las variables que se necesiten al igual que el nombre de la clase

public class Archivos {

    private String numeroDocumentoAsociado;
    private int cantPaginas;
    private boolean clasificado;

    public Archivos(String numeroDocumentoAsociado, int cantPaginas,
            boolean clasificado) {
        this.numeroDocumentoAsociado = numeroDocumentoAsociado;
        this.cantPaginas = cantPaginas;
        this.clasificado = clasificado;
    }

    public String getNumeroDocumentoAsociado() {
        return numeroDocumentoAsociado;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public boolean isClasificado() {
        return clasificado;
    }
}
