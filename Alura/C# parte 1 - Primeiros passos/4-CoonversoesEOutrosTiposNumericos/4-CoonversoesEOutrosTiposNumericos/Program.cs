using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4_CoonversoesEOutrosTiposNumericos
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Executando o projeto 4");

            double salario;
            salario = 1200.50;


            // O int é uma variavel de 32 bits
            int salarioEmInteiro;
            salarioEmInteiro = (int)salario;

            Console.WriteLine(salarioEmInteiro);


            // O long é uma variavel de 64 bits
            long idade = 13000000000000000;

            // O short é uma variavel de 16 bits
            short quantidadeProdutos = 15000;

            float altura = 1.80f;

            Console.ReadLine();
        }
    }
}
