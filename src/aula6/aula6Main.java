import aula6.Cliente;

void main() {
    ArrayList<Cliente> clientes = new ArrayList<>();

    boolean desejaSair = false;

    while (!desejaSair) {
        int opcaoEscolhdida = menu();

        switch (opcaoEscolhdida) {
            case 1:
                //
                break;
            case 2:
                //
                break;
            case 5:
                desejaSair = true;
        }
        
    }
}

public int menu() {
    System.out.println("Digite uma das opcoes abaixo: ");
    System.out.println("1 = Adicionar novo cliente");
    System.out.println("2 = Listar clientes");
    System.out.println("3 = Remover cliente");
    System.out.println("4 = Editar cliente");
    System.out.println("5 = Sair");

    int opcaoEscolhida = Integer.parseInt(IO.readln());
    return opcaoEscolhida;
}
