package com.example.tlenguajes2023.Configuracion;

public class ConfigDB
{
    // Configuracion de los paramentros de la base de datos local en sqlite
    // Nombre de la base de datos
    public static final String namebd = "DBTLeng";

    // Tabla de la base de datos
    public static final String tblpersonas = "PERSONAS";

    //Campos de la tabla personas
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "apellidos";
    public static final String genero = "genero";
    public static final String direccion = "direccion";
    public static final String edad = "edad";
    public static final String correo = "correo";

    // Creacion de objectos DDL - CREATE - DROP - ALTER
    public static final String CreateTBPersonas = "CREATE TABLE PERSONAS (id INTEGER PRIMARY KEY AUTOINCREMENT, nombres TEXT," +
            "apellidos TEXT, genero TEXT, direccion TEXT, edad INTEGER, correo TEXT)";

    public static final String DropTBPersonas = "DROP TABLE IF EXISTS PERSONAS";

    // Creacion de objetos DML para poder seleccionar informacio de la base de datos
    public static final String SelectTBPersonas = "SELECT * FROM" + ConfigDB.tblpersonas;

    public static final String Enpty = "";

}
