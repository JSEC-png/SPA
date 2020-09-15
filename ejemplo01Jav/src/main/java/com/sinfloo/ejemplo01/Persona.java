
package com.sinfloo.ejemplo01;
import javax.persistence.*;

@Entity
@Table(name = "personas" )

public class Persona {

    @Id
    @Column(name = "idpersona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpersona;

    @Column(name = "apellidos")
    private String apellidos;
    
    @Column(name = "documento")
    private String documento;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "fechanacimiento")
    private String fechanacimiento;
    
    @Column(name = "nombres")
    private String nombres;
    
    @Column(name = "contrasena")
    private String contrasena;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "usuario")
    private String usuario;
    
    @ManyToOne
    @JoinColumn(name = "idtipodocumento")
    private TipoDocumento tipo;
    
    @ManyToOne
    @JoinColumn(name = "idciudad")
    private Ciudad ciudad;

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    
    
    
    
}
