void main() {
    Integer idade = new Integer(1);
    modificarIdade(idade);
    System.out.println(idade);

}

public int modificarIdade(Integer idade) {
    idade = 21;
    return idade;
}
