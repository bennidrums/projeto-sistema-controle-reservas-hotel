public class Reserva {

    private String nomeCliente;
    private String tipoQuarto;
    private int quantidadeDiasReserva;
    private double precoReserva;

    public Reserva (String nomeCliente, String tipoQuarto, int quantidadeDiasReserva, double precoReserva) {
        this.nomeCliente = nomeCliente;
        this.tipoQuarto = tipoQuarto;
        this.quantidadeDiasReserva = quantidadeDiasReserva;
        this.precoReserva = precoReserva;
    }

    public double calcularValorTotal(){
        double total = quantidadeDiasReserva * precoReserva;
        return total;
    }
    //getters
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getTipoQuarto() {
        return tipoQuarto;
    }
    public int getQuantidadeDiasReserva() {
        return quantidadeDiasReserva;
    }
    public double getPrecoReserva() {
        return precoReserva;
    }
    //setters
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }
    public void setQuantidadeDiasReserva(int quantidadeDiasReserva) {
        this.quantidadeDiasReserva = quantidadeDiasReserva;
    }
    public void setPrecoReserva(double precoReserva) {
        this.precoReserva = precoReserva;
    }

    @Override
    public String toString() {
        return "\nNome: " + nomeCliente
                + "\nQuarto: " + tipoQuarto
                + "\nDias: " + quantidadeDiasReserva
                + "\nValor da diária: R$ " + precoReserva
                + "\nValor total: R$ " + calcularValorTotal();
    }

}