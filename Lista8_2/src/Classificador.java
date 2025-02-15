
public class Classificador {
    public void ordena(Classificavel[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            Classificavel menor = a[i];
            int pos = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j].menorElemento(menor)) {
                    menor = a[j];
                    pos = j;
                }
            }

            if (pos != i) {
                Classificavel temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
            }
        }
    }
}
