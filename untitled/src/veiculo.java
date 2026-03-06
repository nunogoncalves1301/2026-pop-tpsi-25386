 class Veiculo {

     //Atributos//
     private String marca;
     private String modelo;
     private int ano;
     private double preco;

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public String getMarca() {
         return marca;
     }

     public void setModelo(String modelo) {
         this.modelo = modelo;
     }

     public String getModelo() {
         return modelo;
     }

     public void setAno(int ano) {
         this.ano = ano;
     }

     public int getAno() {
         return ano;
     }

     public void setPreco(double preco) {
         this.preco = preco;
     }

     public double getPreco() {
         return preco;
     }

     public double getPrecoVeiculo(int anoAtual) {
        // definir variaveis
        double desconto = 0;
        int diferencaAnos = anoAtual - this.ano;
        double taxa = 0.03;

        // calcular o desconto com base nos anos que passaram
        desconto = (diferencaAnos * taxa)*preco;

         // devolver o valor com o desconto
         return preco - desconto;
     }

     public String apresentar() {
         return "Marca: " + marca +
                 " \nModelo: " + modelo +
                 " \nAno: " + ano +
                 " \nPreço: " + preco +
                 " \nPreço desconto: " + getPrecoVeiculo(2026);
     }
 }

