package com.zybooks.todolist

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)