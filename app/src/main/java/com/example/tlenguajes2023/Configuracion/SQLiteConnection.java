package com.example.tlenguajes2023.Configuracion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteConnection extends SQLiteOpenHelper
{

    public SQLiteConnection(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        /* Creacion de objetos de base de datos*/
        sqLiteDatabase.execSQL(ConfigDB.CreateTBPersonas); // Creando la tabla de personas en SQLite
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        /* Eliminando objetos de la base de datos*/
        sqLiteDatabase.execSQL(ConfigDB.DropTBPersonas);
        /*Pasando datos nuevos*/
        onCreate(sqLiteDatabase);
    }
}
