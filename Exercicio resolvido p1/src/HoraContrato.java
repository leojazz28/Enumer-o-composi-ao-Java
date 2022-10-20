import java.util.Date;

public class HoraContrato {
    private Date data;
    private Double valorDaHora;
    private Integer hora;

    public HoraContrato() {} // contrutor padrão

    public HoraContrato(Date data, Double valorDaHora, Integer hora ) {
        this.data = data; // Date
        this.valorDaHora = valorDaHora; // Double
        this.hora = hora; // Integer

    }

    public Date getdData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorDaHora() {
        return valorDaHora;
    }

    public void  setValorDaHora(Double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }




}
