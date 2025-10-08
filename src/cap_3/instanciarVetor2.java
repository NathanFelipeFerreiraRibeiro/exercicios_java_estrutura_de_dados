package cap_3;

public class instanciarVetor2 {
    public static void main(String[] args) {
        vetor vetor = new vetor(5);
        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 5");
            vetor.adiciona("elemento 6");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
