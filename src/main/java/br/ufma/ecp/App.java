package br.ufma.ecp;

import static br.ufma.ecp.token.TokenType.EOF;

import br.ufma.ecp.token.Token; 

public class App 
{

    
    public static void main( String[] args )
    {

    
        String input = """
      // é um comentario 10
      45 \"hello\" variavel + while < , if
      /*
      comentario em bloco
      */
      42 ola
      
      """;
        Scanner scan = new Scanner (input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }

        // ALUNOS
        // FILIPI PINHEIRO
        // FERNANDO CASTRO

        /*
        Parser p = new Parser (input.getBytes());
        p.parse();
        */


        //Parser p = new Parser (fromFile().getBytes());
        //p.parse();

        /*
        String input = "489-85+69";
        Scanner scan = new Scanner (input.getBytes());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        Token tk = new Token(NUMBER, "42");
        System.out.println(tk);
        */
    }
}
