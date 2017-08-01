package edu.mum.cs.asd.lab6.composite;

public class Test {
    public static void main(String[] args) {
        HtmlTag html = new ContainerTag("Html","");
        HtmlTag head = new ContainerTag("Head","");
        HtmlTag title = new LeafTag("Title","Your Title Here");

        html.append(head);
        head.append(title);
        html.print();
    }
}
