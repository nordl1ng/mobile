package com.example.practice2

data class Poster(val imageId:Int)
class PosterList{val list= arrayListOf(
    Poster(R.drawable.one),
    Poster(R.drawable.two),
    Poster(R.drawable.three),
    Poster(R.drawable.four),
    Poster(R.drawable.five)
    )
}