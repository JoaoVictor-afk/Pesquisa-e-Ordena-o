import random

import time

from aluno import Aluno


class Util:
    @staticmethod
    def exibir_lista(alunos):
        for item in alunos:
            print(item)
        print("exibido")

    @staticmethod
    def popular_lista(alunos):
        for i in range(0, 100000):
            alunos.append(random.randint(0, 1000))

    @staticmethod
    def ler_arquivo_popular_lista(alunos):
        try:
            nome_arquivo = input("Informe caminho e nome do arquivo base:")
            leitor = open(nome_arquivo, "r", encoding='utf8')
            for linha in leitor:
                vetor_linha = linha.split(";")
                alunos.append(int(linha))

            leitor.close()
        except:
            print("Arquivo inexistente ou problema de leitura.. Digite novamente\n")
            Util.ler_arquivo_popular_lista(alunos)

    @staticmethod
    def pesquisa_binaria(self, valor):
        start_time = time.time()
        init = 0
        end = len(self) - 1
        while (init <= end):
            mid = int((init+end)/2)
            if (valor == self[mid]):
                return True
            if (valor < self[mid]):
                end = mid - 1
            else:
                init = mid + 1
        print("--- %s Achou seconds ---" % (time.time() - start_time))
