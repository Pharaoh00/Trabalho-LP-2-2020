# Documentação do Projeto

Após a instalação do [Haxe] você pode escolher a IDE de sua preferência, nós do grupo **Red Dust** escolhemos o [Visual Studio Code].

# Instalação Visual Studio Code
- Vá no site [Visual Studio Code] e baixe o instalador.

![vscode website](/Documentacao/imgs/VSCode-instalacao.jpg)

- Siga as instruções normalmente.

Após a instalação do **VSCode** basta instalar o plugin para o mesmo reconhecer a linguagem **Haxe**.

- Abra o VSCode.

![vscode main screen](/Documentacao/imgs/VSCode-main-screen.jpg)

- Na barra esquerda no editor escolha o ícone:

![vscode main screen](/Documentacao/imgs/VSCode-plugin-icon.jpg)

- E digite "haxe" e instale o plugin mostrado.

![vscode main screen](/Documentacao/imgs/VSCode-instalacao-plugin.jpg)

**Se tudo tiver dado certo, agora você tem o VSCode configurado para reconhecer a linguagem.**
&nbsp;
# Linguagem Haxe

### ![Usos do Haxe](https://haxe.org/use-cases/)
| Tipo | Descrição |
| ------ | ------ |
| ![Games](https://haxe.org/use-cases/games/) | Haxe é popular com criadores de games por ser rápido, varias bibliotecas, pode ser compilado para várias plataformas diferentes.
| ![Web](https://haxe.org/use-cases/web/) | Haxe é muito poderoso, é uma linguagem "type-safe" e pode ser usado com Javascript na parte do cliente e NodeJS no servidor.
| ![Mobile](https://haxe.org/use-cases/mobile/) | Compartilhar o mesmo codigo entre multiplas plataformas, acessando funcionalidade nativa sem nenhum sacrifício de performance.

- Os arquivos da linguagem tem a extensão ".hx".
- Todo arquivo faz parte de uma Classe, igual o Java.
- O mesmo nome da ```class``` deve ser o arquivo também igual ao Java.


>Crie um arquivo HelloWorld.hx
E escreva o código abaixo.

```haxe
class HelloWorld {
    static public function main() {
        trace("Hello World");
    }
}
```
Um simples hello world em **Haxe**.

Para compilar o **Haxe** basta abrir o ```terminal/bash/console``` e digitar:
```
haxe --main HelloWorld --js HelloWorld.js
```
- Sendo ```haxe```, o comando para acionar a ferramenta **Haxe**.
- ```--main HelloWorld```, o ponto de entrada do programa,
- ```HelloWorld``` é o nome do arquivo e da sua classe.
- ```--js``` é o alvo para a "tradução".
- ```HelloWorld.js``` é o nome final do arquivo, podendo ser ele diferente do nome original do arquivo, lembrando que a extensão deve ser a mesma da linguagem alvo.

# Sintaxe e Semantica

Os tipos basico são:
| Tipo | Descrição |
| ------ | ------ |
| Bool | ```var b:Bool```
| Float | ```var f:Float```
| Int | ```var i:Int```

>**![String](https://api.haxe.org/String.html)** é imutável e uma ```classe```. Não é possível modificar caracteres individuais. ![Para mais informações](https://haxe.org/manual/std-String.html).

>**Char** terá uma implementação para cada linguagem alvo. Para isso basta ver o ![Haxe API](https://api.haxe.org/)

**Haxe** é uma linguagem estaticamente tipada e fortemente tipada. Múltiplos paradigmas e propósito geral.
Para conhecer outras formas de compilar o **Haxe** pode esta visitando [Introdução Haxe], lá se encontra vários tutoriais.

### ![Estrutura de dados](https://haxe.org/manual/std-ds.html)
| Tipo | Descrição |
| ------ | ------ |
| ![Array](https://haxe.org/manual/std-Array.html) | O "array" é uma coleção de elementos. O tipo do mesmo é correspondente ao tipo dos elementos. ```var a = [1, 2, 3];```
| ![Vector](https://haxe.org/manual/std-vector.html) | "Vector" é uma coleção optimizada de elementos. Assim como o "array" é tipo do mesmo é correspondente ao tipos dos elementos, mas diferente dele uma vez o tamanho especificado não pode ser mudado. ```var vec = new haxe.ds.Vector(10);```
| ![List](https://haxe.org/manual/std-List.html) | Uma "list" é uma coleção para armazenamento de elementos. Diferente de um "array" a mesma não pode ser indexada usando "[0]", não pode ser inicializada, não pode ser usado "list comprehensions", você pode modificar, adicionar e remover os elementos interagindo com a "list". ```var myList = new haxe.ds.List<Int>();```
| ![GenericStack](https://haxe.org/manual/std-GenericStack.html) | Como um "arra" ou uma "list" é um container para armazenamento de elementos. Todos os tipos dos elementos armazenados devem ser do mesmo tipo. ```var myStack = new GenericStack<Int>();```
| ![Map](https://haxe.org/manual/std-Map.html) | É um container que tem chave e valor (key, value). Mais associado com um dicionário. ```var map1:Map<Int, String> = [1 => "one", 2 => "two"];```
| ![Option](https://haxe.org/manual/std-Option.html) | Um "option" é uma "enum".

### [Classe em Haxe]
Um exemplo ótimo é o do próprio **Haxe** onde ele criar uma ```class``` **Point** onde as variáveis são do tipo **Integer** com um construtor padrão e um método ```overload```.
```haxe
class Point {
  var x:Int;
  var y:Int;

  public function new(x, y) {
    this.x = x;
    this.y = y;
  }

  public function toString() {
    return "Point(" + x + "," + y + ")";
  }
}
```

Outro exemplo.
```haxe
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
```
E sendo utilizado.
```haxe
class Main {
    static function main():Void {
        // Instanciando Pessoa.
        var pessoa = new Pessoa("Hamon-Rá", 28, 1);
        trace(pessoa);

        // Utilizando os métodos em Pessoa.
        var nome = pessoa.getNome();
        trace(nome);

        var idade = pessoa.getIdade();
        trace(idade);

        var id = pessoa.getId();
        trace(id);
    }
}
```

### Utilizando Herança na ```class Point```
```haxe
class Point3 extends Point {
  var z:Int;

  public function new(x, y, z) {
    super(x, y);
    this.z = z;
  }
}
```

### A utilização de [enum]:
```haxe
enum Color {
  Red;
  Green;
  Blue;
  Rgb(r:Int, g:Int, b:Int);
}
```
Sendo utilizado.
```haxe
class Main {
  static function main() {
    var color = getColor();
    switch (color) {
      case Red:
        trace("Color was red");
      case Green:
        trace("Color was green");
      case Blue:
        trace("Color was blue");
      case Rgb(r, g, b):
        trace("Color had a red value of " + r);
    }
  }

  static function getColor():Color {
    return Rgb(255, 0, 255);
  }
}
```
### [Grupos anônimos] ou Dicionários
```haxe
var myStructure = {x: 12, name: "foo"};
```
Utilizando.
```haxe
class Test {
  static public function main() {
    var user = {
      name : "Nicolas",
        age : 32,
        pos : [
          { x : 0, y : 0 },
        { x : 1, y : -1 }
      ],
    };
    trace(user.name);
    trace(user.age);
  }
}
```
### For/While/Switch

```haxe
var list = ["apple", "pear", "banana"];
for (v in list) {
  trace(v);
}
// apple
// pear
// banana
```
```haxe
for (i in 0...10) trace(i); // 0 to 9
```
```haxe
for (i in 0...10) {
  if (i == 2) continue; // skip 2
  if (i == 5) break; // stop at 5
  trace(i);
}
// 0
// 1
// 3
// 4
```
```haxe
var map = [1 => 101, 2 => 102, 3 => 103];
for (key => value in map) {
  trace(key, value);
}
```
```haxe
while (condition) expression;
do expression while (condition);
```
```haxe
class Main {
  static public function main() {
    var f = 0.0;
    while (f < 0.5) {
      trace(f);
      f = Math.random();
    }
  }
}
```
```haxe
switch subject {
  case pattern1: case-body-expression-1;
  case pattern2: case-body-expression-2;
  default: default-expression;
}
```
### Parâmetros ![opcionais](https://haxe.org/manual/types-nullability-optional-arguments.html)/![padrão](https://haxe.org/manual/types-function-default-values.html)
**Parâmetro opcional
```haxe
class Main {
  static public function main() {
    // (?i : Int, ?s : String) -> String
    $type(test);
    trace(test()); // i: null, s: null
    trace(test(1)); // i: 1, s: null
    trace(test(1, "foo")); // i: 1, s: foo
    trace(test("foo")); // i: null, s: foo
  }

  static function test(?i:Int, ?s:String) {
    return "i: " + i + ", s: " + s;
  }
}
```
**Parâmetro padrão
```haxe
class Main {
  static public function main() {
    // (?i : Int, ?s : String) -> String
    $type(test);
    trace(test()); // i: 12, s: bar
    trace(test(1)); // i: 1, s: bar
    trace(test(1, "foo")); // i: 1, s: foo
    trace(test("foo")); // i: 12, s: foo
  }

  static function test(?i = 12, s = "bar") {
    return "i: " + i + ", s: " + s;
  }
}
```

**Com isso concluímos nossa aventura pelo maravilhoso mundo do Haxe.
Achamos uma linguagem bem versátil e fácil de usar.**


[Haxe]: https://haxe.org/
[Visual Studio Code]: https://code.visualstudio.com/
[Introdução Haxe]: https://haxe.org/documentation/introduction/
[Classe em Haxe]: https://haxe.org/manual/types-class-instance.html
[enum]: https://haxe.org/manual/types-enum-instance.html
[Grupos anônimos]: https://haxe.org/manual/types-anonymous-structure.html


