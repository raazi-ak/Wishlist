package com.raazi.wishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
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