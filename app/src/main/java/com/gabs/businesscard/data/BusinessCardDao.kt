package com.gabs.businesscard.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE

import androidx.room.Query


@Dao
interface BusinessCardDao {
    @Query("SELECT * FROM BusinessCard")
    fun getAll(): LiveData<List<BusinessCard>>

    @Insert(onConflict = IGNORE)
    fun insert(businessCard: BusinessCard)
}