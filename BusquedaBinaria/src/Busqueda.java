public class Busqueda{
        public static int busquedaBinaria(int[] arr, int elemento) {
            int izquierda = 0;
            int derecha = arr.length - 1;

            while (izquierda <= derecha) {
                int medio = izquierda + (derecha - izquierda) / 2;

                if (arr[medio] == elemento)
                    return medio;

                if (arr[medio] < elemento)
                    izquierda = medio + 1;
                else
                    derecha = medio - 1;
            }

            return -1;
        }

        public static int busquedaSecuencial(int[] arr, int elemento) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == elemento)
                    return i;
            }
            return -1;
        }
    }
