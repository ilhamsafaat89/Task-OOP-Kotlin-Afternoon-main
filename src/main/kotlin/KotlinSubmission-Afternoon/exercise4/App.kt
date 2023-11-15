package id.infinitelearning.KotlinSubmission.exercise4

import java.io.FileNotFoundException

fun main() {
    val fileName = "file.txt"

    try {
        val fileContent = readFile(fileName)
        println("Isi file: $fileContent")
    } catch (e: FileNotFoundException) {
        println("File tidak ditemukan: ${e.message}")
    }
}

fun readFile(fileName: String): String {
    throw FileNotFoundException("File $fileName not found")
}

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
