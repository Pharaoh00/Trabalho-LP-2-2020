<p align="center">
  <img width="15%" height="15%" src="Documentacao/imgs/logo-red-dust.png">
</p>

Trabalho para as aulas de Linguagem de Programação 2º Semestre
2020 sobre a Linguagem Haxe. A pesquisa foi feita focando na história da
linguagem, sintaxe e semantica.

<p align="center">
  <img width="50%" height="50%" src="Documentacao/imgs/haxe-logo.png">
</p>

## Alunos integrantes da equipe

* Daniel Santos França
* Hamon-Rá Taveira Guimaraes
* Matheus Felipe Santos Bussolotti

## Professores responsáveis

* Hugo Bastos de Paula


>[Haxe] é uma linguagem de alto nível, open-source, cross-platform compilada, sendo ela traduzida para várias outras linguagens.
A linguagem inclui uma gama de bibliotecas base dando suporte para todas as plataformas que possam ser compiladas, sendo esse suporte para tipos numéricos, strings, listas, files e muitos outros.

>Haxe foi originalmente uma ideia para dar suporte tanto para o lado do cliente e servidor unificando várias ferramentas escritas em linguagens diferentes sendo elas Javascript, C++, Java, PHP.

#### As linguagens suportas por Haxe

| Compiler target | Output | Platform | Use | Since Haxe version
| ------ | ------ | ------ | ------ | ------ |
| JavaScript | source | HTML5, NodeJS, PhoneGap | Server, desktop, browser, mobile |2006
| C++ | source | Windows, Linux, MacOS, Android, iOS, Palm, WebOS | Server, desktop, Mobile, CLI, game consoles | 2009 (2.04)
| PHP | source | PHP | Server | 2008 (2.0)
| C# | source | .NET Framework | Server, desktop, mobile |      2012 (2.10)
| Java | source | Java | Server, desktop | 2012 (2.10)
| JVM | bytecode | Java virtual machine | Server, desktop | 2019 (4.0)
| Python | source | Python | CLI, web, desktop | 2014 (3.2)
| Lua | source | Lua | CLI, web, desktop, mobile | 2016 (3.3)
| Neko | bytecode | NekoVM | Server, desktop, CLI | 2005
| Flash/SWF | bytecode | Adobe Flash Player 9+, Adobe AIR, Tamarin | Desktop, browser, server | 2005
| HashLink | bytecode | HashLink VM or HL/C (compile to C file) | Server, desktop, mobile, game consoles (C export) | 2016 (3.4)

### Para mais informações vá em ```Documentacao/```

# Instalação
- Vá no site [Haxe] e clique em "download"

![Site Haxe](Documentacao/imgs/haxe-main-website.jpg)

- Escolha o instalador para a sua plataforma e baixe.

![Site Haxe](Documentacao/imgs/escolher-instalacao.jpg)

- Instale normalmente seguindo as instruções do instalador.

[Haxe]: <https://haxe.org/>

