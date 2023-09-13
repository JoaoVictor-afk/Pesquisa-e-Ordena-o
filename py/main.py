from util import Util
from ordenacao import Ordenacao



alunos = []
Util.popular_lista(alunos)
Ordenacao.shell(alunos)
# Util.exibir_lista(alunos)

alunos = []
Util.popular_lista(alunos)
array=Ordenacao.quicksort(alunos)
Util.exibir_lista(array)