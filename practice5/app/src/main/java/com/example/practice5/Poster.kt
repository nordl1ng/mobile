package com.example.practice5

data class Poster(val imageId:Int, val title:String)
class PosterList{val list= arrayListOf(Poster(R.drawable.image1, "Осеннее приключение в приятной компании"),
    Poster(R.drawable.image2, "Дом, милый дом"),
    Poster(R.drawable.image3, "Осеннее приключение в приятной компании"),
    Poster(R.drawable.image4, "Осеннее приключение в приятной компании"),
    Poster(R.drawable.image5, "Осеннее приключение в приятной компании"))
}
