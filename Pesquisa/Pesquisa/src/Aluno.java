public class Aluno implements Comparable<Aluno> {
	
    public int matricula;
    public String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
     public boolean equals(Object o) {
        if (o instanceof Aluno) {
            Aluno e = (Aluno) o;
            return this.matricula == e.matricula && this.nome.equals(e.nome);
        }
        return false;
    }
    
    @Override
    public int compareTo(Aluno a) {
        if (this.matricula < a.matricula) {
            return -1;
        } 
        if (this.matricula == a.matricula) {
            if (this.nome.compareTo(a.nome) < 0) {
                 return -1;
            }
        }
        return 1;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.matricula;
        return hash;
    }
    @Override
    public String toString() {
        return "Nome: "+ this.nome + ". matricula: " + this.matricula; 
    }
}