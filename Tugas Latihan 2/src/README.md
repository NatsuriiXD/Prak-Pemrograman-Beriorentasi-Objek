# Encapsulation & Class Design  
## Studi Kasus A, Studi Kasus B, dan Tugas Praktikum (Lengkap)

Dokumen ini berisi seluruh penjelasan mengenai implementasi OOP (Object-Oriented Programming) dalam tiga bagian:

1. **Studi Kasus A — Mini Bank**  
2. **Studi Kasus B — Vehicle & Car (Inheritance & Polymorphism)**  
3. **Tugas Praktikum — Implementasi getInfo()**

Semua UML, desain, dan contoh kode digabung dalam narasi agar mudah dipahami.

---

# 1. Konsep OOP yang Digunakan

### **Encapsulation**
- Atribut dibuat private  
- Perubahan data hanya melalui method resmi  
- Menghindari manipulasi langsung dari luar class

### **Association**
Contoh: Bank memiliki banyak BankAccount  
Ditulis dalam penjelasan sebagai:  
**Bank "1" o-- "*" BankAccount**

### **Inheritance**
Class dapat mewarisi atribut dan method.  
Contoh:  
**Vehicle <|-- Car**

### **Polymorphism**
Method child menimpa method parent (override).  
Terlihat jelas pada `Car.getInfo()` yang mengganti `Vehicle.getInfo()`.

---

# 2. Studi Kasus A — Mini Bank

Studi kasus ini menggunakan dua class: **BankAccount** dan **Bank**.  
Relasi antarkelas dijelaskan langsung:

Bank menyimpan banyak rekening, relasinya:  
**Bank "1" o-- "*" BankAccount**

---

## 2.1 Class BankAccount

### Atribut:
- `accountNumber : String`  
- `ownerName : String`  
- `balance : double (private)`

### Method:
- `deposit(double amount)`  
- `withdraw(double amount)`  
- `getInfo()` — menampilkan data akun

Atribut balance dibuat private sebagai bentuk encapsulation.

---

## 2.2 Class Bank

### Atribut:
- `accounts : ArrayList<BankAccount>`

### Method:
- `addAccount(BankAccount acc)`  
- `showAllAccounts()`

Bank berperan sebagai pengelola kumpulan rekening.

---

# 3. Studi Kasus B — Vehicle & Car (Inheritance)

Relasi dijelaskan:  
**Vehicle <|-- Car**

---

## 3.1 Class Vehicle

### Atribut:
- `brand : String`  
- `year : int`

### Method:
- `getInfo()` — info dasar kendaraan

---

## 3.2 Class Car (extends Vehicle)

### Atribut tambahan:
- `model : String`

### Method Override:
- `getInfo()` — menampilkan brand, year, dan model  
Ini mendemonstrasikan polymorphism.

---

# 4. Tugas Praktikum — Implementasi getInfo()

Pada tugas ini, method `getInfo()` diimplementasikan pada object yang digunakan.

### Tempat Implementasi getInfo()
Method getInfo() digunakan pada setiap class sesuai perannya.  
Pada BankAccount, getInfo() menampilkan nomor rekening, nama pemilik, dan saldo.  
Pada Vehicle, getInfo() menampilkan brand dan tahun kendaraan.  
Sedangkan pada Car, getInfo() dioverride sehingga menampilkan brand, tahun, dan model.  
Dengan demikian, meskipun objek dipanggil melalui referensi parent, method yang berjalan tetap milik child (polymorphism runtime).

### Contoh Pemanggilan:
```java
obj.getInfo();