public class MainAire {
    public static void main(String[] args) {
        Aire aire1 = new Aire("Aire1", 12, 13,5);
        aire1.augmentarTemp();
        aire1.augmentarTemp();
        aire1.dismunuirTemp();
        aire1.dismunuirTemp();
        aire1.dismunuirTemp();
        System.out.println(aire1);
    }
}
