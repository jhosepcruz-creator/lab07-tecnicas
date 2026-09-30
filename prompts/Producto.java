import java.math.BigDecimal;

public class Producto {

    private String id;
    private String nombre;
    private String categoria;
    private BigDecimal precioCompra;
    private BigDecimal precioVenta;
    private int stockActual;
    private int stockMinimo;

    // Constructor completo
    public Producto(String id, String nombre, String categoria, BigDecimal precioCompra, BigDecimal precioVenta, int stockActual, int stockMinimo) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    // Método auxiliar opcional para validar si necesita reposición
    public boolean requiereReposicion() {
        return this.stockActual <= this.stockMinimo;
    }
}