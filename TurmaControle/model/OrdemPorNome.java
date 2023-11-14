package L15.Q1.model;

import java.util.Comparator;

public class OrdemPorNome implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNome().compareTo(o2.getNome());
    }

}
