package com.example.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

@Dao
public interface BarangDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertBarang(Barang barang);

//    long updateBarang(Barang barang);
}
