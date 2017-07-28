package LuSQL.logica;

/**
 * Objecto que almacena información sobre una columna de bases de datos.
 * Solo almacena información sobre como esta formada la columna, no almacena ningún tipo de valor
 */
public class Columna {
    
    private String nombre;
    private String tipo;
    private String longitudValores;
    private boolean primaryKey;
    private boolean autoIncremental;
    private boolean nulo;

    public Columna() {   
        this.longitudValores="";
    }

    public Columna(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitudValores="";
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLongitudValores() {
        return longitudValores;
    }

    public void setLongitudValores(String longitudValores) {
        this.longitudValores = longitudValores;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public boolean isAutoIncremental() {
        return autoIncremental;
    }

    public void setAutoIncremental(boolean autoIncremental) {
        this.autoIncremental = autoIncremental;
    }

    public boolean isNulo() {
        return nulo;
    }

    public void setNulo(boolean nulo) {
        this.nulo = nulo;
    }

    @Override
    public String toString() {
        String pKey="";
        String nulo="";
        String AI="";
        String longValores="";
        if(isPrimaryKey()){
            pKey=" PRIMARY KEY";
        } 
        if(!isNulo()){
            nulo=" NOT NULL";
        }
        if(!longitudValores.isEmpty()){
            longValores="("+longitudValores+")";
        }
        if(isAutoIncremental()){
            AI=" AUTO_INCREMENT";
        }
        return this.nombre+" "+this.tipo+longValores+pKey+AI+nulo; 
    }
    
}
