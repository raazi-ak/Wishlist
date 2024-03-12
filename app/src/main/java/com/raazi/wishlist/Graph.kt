package com.raazi.wishlist

import android.content.Context
import androidx.room.Room
import com.raazi.wishlist.data.WishDatabse
import com.raazi.wishlist.data.WishRepository

object Graph {
    lateinit var database: WishDatabse

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun databaseProvider(context: Context){
        database = Room.databaseBuilder(context = context, klass = WishDatabse::class.java,name = "wishlist.db").build()
    }

}









