# Dokumentasi Mini Project Back-End Developer Bootcamp Multipolar

Nama: Yunanti Moga Hasanah
Prodi: Matematika

##  Nama Aplikasi
Aplikasi ini bernama Bank Application

## Deskripsi Aplikasi
Aplikasi ini dibuat untuk mengelola layanan internet bank dari suatu client perbankan. Aplikasi ini menerapkan mikroservice agar mempermudah pengelolahan dan menghindari terjadinya error yang dapat mengganggu bagian-bagian fitur lainnya. Adapun untuk service yang akan dibuat terdapat 3 dalam aplikasi ini yaitu:
1. Product, berfungsi sebagai pengolahan informasi product bank seperti nama, tipe, rating ketertarikan, saldo minimal, jumlah pinjaman maksimal, syarat dan ketentuan, serta waktu dan tanggal transaksi.
2. Gateway, berfungsi sebagai pintu penghubung client atau pengguna dengan service-service yang ada di dalam aplikasi bank.
3. Logging, berfungsi sebagai penyimpan aktivitas apa saja yang dilakukan di service gateway.

## Pemakaian Logging Service
1. Pengguna dapat menyimpan semua aktivitas dari gateway dalam logging service ini.
2. Aktifitas akan tersimpan pada database MongoDB.
3. Service ini menggunakan Message Queue sebagai inter-service communication karena pentingnya untuk memastikan tersimpannya aktivitas yang dilakukan di gateway walaupun server database sedang offline. Semua aktivitas akan tercatan melalui kafka terlebih dahulu sebelum terkirim pada database.

## Tools Logging Service
JAVA, SPRING BOOT, MAVEN, MONGODB, LOMBOK, KAFKA ZOOKEEPER

# logging-bank.app-bootcamp-multipolar
Service Logging untuk menyimpan aktivitas keluar-masuk di Gateway dari Aplikasi Bank
