package org.zk.cmplearningproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform