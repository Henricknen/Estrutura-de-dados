using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fila
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Queue<string> novaFila = new Queue<string>(); /* Queue<tipo> nome = instançiação */ 

            novaFila.Enqueue("Cliente 1");
            novaFila.Enqueue("Cliente 2");       /* Enqueue comando par enfileirar */
            novaFila.Enqueue("Cliente 3");
            novaFila.Enqueue("Cliente 4");
            novaFila.Enqueue("Cliente 5");

            foreach (string elemento in novaFila)
            {                                               /* impreme todos os elementos */
                Console.WriteLine(elemento);
            }

            Console.WriteLine("O primeiro elemento da FILA é o: " + novaFila.Peek());     /* Peek retorna o rpimeiro elemento da FILA */


            novaFila.Dequeue();     /* Dequeue desenfilera */
            Console.WriteLine("Apos a remoção, o primeiro elemento da FILA é o: " + novaFila.Peek());


            int contador = novaFila.Count();        /* Count conta todos elementos da fila */

            Console.WriteLine("Existe " + contador + " elementos nesta FILA");
            Console.ReadLine();


        }
    }
}
