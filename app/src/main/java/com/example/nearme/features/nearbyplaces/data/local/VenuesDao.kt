package com.example.nearme.features.nearbyplaces.data.local

import androidx.room.Dao
import androidx.room.Query
import com.example.nearme.features.nearbyplaces.data.requests.Venue
import com.example.nearme.general.BaseDao
import io.reactivex.Maybe

@Dao
abstract class VenuesDao /*: BaseDao<Venue>*/ {
//    @Query("SELECT * FROM venues_table")
//    abstract fun getVenues(): Maybe<List<Venue>>
}