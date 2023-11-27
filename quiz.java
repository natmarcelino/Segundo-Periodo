package P2;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acertos = 0;

        cabecalho cabecalho1 = new cabecalho();

        cabecalho.Faculdade = "Faculdade: Faculdade Alfredo Nasser";
        cabecalho.Aluno = "Aluno: Nathalia Marcelino Lima";
        cabecalho.Professor = "Professor: Brenno Pimenta";
        cabecalho.Disciplina = "Disciplina: Algoritmo e Programaçao II";
        cabecalho.Inicio = "Bem-vindo ao Quiz";
        cabecalho1.escrevaCabecalho();


        questoes questoes1 = new questoes();
        questoes1.questoes1 = "1- Quem descobriu o Brasil?";
        questoes1.A = "A) Pedro Alvares Cabral";
        questoes1.B = "B) Vicente Yanez Pizon";
        questoes1.C = "C) Socrates";
        questoes1.D = "D) Santo Agostinho ";
        questoes1.E = "E) Guilherme de Occam";
        questoes1.escrevaquestao();
        questoes1.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        String resposta = sc.nextLine();
        if (questoes1.iscorreta(resposta)) {
            acertos = acertos + 1;
        }
        System.out.println("====================================================================== ");
        questoes questoes2 = new questoes();
        questoes2.questoes1 = "2- Qual a montanha mais alta do mundo?";
        questoes2.A = "A) Mauna Kea";
        questoes2.B = "B) Dhaulagiri";
        questoes2.C = "C) Monte Chimborazo";
        questoes2.D = "D) Monte Everest";
        questoes2.E = "E) Pico de Neblina";
        questoes2.escrevaquestao();
        questoes2.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes2.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes3 = new questoes();
        questoes3.questoes1 = "3- A que temperatura a agua ferve?";
        questoes3.A = "A) 200º";
        questoes3.B = "B) -10º";
        questoes3.C = "C) 180º";
        questoes3.D = "D) 100º";
        questoes3.E = "E) -100º";
        questoes3.escrevaquestao();
        questoes3.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes3.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes4 = new questoes();
        questoes4.questoes1 = "4- Quantos ossos temos no corpo humano?";
        questoes4.A = "A) 126";
        questoes4.B = "B) 206";
        questoes4.C = "C) 18";
        questoes4.D = "D) 300";
        questoes4.E = "E) 200";
        questoes4.escrevaquestao();
        questoes4.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes4.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes5 = new questoes();
        questoes5.questoes1 = "5- Qual o maior planeta do sistema solar?";
        questoes5.A = "A) Marte";
        questoes5.B = "B) Lua";
        questoes5.C = "C) Saturno";
        questoes5.D = "D) Terra";
        questoes5.E = "E) Jupiter";
        questoes5.escrevaquestao();
        questoes5.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes5.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes6 = new questoes();
        questoes6.questoes1 = "6- Quantos continentes existem?";
        questoes6.A = "A) 2";
        questoes6.B = "B) 8";
        questoes6.C = "C) 4";
        questoes6.D = "D) 6";
        questoes6.E = "E) 3";
        questoes6.escrevaquestao();
        questoes6.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes6.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes7 = new questoes();
        questoes7.questoes1 = "7- Quem pintou Mona Lisa?";
        questoes7.A = "A) Leonardo da Vinci";
        questoes7.B = "B) Salvador Dali";
        questoes7.C = "C) Van Gogh";
        questoes7.D = "D) Tarsila do Amaral";
        questoes7.E = "E) Pablo Picasso";
        questoes7.escrevaquestao();
        questoes7.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes7.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes8 = new questoes();
        questoes8.questoes1 = "8- Qual cidade brasileira e conhecida por chover todos os dias quase a mesma hora?";
        questoes8.A = "A) Sao Paulo";
        questoes8.B = "B) Joinville";
        questoes8.C = "C) Belem";
        questoes8.D = "D) Natal";
        questoes8.E = "E) Rio de Janeiro";
        questoes8.escrevaquestao();
        questoes8.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes8.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes9 = new questoes();
        questoes9.questoes1 = "9- Qual o nome popular do cloreto de sodio?";
        questoes9.A = "A) Vinagre";
        questoes9.B = "B) Agua";
        questoes9.C = "C) Papel";
        questoes9.D = "D) Fermento";
        questoes9.E = "E) Sal de cozinha";
        questoes9.escrevaquestao();
        questoes9.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes9.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes10 = new questoes();
        questoes10.questoes1 = "10- Qual fruto nasce da Oliveira?";
        questoes10.A = "A) Amendoa";
        questoes10.B = "B) Abacate";
        questoes10.C = "C) Azeitona";
        questoes10.D = "D) Acai";
        questoes10.E = "E) Acerola";
        questoes10.escrevaquestao();
        questoes10.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes10.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes11 = new questoes();
        questoes11.questoes1 = "11- Qual o plural de Chapeu?";
        questoes11.A = "A) Chapeis";
        questoes11.B = "B) Chapeus";
        questoes11.C = "C) Chapeuzes";
        questoes11.D = "D) Chapuzes";
        questoes11.E = "E) Os chapeu";
        questoes11.escrevaquestao();
        questoes11.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes11.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes12 = new questoes();
        questoes12.questoes1 = "12- Em que religao se localiza o estado Minas Gerais?";
        questoes12.A = "A) Sudoeste";
        questoes12.B = "B) Centro-Oeste";
        questoes12.C = "C) Norte";
        questoes12.D = "D) Sul";
        questoes12.E = "E) Nordeste";
        questoes12.escrevaquestao();
        questoes12.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes12.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes13 = new questoes();
        questoes13.questoes1 = "13- Depois do futebol, qual o esporte mais popular do Brasil?";
        questoes13.A = "A) Esqui";
        questoes13.B = "B) Volei";
        questoes13.C = "C) Hoquei no gelo";
        questoes13.D = "D) Golfe";
        questoes13.E = "E) Esgrima";
        questoes13.escrevaquestao();
        questoes13.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes13.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes14 = new questoes();
        questoes14.questoes1 = "14- Qual a nacionalidade de Napoleao Bonaparte?";
        questoes14.A = "A) Francesa";
        questoes14.B = "B) Brasileira";
        questoes14.C = "C) Mexicana";
        questoes14.D = "D) Japonesa";
        questoes14.E = "E) Egipcio";
        questoes14.escrevaquestao();
        questoes14.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes14.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("====================================================================== ");
        questoes questoes15 = new questoes();
        questoes15.questoes1 = "15- Em que ano foi usado um celualar pela primeira vez no Brasil?";
        questoes15.A = "A) 1900";
        questoes15.B = "B) 1990";
        questoes15.C = "C) 1890";
        questoes15.D = "D) 2000";
        questoes15.E = "E) 2020";
        questoes15.escrevaquestao();
        questoes15.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = sc.nextLine();
        if (questoes15.iscorreta(resposta)){
            acertos = acertos+1;
        }


        System.out.println("ACERTOS: "+acertos);

    }
}
