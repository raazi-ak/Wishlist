package com.raazi.wishlist

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raazi.wishlist.data.Wish
import com.raazi.wishlist.data.WishDao
import com.raazi.wishlist.data.WishRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class WishViewModel(
    private val wishRepository: WishRepository,

    ) : ViewModel() {
    var wishTitleState by mutableStateOf("")
    var wishDescState by mutableStateOf("")


    fun onWishTitleChanged(newString: String) {
        wishTitleState = newString
    }

    fun onWishDescChanged(newString: String) {
        wishDescState = newString
    }

    fun updateWish(wish: Wish) = viewModelScope.launch(Dispatchers.IO) {
        wishRepository.updateWish(wish)
    }

    lateinit var getAllWishes: Flow<List<Wish>>

    init {
        viewModelScope.launch {
            getAllWishes = wishRepository.getWishes()
        }
    }

    fun addWish(wish: Wish) {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.addWish(wish)
        }
    }

    fun deleteWish(wish: Wish) {
        viewModelScope.launch {
            wishRepository.deleteWish(wish)
        }
    }

    fun getWishID(id: Long): Flow<Wish> {
        return wishRepository.getWishID(id)

    }
}