import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int saida = 1;
        Scanner ler = new Scanner(System.in);
        while (saida != 0) {
            System.out.println("Seja bem vindo ao Sistema de Fórmulas de Física:");
            System.out.println("\n");
            System.out.println("Escolha a fórmula que gostaria pela númeração ->");
            int opcao;
            System.out.println("1. Movimento retilíneo uniforme (s = s0 + v . ∆t)");
            System.out.println("2. Movimento retilíneo uniformemente variado (V = v0 + a . t)");
            System.out.println("3. Segunda Lei de Newton (Fr = m . a)");
            System.out.println("4. Força Peso (P = m . g)");
            System.out.println("5. Força de atrito (Fat = µ . N)");
            System.out.println("6. Quantidade de movimento (Q = m . v)");
            System.out.println("7. Força do Impulso (I = F . ∆t)");
            System.out.println("8. Pressão (P = F / A)");
            System.out.println("9. Fahrenheit para Celsius (TºC / 5 = TºF - 32 / 9)");
            System.out.println("10. Kelvin para Celsius (TºK = TºC + 273)");
            System.out.println("11. Capacidade Térmica (C = Q / ∆T)");
            System.out.println("12. Calor sensível (Q = m . c . ∆T)");
            System.out.println("13. Calor Latente (Q = m . L)");
            System.out.println("14. Velocidade de propagação de uma onda (V = ƛ . f)");
            System.out.println("15. Diferença de potêncial (U = R . i)");

            System.out.println("Caso deseje sair do sistema, digite 0.");
            opcao = ler.nextInt();
            int escolha;
            switch (opcao) {
                case 1:
                    System.out.println("\n");
                    System.out.println(
                            "O movimento Retilínio uniforme é o movimento que ocorre com velocidade constante em uma trajetória reta.");
                    System.out.println("S = s0 + v . ∆t");
                    System.out.println("S: Posição final(m)");
                    System.out.println("s0: Posição inicial(m)");
                    System.out.println("v: Velocidade(m/s)");
                    System.out.println("∆t: Intervalo de tempo(s)");
                    double S;
                    double si;
                    double v;
                    double ti;
                    double tf;

                    System.out.println("\n");
                    System.out.println("Qual sua posição inicial em metros?");
                    si = ler.nextDouble();
                    System.out.println("Qual sua velocidade em metros por segundo?");
                    v = ler.nextDouble();
                    System.out.println("Qual o seu tempo inicial?");
                    ti = ler.nextDouble();
                    System.out.println("Qual o seu tempo final?");
                    tf = ler.nextDouble();
                    S = si + v * (tf - ti);

                    System.out.println("\n");
                    System.out.println("Resultado: S = " + S);
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println(
                            "O movimento Retilíneo Uniformemente Variado é um movimento em linha reta onde a velocidade varia de forma constante ao longo do tempo.");
                    System.out.println("V = v0 + a . t");
                    System.out.println("V: Velocidade final(m/s)");
                    System.out.println("v0: Velocidade inicial(m/s)");
                    System.out.println("a: Aceleração(m/s²)");
                    System.out.println("t: tempo(s)");
                    Double V;
                    Double vi;
                    Double a;
                    Double t;

                    System.out.println("\n");
                    System.out.println("Qual valor você deseja descobrir (Digite seu índice)?");
                    System.out.println("1. Velocidade final(m/s)");
                    System.out.println("2. Velocidade inicial(m/s)");
                    System.out.println("3. Aceleração(m/s²)");
                    System.out.println("4. tempo(s)");
                    escolha = ler.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("Qual a sua velocidade inicial em metros por segundo?");
                            vi = ler.nextDouble();
                            System.out.println("Qual a sua aceleração?");
                            a = ler.nextDouble();
                            System.out.println("Qual o tempo?");
                            t = ler.nextDouble();
                            V = vi + a * t;
                            System.out.println("\n");
                            System.out.println("Resultado: Velocidade final = " + V);
                            break;

                        case 2:
                            System.out.println("Qual o valor da velocidade final em metros por segundo?");
                            V = ler.nextDouble();
                            System.out.println("Qual a sua aceleração?");
                            a = ler.nextDouble();
                            System.out.println("Qual o tempo?");
                            t = ler.nextDouble();
                            vi = V - (a * t);
                            System.out.println("\n");
                            System.out.println("Resultado Velocidade inicial = " + vi);
                            break;

                        case 3:
                            System.out.println("Qual o valor da velocidade final em metros por segundo?");
                            V = ler.nextDouble();
                            System.out.println("Qual a sua velocidade inicial em metros por segundo?");
                            vi = ler.nextDouble();
                            System.out.println("Qual o tempo?");
                            t = ler.nextDouble();
                            a = (V - vi) / t;
                            System.out.println("\n");
                            System.out.println("Resultado Aceleração: " + a);
                            break;

                        case 4:
                            System.out.println("Qual o valor da velocidade final em metros por segundo?");
                            V = ler.nextDouble();
                            System.out.println("Qual a sua velocidade inicial em metros por segundo?");
                            vi = ler.nextDouble();
                            System.out.println("Qual a sua aceleração?");
                            a = ler.nextDouble();
                            t = (V - vi) / a;
                            System.out.println("\n");
                            System.out.println("Resultado Tempo: " + t);
                            break;
                        default:
                        System.out.println("Escolha somente um valor!");
                            break;
                    }
                    
                    break;

                case 3:
                    System.out.println("\n");
                    System.out.println(
                            "A Segunda Lei de Newton estabelece que a aceleração adquirida por um corpo é diretamente proporcional a resultante das forças que atuam sobre ele.");
                    System.out.println("Fr = m . a");
                    System.out.println("Fr: Força resultante(N)");
                    System.out.println("m: Massa(kg)");
                    System.out.println("a: Aceleração(m/s²)");
                    double Fr;
                    double m;

                    System.out.println("\n");
                    System.out.println("Qual a massa em kilogramas?");
                    m = ler.nextDouble();
                    System.out.println("Qual a sua aceleração?");
                    a = ler.nextDouble();
                    Fr = m * a;

                    System.out.println("\n");
                    System.out.println("Resultado: Fr = " + Fr);
                    break;

                case 4:
                    System.out.println("\n");
                    System.out.println("Força que atua na direção vertical sob a atração da gravitação da Terra.");
                    System.out.println("P = m . g");
                    System.out.println("P: Peso(N)");
                    System.out.println("m: Massa(kg)");
                    System.out.println("g: aceleração da gravidade(m/s²)");
                    double Peso;
                    double gravidade = 9.8;

                    System.out.println("\n");
                    System.out.println("Qual a massa em kilogramas?");
                    m = ler.nextDouble();
                    System.out.println("A aceleração gravitacional é de 9,8 m/s²");
                    Peso = m * gravidade;

                    System.out.println("\n");
                    System.out.println("Resultado: Peso = " + Peso);
                    break;

                case 5:
                    System.out.println("\n");
                    System.out.println(
                            "Força exercida entre duas superfícies que estão em contato, sendo uma força de oposição à tendência do escorregamento.");
                    System.out.println("Fat = µ . N");
                    System.out.println("Fat: Força de atrito(N)");
                    System.out.println("µ: Coeficiente de atrito");
                    System.out.println("N: Força normal(N)");
                    double atrito;
                    double Fat;
                    double forcaN;

                    System.out.println("\n");
                    System.out.println("Qual o coeficiente de atrito?");
                    atrito = ler.nextDouble();
                    System.out.println("Qual o valor da força normal?");
                    forcaN = ler.nextDouble();
                    Fat = atrito * forcaN;

                    System.out.println("\n");
                    System.out.println("Resultado: Fat = " + Fat);
                    break;

                case 6:
                    System.out.println("\n");
                    System.out.println(
                            "Momento linear é uma grandeza vetorial definida como o produto da massa de um corpo pela sua velocidade.");
                    System.out.println("Q = m . v");
                    System.out.println("Q: Quantidade de movimento (kg.m/s)");
                    System.out.println("m: Massa (kg)");
                    System.out.println("v: Velocidade (m/s)");
                    double quantMovimento;
                    double velocidade;

                    System.out.println("\n");
                    System.out.println("Qual a massa do corpo?");
                    m = ler.nextDouble();
                    System.out.println("Qual a velocidade?");
                    velocidade = ler.nextDouble();
                    quantMovimento = m * velocidade;

                    System.out.println("\n");
                    System.out.println("Resultado: Q = " + quantMovimento);
                    break;

                case 7:
                    System.out.println("\n");
                    System.out.println(
                            "Grandeza vetorial que mede os efeitos de uma força sobre um corpo em um intervalo de tempo.");
                    System.out.println("I = F . ∆t");
                    System.out.println("I: Impulso (N.s)");
                    System.out.println("f: Força (N)");
                    System.out.println("∆t: Intervalo de tempo (s)");
                    double forca;
                    double Imp;

                    System.out.println("\n");
                    System.out.println("Qual a força em newtons?");
                    forca = ler.nextDouble();
                    System.out.println("Qual o tempo inicial em segundos?");
                    ti = ler.nextDouble();
                    System.out.println("Qual o tempo final em segundos?");
                    tf = ler.nextDouble();
                    Imp = forca * (tf - ti);

                    System.out.println("\n");
                    System.out.println("Resultado: Impulso = " + Imp);
                    break;

                case 8:
                    System.out.println("\n");
                    System.out.println(
                            "Grandeza escalar definida como o módulo da força aplicada dividida por unidades de área.");
                    System.out.println("P = F / A");
                    System.out.println("P: Pressão (N / m²)");
                    System.out.println("F: Força (N)");
                    System.out.println("A: Área (m²)");
                    double pressao;
                    double area;

                    System.out.println("\n");
                    System.out.println("Qual a força aplicada em newtons?");
                    forca = ler.nextDouble();
                    System.out.println("Qual a área em metros quadrados?");
                    area = ler.nextDouble();
                    pressao = forca / area;

                    System.out.println("\n");
                    System.out.println("Resultado: Pressão = " + pressao);
                    break;

                case 9:
                    System.out.println("\n");
                    System.out.println(
                            "Transformação da Escala Fahrenheit para a Escala Celsius.");
                    System.out.println("TºC / 5 = TºF - 32 / 9");
                    System.out.println("TºC = Temperatura em graus Celsius");
                    System.out.println("TºF = Temperatura em graus Fahrenheit");
                    double tempC;
                    double tempF;

                    System.out.println("\n");
                    System.out.println("Qual a temperatura em graus Fahrenheit?");
                    tempF = ler.nextDouble();
                    tempC = (tempF - 32) * 5 / 9;

                    System.out.println("\n");
                    System.out.println("Resultado: Temperatura em Celsius = " + tempC);
                    break;

                case 10:
                    System.out.println("\n");
                    System.out.println(
                            "Transformação da Escala Kelvin para a Escala Celsius.");
                    System.out.println("TºK = TºC + 273");
                    System.out.println("TºK = Temperatura em graus Kelvin");
                    System.out.println("TºC = Temperatura em graus Celsius");
                    double tempK;

                    System.out.println("\n");
                    System.out.println("Qual a temperatura em graus Kelvin?");
                    tempK = ler.nextDouble();
                    tempC = tempK - 273;

                    System.out.println("\n");
                    System.out.println("Resultado: Temperatura em Celsius = " + tempC);
                    break;

                case 11:
                    System.out.println("\n");
                    System.out.println(
                            "Grandeza que corresponde a quantidade de calor presente num corpo em relação à variação de temperatura sofrida por ele.");
                    System.out.println("C = Q / ∆T");
                    System.out.println("C: Capacidade térmica (cal/ºC)");
                    System.out.println("Q = Quantidade de calor (cal)");
                    System.out.println("∆T = Variação de temperatura (ºC)");
                    double capacidadeT;
                    double cal;
                    double tempI;

                    System.out.println("\n");
                    System.out.println("Qual a quantidade de calor presente em calorias?");
                    cal = ler.nextDouble();
                    System.out.println("Qual a temperatura inicial em Celsius?");
                    tempI = ler.nextDouble();
                    System.out.println("Qual a temperatura final em Celsius?");
                    tempF = ler.nextDouble();
                    capacidadeT = cal / (tempF - tempI);

                    System.out.println("\n");
                    System.out.println("Resultado: Capacidade Térmica = " + capacidadeT);
                    break;

                case 12:
                    System.out.println("\n");
                    System.out.println(
                            "Grandeza física que está relacionada com a variação da temperatura de um corpo, sem mudança de estado físico.");
                    System.out.println("Q = m . c . ∆T");
                    System.out.println("Q: Calor sensível (cal)");
                    System.out.println("m: Massa (g)");
                    System.out.println("c: Calor específico (cal/gºC)");
                    System.out.println("∆T = Variação de temperatura (ºC)");
                    double calorSensivel;
                    double calorEsp;

                    System.out.println("\n");
                    System.out.println("Qual a massa em gramas?");
                    m = ler.nextDouble();
                    System.out.println("Qual o calor específico?");
                    calorEsp = ler.nextDouble();
                    System.out.println("Qual a temperatura inicial em Celsius?");
                    tempI = ler.nextDouble();
                    System.out.println("Qual a temperatura final em Celsius?");
                    tempF = ler.nextDouble();
                    calorSensivel = m * calorEsp * (tempF - tempI);

                    System.out.println("\n");
                    System.out.println("Resultado: Calor sensível = " + calorSensivel);
                    break;

                case 13:
                    System.out.println("\n");
                    System.out.println(
                            "Grandeza física que designa a quantidade de calor recebida ou cedida por um corpo enquanto seu estado físico se modifica.");
                    System.out.println("Q = m . L");
                    System.out.println("Q: Calor (cal)");
                    System.out.println("m: Massa (g)");
                    System.out.println("L: Calor latente (cal/g)");
                    double Calor;
                    double latente;

                    System.out.println("\n");
                    System.out.println("Qual a massa em gramas?");
                    m = ler.nextDouble();
                    System.out.println("Qual o calor latente?");
                    latente = ler.nextDouble();
                    Calor = m * latente;

                    System.out.println("\n");
                    System.out.println("Resultado: Calor = " + Calor);
                    break;

                case 14:
                    System.out.println("\n");
                    System.out.println(
                            "Velocidade que uma onda sonora leva para se propagar em uma meio sólido, líquido ou gasoso.");
                    System.out.println("V = ƛ . f");
                    System.out.println("V: Velocidade de propagação de uma onda (m/s)");
                    System.out.println("ƛ: Comprimento de onda (m)");
                    System.out.println("f: Frequência (Hz)");
                    double velOnda;
                    double compOnda;
                    double freq;

                    System.out.println("\n");
                    System.out.println("Qual o comprimento de onda em metros?");
                    compOnda = ler.nextDouble();
                    System.out.println("Qual a frequência em Hertz?");
                    freq = ler.nextDouble();
                    velOnda = compOnda * freq;

                    System.out.println("\n");
                    System.out.println("Resultado: Velocidade da onda = " + velOnda);
                    break;

                case 15:
                    System.out.println("\n");
                    System.out.println(
                            "A Primeira Lei de Ohm postula que um condutor ôhmico mantido à temperatura constante, a intensidade de corrente elétrica será proporcional à diferença de potencial aplicada entre suas extremidades.");
                    System.out.println("U = R . i");
                    System.out.println("U: Diferença de potencial (V)");
                    System.out.println("R: Resistência elétrica (Ω)");
                    System.out.println("i: Corrente (A)");
                    double ddp;
                    double resist;
                    double corrente;

                    System.out.println("\n");
                    System.out.println("Qual a resistência elétrica em ohm's?");
                    resist = ler.nextDouble();
                    System.out.println("Qual a corrente em ampéres?");
                    corrente = ler.nextDouble();
                    ddp = resist * corrente;

                    System.out.println("\n");
                    System.out.println("Resultado: Diferença de potencial = " + ddp);
                    break;

                case 0:
                    saida = 0;
                    break;
                default:
                    System.out.println("Escreva um valor válido!!!");
                    break;
            }

        }
        ler.close();
        System.out.println("Obrigado por utilizar nosso sistema!");
    }
}