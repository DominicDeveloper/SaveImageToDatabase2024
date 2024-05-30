package com.asadbek.saveimagetosqlite2024.models

class ImageUser {
    var id:Int? = null
    var absolutePath:String? = null
    var image:ByteArray? = null
    constructor()
    constructor(id: Int?, absolutePath: String?, image: ByteArray?) {
        this.id = id
        this.absolutePath = absolutePath
        this.image = image
    }

    constructor(absolutePath: String?, image: ByteArray?) {
        this.absolutePath = absolutePath
        this.image = image
    }


}