## Algumas características da linguagem
| Language Features | description
| ------ | ------ |
| ![Abstract types](https://haxe.org/manual/types-abstract.html) | An abstract type is a compile-time construct which is represented in a different way at runtime. This allows giving a whole new meaning to existing types.
| ![Extern classes](https://haxe.org/manual/lf-externs.html) | Externs can be used to describe target-specific interaction in a type-safe manner.
| ![Anonymous structures](https://haxe.org/manual/types-anonymous-structure.html) | Data can easily be grouped in anonymous structures, minimizing the necessity of small data classes.
| ![Array Comprehension](https://haxe.org/manual/lf-array-comprehension.html) | Create and populate arrays quickly using for loops and logic.
| ![Map Comprehension](https://haxe.org/manual/lf-map-comprehension.html) | Create and populate maps quickly using for loops and logic.
| ![Classes, interfaces and inheritance](https://haxe.org/manual/types-class-instance.html) | Haxe allows structuring code in classes, making it an object-oriented language. Common related features known from languages such as Java are supported, including inheritance and interfaces.
| ![Conditional compilation](https://haxe.org/manual/lf-condition-compilation.html) | Conditional Compilation allows compiling specific code depending on compilation parameters. This is instrumental for abstracting target-specific differences, but can also be used for other purposes, such as more detailed debugging.
| ![(Generalized) Algebraic Data Types](https://haxe.org/manual/types-enum-instance.html) | Structure can be expressed through algebraic data types (ADT), which are known as enums in the Haxe Language. Furthermore, Haxe supports their generalized variant known as GADT.
| ![Inlined calls](https://haxe.org/manual/class-field-inline.html) | Functions can be designated as being inline, allowing their code to be inserted at call-site. This can yield significant performance benefits without resorting to code duplication via manual inlining.
| ![Iterators](https://haxe.org/manual/lf-iterators.html) | Iterating over a set of values, e.g. the elements of an array, is very easy in Haxe courtesy of iterators. Custom classes can quickly implement iterator functionality to allow iteration.
| ![Local functions and closures](https://haxe.org/manual/expression-arrow-function.html) | Functions in Haxe are not limited to class fields and can be declared in expressions as well, allowing powerful closures.
| ![Metadata](https://haxe.org/manual/lf-metadata.html) | Add metadata to fields, classes or expressions. This can communicate information to the compiler, macros, or runtime classes.
| ![Static Extensions](https://haxe.org/manual/lf-static-extension.html) | Existing classes and other types can be augmented with additional functionality through using static extensions.
| ![String Interpolation](https://haxe.org/manual/lf-string-interpolation.html) | Strings declared with a single quotes are able to access variables in the current context.
| ![Partial function application](https://haxe.org/manual/lf-function-bindings.html) | Any function can be applied partially, providing the values of some arguments and leaving the rest to be filled in later.
| ![Pattern Matching](https://haxe.org/manual/lf-pattern-matching.html) | Complex structures can be matched against patterns, extracting information from an enum or a structure and defining specific operations for specific value combination.
| ![Properties](https://haxe.org/manual/class-field-property.html) | Variable class fields can be designed as properties with custom read and write access, allowing fine grained access control.
| ![Access control](https://haxe.org/manual/lf-access-control.html) | The access control language feature uses the Haxe metadata syntax to force or allow access classes or fields.
| ![Type Parameters, Constraints and Variance](https://haxe.org/manual/type-system-type-parameters.html) | Types can be parametrized with type parameters, allowing typed containers and other complex data structures. Type parameters can also be constrained to certain types and respect variance rules.

## Algumas características do compilador
| Compiler Features | description
| ------ | ------ |
| ![Built-in Compiler Metadata](https://haxe.org/manual/cr-metadata.html) | Starting from Haxe 3.0, you can get the list of defined compiler metadata by running haxe --help-metas
| ![Dead Code Elimination](https://haxe.org/manual/cr-dce.html) | Dead Code Elimination or DCE is a compiler feature which removes unused code from the output.
| ![Compiler Services](https://haxe.org/manual/cr-completion.html) | ![Compiler Services](https://haxe.org/manual/cr-completion.html)
| ![Resources](https://haxe.org/manual/cr-resources.html) | Haxe provides a simple resource embedding system that can be used for embedding files directly into the compiled application.
| ![Runtime Type Information](https://haxe.org/manual/cr-rtti.html) | The Haxe compiler generates runtime type information (RTTI) for classes that are annotated or extend classes that are annotated with the :rtti metadata.
| ![Static Analyzer](https://haxe.org/manual/cr-static-analyzer.html) | Haxe 3.3.0 introduces a new static analyzer for code optimizations. It is enabled by using the -D analyzer-optimize compiler flag and consists of multiple modules which can be configured globally with a compiler flag as well as at type-level and field-level with a compiler metadata.
| ![Loop unrolling](https://haxe.org/manual/cr-loop-unrolling.html) | The compiler tries to unroll short iterations of for loops over constant ranges.
| ![Tail Recursion Elimination (TRE)](https://haxe.org/manual/cr-tail-recursion-elimination.html) | Recursion is a natural way to solve some tasks like calculating fibonacci numbers or traversing trees. It's easy to write, read and understand. But it takes more computational resources at run time than solving the same tasks with loops instead of recursion.
| ![Null Safety](https://haxe.org/manual/cr-null-safety.html) | The Haxe compiler offers opt-in compile-time checking for nullable values. It attempts to catch various possible issues with nullable values.


