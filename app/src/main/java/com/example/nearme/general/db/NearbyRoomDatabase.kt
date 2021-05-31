package com.example.nearme.general.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.nearme.features.nearbyplaces.data.Place
import com.example.nearme.features.nearbyplaces.data.local.VenuesDao
import com.example.nearme.features.nearbyplaces.data.requests.Venue

@Database(entities = [Place::class], version = 2, exportSchema = false)
abstract class NearbyRoomDatabase : RoomDatabase() {

    abstract fun venueDao(): VenuesDao
}