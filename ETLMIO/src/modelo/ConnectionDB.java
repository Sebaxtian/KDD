/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


/**
 * Esta clase permite actua como interfaz para realizar
 * tareas tipo CRUD en una base de datos.
 * 
 * 
 * @author sebaxtian
 * @version 0.1.0
 * @date sab jun 18 11:46:15 COT 2016
 */


public class ConnectionDB {
    
    // Sistemas manejadores de base de datos
    public static final String DBMSMYSQL = "mysql";
    public static final String DBMSPOSTGRESQL = "postgresql";
    
    // Manejador de eventos a cargar
    private String dbms;
    // Host donde se encuentra la base de datos
    private String host;
    // Puerto para acceder al host
    private int port;
    // Nombre de la base de datos
    private String dbname;
    // Propiedades de coneccion
    private Properties connectionProps;
    
    // Objeto de coneccion a base de datos
    private Connection conndb;
    
    
    /**
     * Metodo constructor de clase para crear una instacia de coneccion a 
     * una base de datos especifica.
     * 
     * @param DBMS
     * @param host
     * @param port
     * @param dbname
     * @param user
     * @param pwd 
     */
    public ConnectionDB(String DBMS, String host, int port, String dbname, String user, String pwd) {
        this.dbms = DBMS;
        this.host = host;
        this.port = port;
        this.dbname = dbname;
        connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", pwd);
        // Carga y establece coneccion con base de datos
        System.out.println("Inicia carga de coneccion con base de datos " + dbms);
        loadConnectionDB();
    }
    
    
    /**
     * Metodo que se encarga de cargar y establecer una coneccion a una base de datos.
     */
    private void loadConnectionDB() {
        // Si el manejador de base de datos es MySQL
        if(dbms.equals(DBMSMYSQL)) {
            try {
                if(conndb != null) {
                    if(conndb.isClosed()) {
                        conndb = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbname, connectionProps);
                    }
                } else {
                    conndb = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbname, connectionProps);
                    System.out.println("Exito al carga coneccion con base de datos MySQL");
                }
            } catch (SQLException ex) {
                System.err.println("Error al cargar coneccion con base de datos MySQL " + ex.getMessage());
            }
        }
        if(dbms.equals(DBMSPOSTGRESQL)) {
            System.out.println("Cargar coneccion con base de datos Postgresql no implementada");
        }
    }
    
    
    /**
     * Metodo que cierra la coneccion a la base de datos.
     */
    private void closeConnectionDB() {
        if(conndb != null) {
            try {
                this.conndb.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar coneccion con base de datos " + ex.getMessage());
            }
        }
    }
    
    
    
    
    /**
     * Este metodo selecciona el id_fecha para una fechaBruta especifica.
     * 
     * @param fechaBruta
     * @return id_fecha
     */
    public int selectIdFecha(String fechaBruta) {
        int id_fecha = -1;
        try {
            if(fechaBruta != null) {
                loadConnectionDB();
                // SELECT id_fecha FROM dim_fecha WHERE fecha_bruta = '150815';
                String sqlQuery = "SELECT id_fecha FROM dim_fecha WHERE fecha_bruta = '" + fechaBruta + "';";
                Statement stmt = conndb.createStatement();
                ResultSet resultSet = stmt.executeQuery(sqlQuery);

                // Es un valor de llave primaria, debe ser unico
                while(resultSet.next()) {
                    id_fecha = resultSet.getInt(1);
                }
                resultSet.close();
                stmt.close();
                // Cierra la coneccion a la base de datos
                closeConnectionDB();
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar Select id_fecha en tabla dim_fecha " + fechaBruta + " " + ex.getMessage());
        }
        return id_fecha;
    }
    
    
    
    /**
     * Este metodo selecciona el id_tiempo para una tiempoBruto especifica.
     * 
     * @param tiempoBruto
     * @return id_tiempo
     */
    public int selectIdTiempo(String tiempoBruto) {
        int id_tiempo = -1;
        try {
            if(tiempoBruto != null) {
                loadConnectionDB();
                // SELECT id_tiempo FROM dim_tiempo WHERE tiempo_bruto = '13-14';
                String sqlQuery = "SELECT id_tiempo FROM dim_tiempo WHERE tiempo_bruto = '" + tiempoBruto + "';";
                Statement stmt = conndb.createStatement();
                ResultSet resultSet = stmt.executeQuery(sqlQuery);

                // Es un valor de llave primaria, debe ser unico
                while(resultSet.next()) {
                    id_tiempo = resultSet.getInt(1);
                }
                resultSet.close();
                stmt.close();
                // Cierra la coneccion a la base de datos
                closeConnectionDB();
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar Select id_tiempo en tabla dim_tiempo " + tiempoBruto + " " + ex.getMessage());
        }
        return id_tiempo;
    }
    
    
    
    /**
     * Este metodo selecciona el id_ruta_estacion para una rutaOestacion especifica.
     * 
     * @param rutaOestacion
     * @return id_ruta_estacion
     */
    public int selectIdRutaEstacion(String rutaOestacion) {
        int id_ruta_estacion = -1;
        try {
            if(rutaOestacion != null) {
                loadConnectionDB();
                // SELECT id_ruta_estacion FROM dim_ruta_estacion WHERE nombre_ruta_estacion = 'P52A_2';
                String sqlQuery = "SELECT id_ruta_estacion FROM dim_ruta_estacion WHERE nombre_ruta_estacion = '" + rutaOestacion + "';";
                Statement stmt = conndb.createStatement();
                ResultSet resultSet = stmt.executeQuery(sqlQuery);

                // Es un valor de llave primaria, debe ser unico
                while(resultSet.next()) {
                    id_ruta_estacion = resultSet.getInt(1);
                }
                resultSet.close();
                stmt.close();
                // Cierra la coneccion a la base de datos
                closeConnectionDB();
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar Select id_ruta_estacion en tabla dim_ruta_estacion " + rutaOestacion + " " + ex.getMessage());
        }
        return id_ruta_estacion;
    }
    
    
    
    
    /**
     * Este metodo ejecuta en la tabla dim_fecha un String INSERT INTO.
     * 
     * Retorna el id_fecha del registro guardado en la tabla.
     * 
     * @param fechaBruta
     * @param sqlInsert
     * @return id_fecha
     */
    public int insertDimFecha(String fechaBruta, String sqlInsert) {
        int id_fecha = this.selectIdFecha(fechaBruta);
        try {
            // Si no existe el registro en la tabla.
            if(id_fecha == -1 || id_fecha == 0) {
                // Carga la coneccion a la base de datos si es necesario
                loadConnectionDB();
                PreparedStatement pstmt = conndb.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
                pstmt.executeUpdate();
                // Ultimo id generado en el insert
                ResultSet resultSet = pstmt.getGeneratedKeys();
                resultSet.next();
                id_fecha = resultSet.getInt(1);
                resultSet.close();
                pstmt.close();
                // Cierra la coneccion a la base de datos
                closeConnectionDB();
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar Insert Into en tabla dim_fecha " + ex.getMessage());
        }
        return id_fecha;
    }
    
    
    
    /**
     * Este metodo ejecuta en la tabla dim_tiempo un String INSERT INTO.
     * 
     * Retorna el id_tiempo del registro guardado en la tabla.
     * 
     * @param tiempoBruto
     * @param sqlInsert
     * @return id_tiempo
     */
    public int insertDimTiempo(String tiempoBruto, String sqlInsert) {
        int id_tiempo = this.selectIdTiempo(tiempoBruto);
        try {
            // Si no existe el registro en la tabla
            if(id_tiempo == -1 || id_tiempo == 0) {
                // Carga la coneccion a la base de datos si es necesario
                loadConnectionDB();
                PreparedStatement pstmt = conndb.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
                pstmt.executeUpdate();
                // Ultimo id generado en el insert
                ResultSet resultSet = pstmt.getGeneratedKeys();
                resultSet.next();
                id_tiempo = resultSet.getInt(1);
                resultSet.close();
                pstmt.close();
                // Cierra la coneccion a la base de datos
                closeConnectionDB();
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar Insert Into en tabla dim_tiempo " + ex.getMessage());
        }
        return id_tiempo;
    }
    
    
    
    /**
     * Este metodo ejecuta en la tabla dim_ruta_estacion un String INSERT INTO.
     * 
     * Retorna el id_ruta_estacion del registro guardado en la tabla.
     * 
     * @param estacionOruta
     * @param sqlInsert
     * @return id_ruta_estacion
     */
    public int insertDimRutaEstacion(String estacionOruta, String sqlInsert) {
        int id_ruta_estacion = this.selectIdRutaEstacion(estacionOruta);
        try {
            // Si no existe el registro en la tabla
            if(id_ruta_estacion == -1 || id_ruta_estacion == 0) {
                // Carga la coneccion a la base de datos si es necesario
                loadConnectionDB();
                PreparedStatement pstmt = conndb.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
                pstmt.executeUpdate();
                // Ultimo id generado en el insert
                ResultSet resultSet = pstmt.getGeneratedKeys();
                resultSet.next();
                id_ruta_estacion = resultSet.getInt(1);
                resultSet.close();
                pstmt.close();
                // Cierra la coneccion a la base de datos
                closeConnectionDB();
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar Insert Into en tabla dim_ruta_estacion " + ex.getMessage());
        }
        return id_ruta_estacion;
    }
    
    
    
    /**
     * Este metodo ejecuta en la tabla de hechos frecuencias un String INSERT INTO.
     * 
     * Retorna el id_frecuencia del registro guardado en la tabla.
     * 
     * @param sqlInsert
     * @return id_frecuencia
     */
    public int insertTablaFrecuencias(String sqlInsert) {
        int id_frecuencia = -1;
        try {            
            // Carga la coneccion a la base de datos si es necesario
            loadConnectionDB();
            PreparedStatement pstmt = conndb.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();
            // Ultimo id generado en el insert
            ResultSet resultSet = pstmt.getGeneratedKeys();
            resultSet.next();
            id_frecuencia = resultSet.getInt(1);
            resultSet.close();
            pstmt.close();
            // Cierra la coneccion a la base de datos
            closeConnectionDB();
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar Insert Into en tabla frecuencias " + ex.getMessage());
        }
        return id_frecuencia;
    }
    
    
    
}