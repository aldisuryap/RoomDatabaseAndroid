package com.example.roomdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Barang.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDAO barangDAO();
}

