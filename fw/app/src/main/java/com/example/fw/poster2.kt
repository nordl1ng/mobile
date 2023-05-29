package com.example.fw

data class poster2(val imageId:Int, val title:String, val title2:String)

class poster2List{val list= arrayListOf(
    poster2(R.drawable.jason, "Джейсон Шварцман", "... Jesper, озвучка"),
    poster2(R.drawable.jones, "Рашида Джонс", "... Alva, озвучка"),
    poster2(R.drawable.sasso, "Уилл Сассо", "... Mr. Ellingboe, озвучка"),
    poster2(R.drawable.simmons, "Дж.К. Симмонс", "... Klaus, озвучка"),
    poster2(R.drawable.cusack, "Джоан Кьюсак", "... Mrs. Krum, озвучка"))
}
