package br.uniesp.poo;

public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto(1254, "produto1", 55, 30, false);
        Vendedor vendedor1 = new Vendedor(2425, "Vendedor1", "Rua Pintor Manoel Bandeira, 2465");
        Venda venda1 = new Venda();
        venda1.setProduto(produto1);
        venda1.setVendedor(vendedor1);
        venda1.setQuantidadeItens(2);
        venda1.calcularValor();
        venda1.calcularComissao();
        venda1.imprimir();

        Produto produto2 = new Produto(1256, "produto2", 100, 80, true);
        Vendedor vendedor2 = new Vendedor(2427, "Vendedor2", "Rua Ariano Suassuna, 2465");
        Venda venda2 = new Venda();
        venda2.setProduto(produto2);
        venda2.setVendedor(vendedor2);
        venda2.setQuantidadeItens(3);
        venda2.efetuarDesconto(0.10);
        venda2.calcularValor();
        venda2.calcularComissao();
        venda2.imprimir();

        Venda venda3 = new Venda();
        venda3.setProduto(produto2);
        venda3.setVendedor(vendedor2);
        venda3.setQuantidadeItens(2);
        venda3.efetuarDesconto(0.30);
        venda3.calcularValor();
        venda3.calcularComissao();
        venda3.imprimir();

    }
}







