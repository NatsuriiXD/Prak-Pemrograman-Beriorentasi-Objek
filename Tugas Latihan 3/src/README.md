# OOP Java – Studi Kasus A, Studi Kasus B, dan Tugas Praktikum

Dokumen ini berisi rangkuman studi kasus, penjelasan konsep OOP, serta UML dalam bentuk teks.

---

# 📘 Studi Kasus A – Sistem Pembayaran Sederhana

## 🎯 Tujuan
Membuat sistem pembayaran menggunakan interface dan polymorphism runtime.

## 🧩 Deskripsi Singkat
- Interface `PaymentMethod` memiliki method `pay()`.
- Tiga metode pembayaran:
  - CreditCard
  - PayPal
  - BankTransfer
- Kelas `PaymentProcessor` memanggil `pay()` secara polimorfik.

---

## 🧾 UML (Bentuk Teks)

```
<<interface>> PaymentMethod
+ pay(amount: double): boolean
---------------------------------

CreditCard
- cardNumber: String
+ CreditCard(cardNumber: String)
+ pay(amount: double): boolean

PayPal
- email: String
+ PayPal(email: String)
+ pay(amount: double): boolean

BankTransfer
- accountNumber: String
+ BankTransfer(accountNumber: String)
+ pay(amount: double): boolean

---------------------------------

PaymentProcessor
+ process(method: PaymentMethod, amount: double): void

Relationships:
PaymentMethod <implemented by> CreditCard
PaymentMethod <implemented by> PayPal
PaymentMethod <implemented by> BankTransfer
PaymentProcessor --> PaymentMethod
```

---

# 📘 Studi Kasus B – Percetakan Dokumen

## 🎯 Tujuan
Menjelaskan penggunaan abstract class dan overriding method.

## 🧩 Deskripsi Singkat
- `Document` adalah abstract class dengan `print()`.
- Subclass:
  - PdfDocument
  - WordDocument
- Printer memanggil `print()` menggunakan polymorphism runtime.

---

## 🧾 UML (Bentuk Teks)

```
<<abstract>> Document
- title: String
+ Document(title: String)
+ print(): void (abstract)
---------------------------------

PdfDocument
+ PdfDocument(title: String)
+ print(): void

WordDocument
+ WordDocument(title: String)
+ print(): void

---------------------------------

Printer
+ printDocument(doc: Document): void

Relationships:
Document <superclass> PdfDocument
Document <superclass> WordDocument
Printer --> Document
```

---

# 📘 Tugas Praktikum – Sistem Dokumen + Logging Halaman

## 🎯 Tujuan
Mengembangkan studi kasus B:
- Menambah field `pages`
- Memperbaiki method print()
- Menambahkan Printer.printAll()

## 🧩 Deskripsi Singkat
- Document → punya `title` dan `pages`
- PdfDocument & WordDocument override print dengan tambahan “jumlah halaman”
- Printer mencetak list dokumen

---

## 🧾 UML (Bentuk Teks)

```
<<abstract>> Document
- title: String
- pages: int
+ Document(title: String, pages: int)
+ print(): void (abstract)
-------------------------------------

PdfDocument
+ PdfDocument(title: String, pages: int)
+ print(): void

WordDocument
+ WordDocument(title: String, pages: int)
+ print(): void

-------------------------------------

Printer
+ printAll(docs: List<Document>): void

Relationships:
Document <superclass> PdfDocument
Document <superclass> WordDocument
Printer --> Document
```

---

# 📘 Opsional – Strategy Pattern (Tax Calculator)

## 🎯 Tujuan
Menunjukkan polymorphism melalui strategi perhitungan pajak.

## 🧩 Deskripsi
- Interface `TaxCalculator`
- FlatTax & ProgressiveTax sebagai strategi
- Employee memakai strategi untuk menghitung pajak

---

## 🧾 UML (Bentuk Teks)

```
<<interface>> TaxCalculator
+ calculate(income: double): double
-------------------------------------

FlatTaxCalculator
- rate: double
+ FlatTaxCalculator(rate: double)
+ calculate(income: double): double

ProgressiveTaxCalculator
+ calculate(income: double): double

-------------------------------------

Employee
- name: String
- income: double
- calculator: TaxCalculator
+ Employee(name, income, calculator)
+ printTax(): void

Relationships:
TaxCalculator <implemented by> FlatTaxCalculator
TaxCalculator <implemented by> ProgressiveTaxCalculator
Employee --> TaxCalculator
```

---

# 🎉 Kesimpulan

Dokumen ini mencakup beberapa konsep OOP penting:

- **Interface**
- **Abstract Class**
- **Method Overriding**
- **Polymorphism**
- **Strategy Pattern**
- **Perancangan UML (teks)**

Semua studi kasus dan tugas ini bisa langsung dijalankan di IntelliJ menggunakan struktur folder terorganisir.