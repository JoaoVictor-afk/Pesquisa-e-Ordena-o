import time

start_time = time.time()


class Ordenacao:
    @staticmethod
    def bolha(lista):
        start_time = time.time()
        houve_troca = True
        while houve_troca:
            houve_troca = False
            for i in range(0, len(lista) - 1):
                if lista[i] > lista[i + 1]:
                    houve_troca = True
                    tmp = lista[i]
                    lista[i] = lista[i + 1]
                    lista[i + 1] = tmp
        print("--- %s seconds ---" % (time.time() - start_time))

    @staticmethod
    def select(lista):
        start_time = time.time()

        for i in range(0, len(lista) - 1):
            minx = i
            for j in range(i + 1, len(lista)):
                if lista[j] < lista[minx]:
                    minx = j
            (lista[i], lista[minx]) = (lista[minx], lista[i])
        print("--- %s seconds ---" % (time.time() - start_time))

    def insert(lista):
        start_time = time.time()

        for i in range(1, len(lista)):
            tmp = lista[i]
            j = i - 1

            while j >= 0 and tmp < lista[j]:
                lista[j + 1] = lista[j]
                j = j - 1

            lista[j + 1] = tmp
        print("--- %s seconds ---" % (time.time() - start_time))

    def shell(lista):
        dist = 1
        sizeReference=3
        start_time = time.time()
        while (dist <  len(lista)):
            dist=sizeReference* dist+1
        
        
        while (dist > 1):
            dist = int(float(dist / sizeReference))


        for i in range(1, len(lista)):
            tmp = lista[i]
            j = i - dist

            while j >= 0 and tmp < lista[j]:
                lista[j + dist] = lista[j]
                j = j - dist

            lista[j + dist] = tmp
        print("--- %s seconds shell ---" % (time.time() - start_time))

    def sortpy(lista):
        start_time = time.time()
        lista.sort()
        print("--- %s seconds ---" % (time.time() - start_time))

    def pente(self):
        start_time = time.time()
        houve_troca = True
        distancia = len(self)
        while houve_troca and distancia > 1:
            distancia = int(float(distancia / 1.3))
            if distancia < 1:
                distancia = 1
            houve_troca = False

            for i in range(0, len(self) - distancia):
                if self[i] > self[i + distancia]:
                    houve_troca = True
                    tmp = self[i]
                    self[i] = self[i + distancia]
                    self[i + distancia] = tmp
        print("--- %s seconds ---" % (time.time() - start_time))
