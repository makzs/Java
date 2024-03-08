public class bubblesort {
    
    public static void main(String[] args)
    {
        System.out.println("Ordenação por bubble sort");

        int lista[] = {12, 20, 44, 8, 67, 55, 1, 90, 71, 23};

        for (int i = 0; i < lista.length - 1; i++)
        {
            for (int j = 0; j < lista.length - i - 1; j++)
            {
                if (lista[j] > lista[j + 1])
                {
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] =  temp;
                }
            }
        }

        for (int i = 0; i < lista.length; i++)
        {
            System.out.println(lista[i]);
        }
    }

}
