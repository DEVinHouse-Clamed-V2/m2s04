package aula02.exceptions;

public class MainChecked {

    public static void main(String[] args) {

        Integer nota = 10;
        Integer adicional = 2;

        try {
            Integer notaFinal = calcularNota(nota, adicional);
            if (notaFinal == null)
                System.out.println("Passou de 10");
            System.out.println("Nota final " + notaFinal);
        } catch (NotaExcedidaException e) {
            System.out.println("A nota do aluno ficou superior a 10, favor reavaliar");
        }

    }

    private static Integer calcularNota(Integer nota, Integer adicional) throws NotaExcedidaException {
        Integer resultado = nota + adicional;
        if (resultado > 10)
            throw new NotaExcedidaException();  // checked
        else if (resultado < 0)
            throw new NotaMenorQueZeroException(); // unchecked

        return resultado;
    }

}
