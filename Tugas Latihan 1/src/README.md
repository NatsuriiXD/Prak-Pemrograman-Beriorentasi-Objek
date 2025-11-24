# Encapsulation & Class Design  
## Studi Kasus A, Studi Kasus B, dan Tugas Praktikum 1

Dokumen ini menggabungkan seluruh materi: Studi Kasus A, Studi Kasus B, Tugas Praktikum 1, serta Tugas Tambahan. Semua dijelaskan dalam satu file README.

---

# 7. Studi Kasus

## Studi Kasus A — Mini Bank

Studi kasus A membuat dua class: `BankAccount` dan `Bank`.  
`Bank` memiliki banyak `BankAccount`, dan relasinya adalah:

Bank "1" o-- "*" BankAccount

### Class BankAccount
Menerapkan **encapsulation** melalui atribut private dan method terkontrol.

Atribut:
- accountNumber : String  
- ownerName : String  
- balance : double (private)

Method:
- Constructor  
- Getter untuk seluruh atribut  
- setOwnerName(String)  
- deposit(double)  
- withdraw(double)  
- Validasi input dan saldo

### Class Bank
Menyimpan daftar akun menggunakan `Map<String, BankAccount>`.

Method:
- createAccount(String, String, double)  
- findAccount(String)  
- transfer(String, String, double)  

---

## Studi Kasus B — Student & StudentRepository

Pada studi kasus ini, dibuat dua class: `Student` dan `StudentRepository`.

Relasinya:

StudentRepository "1" o-- "*" Student

### Class Student
Atribut:
- npm : String (final)  
- name : String  
- gpa : double  

Method:
- Constructor  
- Getter & Setter  
- Validasi name & gpa  
- display()

### Class StudentRepository
Menggunakan `Map<String, Student>` untuk menyimpan data.

Method:
- add(Student)  
- remove(String npm)  
- findByNpm(String)  
- getStudentsByGpa(double minGpa)

---

# 9. Tugas Praktikum 1 (Wajib)

Tugas ini merupakan implementasi dari **Studi Kasus A**:

Program harus:
1. Membuat class BankAccount  
2. Membuat class Bank  
3. Membuat program Main yang:  
   - membuat 3 akun  
   - melakukan deposit  
   - melakukan withdraw  
   - melakukan transfer  
   - mencetak saldo akhir  

Semua fitur ini telah diimplementasikan dalam kode versi dasar (`BankAccount`, `Bank`, `Main`).

---

# Tugas Tambahan (Opsional)

Versi lanjutan dari BankAccount terdapat pada `BankAccount2`, ditambah:

- List<String> transactions  
- Semua aktivitas dicatat:
  - pembuatan akun  
  - deposit  
  - withdraw  
  - transfer  

Getter transaksi menggunakan:

Collections.unmodifiableList()

Agar list tidak dapat diubah dari luar.

Relasi versi transaksi:

Bank2 "1" o-- "*" BankAccount2

---

README ini mencakup seluruh rangkuman Studi Kasus dan Tugas Praktikum.