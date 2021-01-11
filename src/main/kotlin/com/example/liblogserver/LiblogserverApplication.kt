package com.example.liblogserver

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@MapperScan("com.example.liblogserver.mapper")
@SpringBootApplication
class LiblogserverApplication
inline fun main(args: Array<String>) {
    runApplication<LiblogserverApplication>(*args)
}
