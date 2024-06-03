package PatronesComportamentales.Interpreter.Model;

public class AddDonacionExpression implements Expression {
    private String tipo;

    public AddDonacionExpression(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void interpret(Context context) {
        switch (tipo.toLowerCase()) {
            case "ropa":
                context.agregarDonacion(new DonacionRopa("descripcion"));
                break;
            case "alimentos":
                context.agregarDonacion(new DonacionAlimentos("descripcion"));
                break;
            default:
                System.out.println("Tipo de donación desconocido: " + tipo);
        }
    }
}