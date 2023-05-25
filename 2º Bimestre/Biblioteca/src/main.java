public class main {

    public static void main(String[] args){
        biblioteca biblioteca = new biblioteca("Saraiva", new dono("Juninho Capixaba", "400.289.223-11"));
        System.out.println("Biblioteca: " + biblioteca.getNome());
        System.out.println("Dono: " + biblioteca.getDono().getNome());
        biblioteca.addLivros(new livros("Jogos Vorazes", "Suzanne Collins", "2008"));
        biblioteca.addLivros(new livros("Dois mundos um herói", "RezendeEvil", "2015"));
        biblioteca.addLivros(new livros("O diário de Larissa Manoela: A vida, a história e os segredos da jovem estrela", "Larissa Manoela", "2016"));
        biblioteca.mostrarLivros();

    }
}