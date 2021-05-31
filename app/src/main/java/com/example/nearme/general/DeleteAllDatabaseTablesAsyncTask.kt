package com.example.nearme.general

import android.os.AsyncTask
import com.example.nearme.general.db.NearbyRoomDatabase

class DeleteAllDatabaseTablesAsyncTask constructor(
    private val db: NearbyRoomDatabase
) : AsyncTask<Void, Void, Void>() {

    override fun doInBackground(vararg params: Void?): Void? {
        db.clearAllTables()
        return null
    }
}