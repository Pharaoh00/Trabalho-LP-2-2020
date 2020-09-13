class Pessoa {
    private var nome:String;
    private var idade:Int;
    private var id:Int;

    // Criando o construtor da classe Pessoa.
    public function new(nome, idade, id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    // Get, Set para nome
    public function setNome(nome:String) {
        this.nome = nome;
    }
    public function getNome():String {
        return this.nome;
    }

    // Get, Set para idade
    public function setIdade(idade:Int) {
        this.idade = idade;
    }
    public function getIdade():Int {
        return this.idade;
    }

    // Get, Set para Id
    public function setId(id:Int) {
        this.id = id;
    }
    public function getId():Int {
        return this.id;
    }

    // Função para 'printar' Pessoa na tela.
    public function toString() {
        return "Pessoa(" + "Nome: " + this.nome + "Idade: " + this.idade + "Id: " + this.id + ")";
    }
}

class Main {
	static function main():Void {
		var id = 10; // variavel do tipo int de modo dinamico
		var is:Int = 10; // variavel do tipo int de modo estatico

		var fd = 5.0; // variavel do tipo int de modo dinamico
		var fs:Float = 10; // variavel do tipo int de modo estatico

		var bd = true; // variavel do tipo int de modo dinamico
		var bs:Bool = true; // variavel do tipo int de modo estatico

		var t:Float; // iniciando variavel do tipo float estatico
		t = 50.1;

		var s; // iniciando uma variavel sem tipo de modo dinamico
		s = "Hello"; // definindo o valor da variavel como string

		// String e char nao sao tipos primitivos sao classes

		trace(id / fd);
		trace(fs / is);
		trace(bd);
		trace(t - 1);
		trace(s);
		// s = 10.2; Não é aceito.
		// t = "Ola"; Não é aceita. A variavel foi inicializada como tipo Float.

		{
            var l = 10;
			if (l>15) {
                trace("maior que 15");
            } else if (l>=25) {
                trace("maior ou igual que 25");
            } else {
                trace("menor ou igual que 15"); 
            }
        }
        
        //trace(l);//erro variavel nao existe no scopo

		// loops
		// while
		var r = true;
		while (r) {
			r = false;
		}
		// for
		for (i in 0...65) {
			trace(i);
		}
		// foreach
		var list = ["laranja", "maça", "limao", "manga"];
		for (f in list) {
			trace(f);
		}
		// doWhile
		var k = 0;
		do {
			trace(k);
			k++;
		} while (k < 5);
	}

	function sum(a:Int, b:Int):Int {
		return a + b;
	}

	// nao permite overflow
	function sum2(a, b) {
		return a + b;
	}

	        // Instanciando Pessoa.
			var pessoa = new Pessoa("Hamon-Rá", 28, 1);
			trace(pessoa);
	
			// Utilizando os metodos em Pessoa.
			var nome = pessoa.getNome();
			trace(nome);
	
			var idade = pessoa.getIdade();
			trace(idade);
	
			var id = pessoa.getId();
			trace(id);

}