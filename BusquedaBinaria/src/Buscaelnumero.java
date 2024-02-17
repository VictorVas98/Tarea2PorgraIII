public class Buscaelnumero {
    public static void buscarNumero(){
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
        int elementoABuscar = 14;

        int resultadoBinario = Busqueda.busquedaBinaria(arreglo, elementoABuscar);
        if (resultadoBinario != -1)
            System.out.println("El numero " + elementoABuscar + " se encuentra en la posición " + resultadoBinario + " utilizando la búsqueda binaria.");
        else
            System.out.println("El numero " + elementoABuscar + " no se encontro utilizando búsqueda binaria.");



        int resultadoSecuencial = Busqueda.busquedaSecuencial(arreglo, elementoABuscar);
        if (resultadoSecuencial != -1)
            System.out.println("El numero " + elementoABuscar + " se encuentra en la posición " + resultadoSecuencial + " utilizando la búsqueda secuencial.");
        else
            System.out.println("El numero " + elementoABuscar + " no se encontro utilizando búsqueda secuencial.");
    }
}
