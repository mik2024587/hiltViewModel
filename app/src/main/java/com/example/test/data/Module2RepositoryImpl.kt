package com.example.test.data

class Module2RepositoryImpl : Repository() {
    override fun get(): String {
        return "hi from module 2 repository"
    }
}