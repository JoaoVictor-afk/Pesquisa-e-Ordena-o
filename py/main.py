from util import Util
from ordenacao import Ordenacao
import time



# alunos = []
# Util.popular_lista(alunos)
# Ordenacao.shell(alunos)
# # Util.exibir_lista(alunos)

# alunos = []
# Util.popular_lista(alunos)
# array=Ordenacao.quicksort(alunos)
# Util.exibir_lista(array)



alunos = []
Util.popular_lista(alunos)
array=Ordenacao.mergesort(alunos)
# Util.exibir_lista(array)

start_time = time.time()
Util.pesquisa_binaria(array,200)
print("--- %s Achou seconds ---" % (time.time() - start_time))
start_time = time.time()
array.index(200)
print("--- %s Achou seconds ---" % (time.time() - start_time))