package com.example.data.entities.authEntites

import org.ktorm.entity.Entity
import java.time.LocalDateTime

interface UserEntity : Entity<UserEntity> {
    companion object : Entity.Factory<UserEntity>()

    var userId: Int
    var userRole: Int
    var username: String
    var userPassword: String
    var userAge: Int
    var userPhone: String
    var userAddress: String
    var userSalt: String
//    var userRegister: LocalDateTime?
}



