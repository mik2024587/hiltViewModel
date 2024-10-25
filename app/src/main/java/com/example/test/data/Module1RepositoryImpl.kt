package com.example.test.data

class Module1RepositoryImpl : Repository() {
    override fun get(): String {
        return "hi from module 1 repository"
    }
}