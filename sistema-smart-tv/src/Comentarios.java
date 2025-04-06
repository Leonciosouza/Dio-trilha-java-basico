
public class Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário de uma linha.

         /*
     * Olá,
     * Eu sou um comentário,
     * que posso ser mais detalhadod
     * quando necessário,
     */
    }
    
    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível !!!
     */
        public void metodo() {

        }

    /**
     * Este método foi elaborado as pressas
     * por isso eu abrevei o nome das variáveis.
     * mas olha, ele tem a finalidade somar ou multiplicar
     * dois números.
     *       
     */    

    public int somaMultiplica (int n, int x, String m) {
        int r = 0; // r é igual ao resultado da soma.
        if (m == "M") { // M= multiplicação.
            r = n * x; // r é igual a n multiplicado por x.
        } else {
            // Se não soma mesmo.
            r = n + x; // r é igual a n mais x.
        }
        return r; // retorna o resultado da soma.
        } 

    }    

