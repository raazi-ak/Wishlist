package com.raazi.wishlist.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyData {
    val wishList = listOf<Wish>(
        Wish(

            title = "Travel the world",
            description = "Visit every continent and experience different cultures."
        ),
        Wish( title = "Learn a new language", description = "Become fluent in Spanish."),
        Wish( title = "Write a book", description = "Publish a novel.")

    )
}