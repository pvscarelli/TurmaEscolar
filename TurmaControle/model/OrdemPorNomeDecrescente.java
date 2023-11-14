package L15.Q1.model;

import java.util.Comparator;

public class OrdemPorNomeDecrescente implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o2.getNome().compareTo(o1.getNome());
    }

}
