package com.raazi.wishlist.data

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false
)
abstract class WishDatabse:RoomDatabase() {
    abstract fun wishDao(): WishDao
}