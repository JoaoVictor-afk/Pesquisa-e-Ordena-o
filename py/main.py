from util import Util
from ordenacao import Ordenacao

alunos = []

Util.popular_lista(alunos)
Ordenacao.sortpy(alunos)
alunos = []

Util.popular_lista(alunos)
Ordenacao.bolha(alunos)
alunos = []

alunos = []
Util.popular_lista(alunos)
Ordenacao.select(alunos)


alunos = []
Util.popular_lista(alunos)
Ordenacao.insert(alunos)
# Util.exibir_lista(alunos)


alunos = []
Util.popular_lista(alunos)
Ordenacao.pente(alunos)

Util.exibir_lista(alunos)
