package com.example.liblogserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiblogserverApplication
inline fun main(args: Array<String>) {
    runApplication<LiblogserverApplication>(*args)
}
