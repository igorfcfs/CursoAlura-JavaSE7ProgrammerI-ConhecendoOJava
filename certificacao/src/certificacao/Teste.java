package certificacao;

//Block #1
//public class Teste {
//	
//	public void m1() {
//		int x = 10;
//		
//		if (x >= 10) {
//			int y = 50;
//			System.out.println(y);
//		}
//		System.out.println(y);
//		System.out.println(x);
//		
//		for (int i = 0, j = 0; i <= 10; i++) j++;
//		System.out.println(i);
//		System.out.println(j);
//	}
//	
//	public static void main(String[] args) {
//		Teste t = new Teste();
//		t.m1();
//	}
//}

//Block #2
//public class Teste {
//	
//	String nome = "guilherme";
//	String nomeCompleto = nome + " silveira";
//	
//	public Teste() {
//		System.out.println(nome);
//	}
//	
//	public void m2() {
//		System.out.println(nomeCompleto);
//	}
//	
//	public static void main(String[] args) {
//		Teste t = new Teste();
//		t.m2();
//		t.nome = "Igor";
//		System.out.println(t.nome);
//	}
//}

//Block #3
//class Pessoa {
//	static int id = 1;
//	static void metodo() {
//		System.out.println(id);
//	}
//}
//
//public class Teste {
//	
//	public static void main(String[] args) {
//		Pessoa p = new Pessoa();
//		System.out.println(p.id);
//		System.out.println(Pessoa.id);
//		Pessoa.metodo();
//	}
//}

//Block #4
//class Bla {
//	static int a;
//	int a;
//}
//
//public class Teste {
//	
//	public static void main(String[] args) {
//		int a = 0;
//		int a = 10;
//		String args[] = null;
//	}
//}

//Block #5
//class Pessoa {
//	
//	static int x = 0;
//	public void setX(int x) {
//		Pessoa.x = x;
//	}
//	
//	int y = 0;
//	public void setY(int y) {
//		this.y = y;
//	}
//}

class X {
	int a = 18;
	public void metodo() {
		int a = 0;
		System.out.println(a);
	}
}

public class Teste {
	
	public static void main(String[] args) {
		new X().metodo();
	}
}

