package com.raazi.wishlist

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.raazi.wishlist.data.Wish
import com.raazi.wishlist.data.WishRepository
import kotlinx.coroutines.flow.Flow

class WishViewModel(
    private val wishRepository: WishRepository
):ViewModel(){

    var wishTitleState by mutableStateOf("")
    var wishDescState by mutableStateOf("")


    fun onWishTitleChanged(newString: String){
        wishTitleState = newString
    }

    fun onWishDescChanged(newString: String){
        wishDescState = newString
    }

    lateinit var getAllWishes:Flow<List<Wish>>
}