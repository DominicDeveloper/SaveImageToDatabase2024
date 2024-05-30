package com.asadbek.saveimagetosqlite2024.offlineDatabase

import com.asadbek.saveimagetosqlite2024.models.ImageUser

interface Reja {
    fun addImage(imageUser: ImageUser)
    fun getAllImage():ArrayList<ImageUser>
}