/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.ejercicio08;

/**
 *
 * @author matut
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;
    private Documento documento;

    // constructor
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario, String titulo, String contenido) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
        this.documento = new Documento(titulo, contenido);
    }
    
    // metodo para clase Documento
    public void mostrarDocumento() {
        System.out.println("Info sobre el documento: \n -Título: " + documento.getTitulo() + "\n -Contenido: " + documento.getContenido());
    }
    
    // metodo para clase Usuario
    public void mostrarUsuario() {
        System.out.println("La firma digital " + codigoHash + " pertenece a " + usuario.getNombre() + (". Correo electrónico: ") + usuario.getEmail());
    }
    
    // getters propios
    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }
    
}
