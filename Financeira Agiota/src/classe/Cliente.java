package classe;
/**
 *
 * @author Leonardo Lima
 */

public class Cliente {
    // atributos
    private String nome;
    private String usuario;
    private String email;
    private String sexo;
    private String telefone;
    private String cpf;
    private String estado;
    private String cidade;
    private String rua;
    private String cep;
    private String numero;
    private String senha;
    private String conferirsenha;
    private String cargo;
    
    //set
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public void setSexo (String sexo) {
        this.sexo = sexo;
    }
    
    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }
    
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    
    public void setEstado (String estado) {
        this.estado = estado;
    }
    
    public void setCidade (String cidade) {
        this.cidade = cidade;
    }
    
    public void setRua (String rua) {
        this.rua = rua;
    }
    
    public void setCep (String cep) {
        this.cpf = cpf;
    }
    
    public void setNumero (String numero) {
        this.numero = numero;
    }
    
    public void setSenha (String senha) {
        this.senha = senha;
    }
    
    public void setConferirsenha (String conferirsenha){
        this.conferirsenha = conferirsenha;
    }
    
    public void setCargo (String cargo){
        this.cargo = cargo;
    }
    
    //get
    public String getNome (){
        return nome;
    }
    
    public String getUsuario () {
        return usuario;
    }
    
    public String getEmail () {
        return email;
    }
    
    public String getSexo () {
        return sexo;
    }
    
    public String getTelefone () {
        return telefone;
    }
    
    public String getCpf () {
        return cpf;
    }
    
    public String getEstado () {
        return estado;
    }
    
    public String getCidade () {
        return cidade;
    }
    
    public String getRua () {
        return rua;
    }
    
    public String getCep () {
        return cep;
    }
     
    public String getNumero () {
        return numero;
    }
    
    public String getSenha () {
        return senha;
    }
    
    public String getConferirsenha () {
        return conferirsenha;
    }
    
    public String getCargo () {
        return cargo;
    }
    
    //Criar um método construtor e inicializar os atributos.
    public Cliente (){
        this.nome = "";
        this.usuario = "";
        this.email = "";
        this.sexo = "";
        this.telefone = "";
        this.cpf = "";
        this.estado = "";
        this.cidade = "";
        this.rua = "";
        this.cep = "";
        this.numero = "";
        this.senha = "";
        this.conferirsenha = "";
        this.cargo = "";
    }
    
    public void LimparCliente () {
        this.setNome ("");
        this.setUsuario ("");
        this.setEmail ("");
        this.setSexo ("");
        this.setTelefone ("");
        this.setCpf ("");
        this.setEstado ("");
        this.setCidade ("");
        this.setRua ("");
        this.setCep ("");
        this.setNumero ("");
        this.setSenha ("");
        this.setConferirsenha ("");
        this.setCargo ("");
    }
    
}
