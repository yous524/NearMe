package com.example.nearme.di

import android.content.Context
import androidx.room.Room
import com.example.nearme.features.nearbyplaces.data.local.VenuesDao
import com.example.nearme.general.db.NearbyRoomDatabase
import com.example.nearme.utils.KEY_DATABASE_NAME
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {
    @Singleton
    @Provides
    internal fun providesRoomDatabase(context: Context): NearbyRoomDatabase {
        return Room.databaseBuilder(
            context.applicationContext, NearbyRoomDatabase::class.java, KEY_DATABASE_NAME
        ).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    internal fun provideVenuesDao(nearbyRoomDatabase: NearbyRoomDatabase) =
        nearbyRoomDatabase.venueDao()

}