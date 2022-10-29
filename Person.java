public class Person {
    String nama, jeniskelamin;
    int umur;

    public static void main(String[] args) {
        Person person = new Person();

        person.nama = "Johan Putra Pradana";
        person.jeniskelamin = "Laki laki";
        person.umur = 22;

        System.out.println("Nama: " + person.nama);
        System.out.println("Jeniskelamin: " + person.jeniskelamin);
        System.out.println("Umur: " + person.umur);

    }
}