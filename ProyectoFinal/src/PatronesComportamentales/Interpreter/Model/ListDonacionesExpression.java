package PatronesComportamentales.Interpreter.Model;

public class ListDonacionesExpression implements Expression {
    @Override
    public void interpret(Context context) {
        context.listarDonaciones();
    }
}