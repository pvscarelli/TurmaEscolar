package L15.Q1.model;

import java.util.Comparator;

public class OrderPorMatricula implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        
        int ordem = 0;
        
        if (o1.getMatricula() < o2.getMatricula()) {
            ordem = -1;
        } else if (o1.getMatricula() > o2.getMatricula()) {
            ordem = +1;
        } else {
            ordem = 0;
        }

        return ordem;
    }
}
