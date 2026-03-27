public class Main {

    public static void main(String[] args) {

        // TESTE: Ventoinha
        System.out.println("===== VENTOINHA =====");
        Ventoinha v = new Ventoinha();
        System.out.println(v);

        v.ligar();
        v.setVelocidadeVentoinha(Velocidade.ALTA);
        System.out.println("Ventoinha ligada? " + v.ventoinhaLigada());
        System.out.println("Velocidade: " + v.getVelocidadeVentoinha());
        System.out.println(v);

        v.desligar();
        System.out.println(v);

        //---------------------------------------------------------------------------------------//

        // TESTE: Aquecedor
        System.out.println("\n===== AQUECEDOR =====");
        Aquecedor a = new Aquecedor();
        System.out.println(a);

        a.ligar();
        a.setVelocidadeVentoinha(Velocidade.MEDIA);
        a.ligarAquecimento();
        a.setPotenciaResistencia(Velocidade.ALTA);
        System.out.println("Resistência ligada? " + a.resistenciaLigada());
        System.out.println("Potência: " + a.getPotenciaResistencia());
        System.out.println(a);

        a.desligarAquecimento();
        a.desligar();
        System.out.println(a);

        //---------------------------------------------------------------------------------------//

        // TESTE: Climatizador
        System.out.println("\n===== CLIMATIZADOR =====");
        Climatizador c = new Climatizador();
        System.out.println(c);

        c.ligar();
        c.setVelocidadeVentoinha(Velocidade.MEDIA);

        // Liga aquecimento → refrigeração deve ficar desligada
        c.ligarAquecimento();
        c.setPotenciaResistencia(Velocidade.MEDIA);
        System.out.println(c);

        // Liga refrigeração → aquecimento deve desligar
        c.ligarRefrigeracao();
        c.setPotenciaRefrigerador(Velocidade.ALTA);
        System.out.println("Refrigeração ligada? " + c.refrigeracaoLigada());
        System.out.println("Resistência ligada? " + c.resistenciaLigada());
        System.out.println(c);

        // Desliga refrigeração
        c.desligarRefrigeracao();
        c.desligar();
        System.out.println(c);
    }
}