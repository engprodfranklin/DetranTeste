/**
 *
 * @author Franklin
 *
 */
public class Veiculo implements Condutor, Infracoes{
	private String placa;
    private String modelo;
    private String marca;
    private String nome;
    private int cnh;
    private String tipoCnh;
    private int multas;
   
    public Veiculo(){}
    
    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
//Interface de Condutor
    @Override
    public String getNome() {
       return this.nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int getCnh() {
        return this.cnh;
    }
    @Override
    public void setCnh(int cnh) {
        this.cnh = cnh;
    }
    @Override
    public String getTipoCnh() {
        return this.tipoCnh;
    }
    @Override
    public void setTipoCnh(String tipoCnh) {
        this.tipoCnh = tipoCnh;
    }
    
//Interface de Infrações
    @Override
    public void setMultas(int multas) {
        this.multas = multas;
    }

    @Override
    public String getMultas() {
        String infracao = "";
      
        switch (this.multas) {
            case 0:
                infracao = "Você não possui multas";
                break;
            case 1:
                infracao = "Leve";
                break;
            case 2:
                infracao = "Moderada";
                break;
            case 3:
                infracao = "Grave";
                break;   
            case 4:
                infracao = "Gravíssima";
                break; 
            default:
                
        }
        return infracao;   
    }
}
