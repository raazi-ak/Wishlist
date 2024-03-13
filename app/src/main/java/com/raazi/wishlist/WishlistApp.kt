package com.raazi.wishlist

import android.app.Application

class WishlistApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Graph.databaseProvider(this)
    }
}