using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pilha
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Stack<string> novaPilha = new Stack<string>();      /* Stack<tipo> nome = instançiação */

            novaPilha.Push("Primeira carta");
            novaPilha.Push("Segunda carta");        /* Push permite inserir elementos na pilha */
            novaPilha.Push("Terçeira carta");
            novaPilha.Push("Quarta carta");
            novaPilha.Push("Quinta carta");

            Console.WriteLine("Pilha antes da remoção:");
            foreach (string carta in novaPilha)
            {                                       /* imprime todos elementos da pilha */
                Console.WriteLine(carta);
            }
            Console.WriteLine();        

            Console.WriteLine("O primeiro elemento da PILHA é o: " + novaPilha.Peek());     /* Peek retorna o rpimeiro elemento da pilha */

            Console.WriteLine();

            novaPilha.Pop();        /* Pop remove o primeiro elemento da pilha */
            Console.WriteLine("Pilha após remoção do primeiro elemento:");

            foreach (string carta in novaPilha)
            {
                Console.WriteLine(carta);
            }

            Console.ReadLine();

            int contador = novaPilha.Count();        /* Count conta todos elementos da pilha */

            Console.WriteLine("Existe " + contador + " elementos nesta PILHA");
            Console.ReadLine();

            novaPilha.Clear();      /* com Clear é possivel eliminar definitivamente a pilha */
            foreach (string carta in novaPilha)
            {
                Console.WriteLine(carta);
            }

            Console.ReadLine();


        }
    }
}
