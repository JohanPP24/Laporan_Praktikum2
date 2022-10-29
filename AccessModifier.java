public class AccessModifier {
    private String nama = "Johan";
    private String jenisKelamin = "laki-laki";
    private int umur = 22;
    private String getEntityInfo() {
        return nama + " is " + jenisKelamin  + umur + " years old ";
    }
    public static void main(String[] args) {
        System.out.println(new AccessModifier().getEntityInfo());
    }
}