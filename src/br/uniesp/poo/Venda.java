package br.uniesp.poo;

public class Venda {
    private Produto produto;
    private Vendedor vendedor;
    private double desconto;
    private int quantidadeItens;
    private double valor;

    public void calcularValor() {

        if ((produto.getValorVenda() - desconto) < produto.getValorCusto()) {
            this.valor = produto.getValorCusto() * quantidadeItens;
        } else {
            this.valor = (produto.getValorVenda() - desconto) * quantidadeItens;
        }

    }

    public void calcularComissao() {
        var comissao = valor * vendedor.PORCENTAGEM_COMISSAO;

        if (getProduto().isPromocao()) {
            this.vendedor.setComissao(comissao / 2);
        } else {
            this.vendedor.setComissao(comissao);
        }

    }

    public void efetuarDesconto(double porcentagemDesconto) {
        this.desconto = produto.getValorVenda() * porcentagemDesconto;
    }

    public void imprimir() {
        System.out.println("Codigo Vendedor: " + vendedor.getCodigo());
        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Comissao do vendedor: " + vendedor.getComissao());
        System.out.println("Quantidade Itens Vendidos: " + quantidadeItens);
        System.out.println("Código do produto: " + produto.getCodigo());
        System.out.println("Descrição do produto: " + produto.getDescricao());
        System.out.println("Valor do produto: " + produto.getValorVenda());

        if (produto.isPromocao()) {
            System.out.println("Produto em promoção");
        } else {
            System.out.println("Produto não está na promoção");
        }

        System.out.println("Valor do desconto sobre produto: " + desconto);
        System.out.println("Valor total da venda: " + valor);

        System.out.println();

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
