package com.raazi.wishlist.data

import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDao: WishDao) {
    suspend fun addWish(wish:Wish){
        wishDao.addWish(wish)
    }
    fun getWishes():Flow<List<Wish>> = wishDao.getWishes()

    fun getWishID(id:Long):Flow<Wish> = wishDao.getWishID(id)

    suspend fun updateWish(wish:Wish) = wishDao.updateWish(wish)

    suspend fun deleteWish(wish:Wish)  = wishDao.deleteWish(wish)


}