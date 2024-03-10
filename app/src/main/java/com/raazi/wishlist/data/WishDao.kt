package com.raazi.wishlist.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import java.util.concurrent.Flow

@Dao
abstract class WishDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addWish(wish: Wish)
    @Query("Select * from `wish-table`")
    abstract fun getWishes():kotlinx.coroutines.flow.Flow<List<Wish>>
    @Delete
    abstract suspend fun deleteWish(wish: Wish)
    @Update
    abstract suspend fun updateWish(wish: Wish)
    @Query("Select * from `wish-table` where id=:id")
    abstract fun getWishID(id: Long):kotlinx.coroutines.flow.Flow<Wish>
}