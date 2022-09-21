public class MediaMes {

    private Integer idMes;
    private String mes;
    private Integer temperaturaMedia;
    

    public MediaMes(Integer idMes, String mes, Integer temperaturaMedia) {
        this.idMes = idMes;
        this.mes = mes;
        this.temperaturaMedia = temperaturaMedia;
    }

    public Integer getIdMes() {
        return idMes;
    }

    public String getMes() {
        return mes;
    }

    public Integer getTemperaturaMedia() {
        return temperaturaMedia;
    }

    @Override
    public String toString() {
        return "MediaMes{" +
                "idMes=" + idMes +
                ", mes='" + mes + '\'' +
                ", temperaturaMedia=" + temperaturaMedia +
                '}';
    }
}
