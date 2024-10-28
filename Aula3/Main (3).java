
public class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("João", 25);
    Pessoa pessoa2 = new Pessoa("João", 25);
    Pessoa pessoa3 = new Pessoa("Maria", 30);

    System.out.println("pessoa1 é igual a pessoa2? " + pessoa1.equals(pessoa2)); // true
    System.out.println("pessoa1 é igual a pessoa3? " + pessoa1.equals(pessoa3)); // false
  }
}