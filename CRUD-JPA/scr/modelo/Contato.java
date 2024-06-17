import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "contatos")
public class Contato{
  @Id
  @GeneredValue(strategy = GeneratedType.IDENTITY)
  private Long id;
  
  private String tipo;
  
  private String numero;

  @OneToMany
  private List<Pessoa> pessoas = new ArrayList<>();

  public Contato(){
  }

  public Contato(String tipo, String numero){
    this.tipo = tipo;
    this.numero = numero;
  }

  public Long getId(){
    return id;
  }

  public void setId(Long id){
    this.id = id;
  }

  public String getTipo(){
    return tipo;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getNumero(){
    return numero;
  }

  public void setNumero(String numero){
    this.numero = numero;
  }
}
