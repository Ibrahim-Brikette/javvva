package tp3;

public class TestLivre {

	public static void main(String[] args) {
		Livre livre1=new Livre("Bruce Eckel","Thinking in Java");
		Livre livre2=new Livre("Claude delannoy","Programmer en Java");
		System.out.println("l'auteur de livre1 est " +livre1.getAuteur());
		System.out.println("l'auteur de livre2 est " +livre2.getAuteur());
		livre1.setNbPages(10);
		livre2.setNbPages(20);
		livre1.affichier();
		livre2.affichier();		
	}

}
