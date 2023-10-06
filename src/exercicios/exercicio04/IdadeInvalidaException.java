package exercicios.exercicio04;

public class IdadeInvalidaException extends RuntimeException { // unchecked

    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }

}
