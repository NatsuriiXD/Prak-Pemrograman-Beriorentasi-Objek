public class StudentMain {
    public static void main(String[] args) {

        StudentRepository repo = new StudentRepository();

        // Tambah mahasiswa
        repo.add(new Student("123", "Nabil", 3.8));
        repo.add(new Student("124", "Rauf", 2.9));
        repo.add(new Student("125", "Alex", 3.2));

        // Cari berdasarkan NPM
        Student s = repo.findByNpm("123");
        System.out.println("Hasil pencarian NPM 123: " + s.display());

        // Tampilkan mahasiswa dengan GPA >= 3.0
        System.out.println("\nMahasiswa dengan GPA >= 3.0:");
        for (Student m : repo.getStudentsByGpa(3.0)) {
            System.out.println(m.display());
        }

        // Hapus mahasiswa
        repo.remove("124");
        System.out.println("\nSetelah menghapus mahasiswa NPM 124:");

        // Tampilkan semua yang tersisa
        for (Student m : repo.getStudentsByGpa(0)) {
            System.out.println(m.display());
        }
    }
}