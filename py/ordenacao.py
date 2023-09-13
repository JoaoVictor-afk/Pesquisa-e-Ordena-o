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

    def shell(self):
        dist = 1
        sizeReference = 3
        start_time = time.time()
        while (dist < len(self)):
            dist = sizeReference * dist+1

        while (dist > 1):
            dist = int(float(dist / sizeReference))

        for i in range(1, len(self)):
            tmp = self[i]
            j = i - dist

            while j >= 0 and tmp < self[j]:
                self[j + dist] = self[j]
                j = j - dist

            self[j + dist] = tmp
        print("--- %s seconds shell ---" % (time.time() - start_time))

    def sortpy(self):
        start_time = time.time()
        self.sort()
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

    def partition(self, low, high):

            # choose the rightmost element as pivot
            pivot = self[high]

            # pointer for greater element
            i = low - 1

            # traverse through all elements
            # compare each element with pivot
            for j in range(low, high):
                if self[j] <= pivot:
                    # if element smaller than pivot is found
                    # swap it with the greater element pointed by i
                    i = i + 1

                    # swapping element at i with element at j
                    (self[i], self[j]) = (self[j], self[i])

            # swap the pivot element with the greater element specified by i
            (self[i + 1], self[high]) = (self[high], self[i + 1])

            # return the position from where partition is done
            return i + 1

        # function to perform quicksort
    def quickSort(self, low, high):
            if low < high:

                # find pivot element such that
                # element smaller than pivot are on the left
                # element greater than pivot are on the right
                pi = Ordenacao.partition(self, low, high)

                # recursive call on the left of pivot
                Ordenacao.quickSort(self, low, pi - 1)

                # recursive call on the right of pivot
                Ordenacao.quickSort(self, pi + 1, high)

    def quicksort(self):
            if len(self) <= 1:
                return self
            else:
                pivot = self[0]
                left = [x for x in self[1:] if x < pivot]
                right = [x for x in self[1:] if x >= pivot]
                return Ordenacao.quicksort(left) + [pivot] + Ordenacao.quicksort(right)
            print("--- %s seconds ---" % (time.time() - start_time))
