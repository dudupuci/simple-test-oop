Prova de Java - Sistema de Cadastro de Animais

<h3> PRIMEIRA PARTE DO DESAFIO - INICIO </h3>

1) Crie uma classe abstrata em Java chamada Animal que tenha os seguintes atributos e métodos:
- name: uma string que representa o nome do animal.
- weight: um double que representa o peso do animal.
- getName(): um método que retorna o nome do animal.
- getWeight(): um método que retorna o peso do animal.
- eat(): um método abstrato que deve ser implementado nas classes filhas para simular a ação de comer do animal.
- makeSound(): um método abstrato que deve ser implementado nas classes filhas para simular o som emitido pelo animal.

2) Crie cinco classes em Java que herdam da classe Animal: 
- Dog, Cat, Bird, Shark, Lizard.
- Na classe Dog, adicione uma Estrutura de Dados para armazenar os brinquedos de um cachorro (não pode conter brinquedos repetidos)
- Na classe Cat, adicione um atributo booleano para saber se o gato é vacinado ou não
- Na classe Shark, adicione uma Estrutura de Dados para armazenar os animais que o tubarao comeu (pode conter repetidos)
- Cada uma dessas classes deve implementar os métodos eat() e makeSound() de acordo com as características do animal.

3) Crie uma interface em Java chamada DomesticAnimal que tenha um método play() que simula a ação de brincar com o animal.

4) Implemente a interface DomesticAnimal nas classes que o Animal seja domestico.

5) Crie uma classe em Java chamada Zoologico que tenha os seguintes métodos:

- addAnimal(Animal animal): um método que adiciona um animal ao zoologico.
- deleteAnimal(Animal animal): um método que remove um animal do zoologico.
- listAnimals(): um método que retorna uma lista de todos os animais do zoologico.

OBSERVAÇÃO:
Use sua criatividade e conceitos aprendidos em POO, use o que julgar necessário: List, Map, Set.
Lembrando que estes métodos deverão:
- addAnimal deverá adicionar o animal passado como parâmetro a uma estrutura de dados escolhida que receba animais
- deleteAnimal deverá remover o animal passado como parâmetro de uma estrutura de dados escolhida que receba animais
- listAnimals deverá printar todos os animais adicionados na estrutura de dados de animais).

    <h3> PRIMEIRA PARTE DO DESAFIO - FIM </h3>

7) Crie uma classe em Java chamada Casa que tenha um conjunto de ANIMAIS DOMÉSTICOS(apenas), representado por uma instância da classe Set.

8) Crie um método na classe Casa chamado addDomesticAnimal(AnimalDomestico animal) que adiciona um animal doméstico ao conjunto.

9) Crie um método na classe Casa chamado removerAnimalDomestico(AnimalDomestico animal) que remove um animal doméstico do conjunto.

10) Crie um método na classe Casa chamado listarAnimaisDomesticos() que retorna uma lista de todos os animais domésticos da casa.

11) Crie uma classe em Java chamada Main que contenha um método main. Nesse método, crie uma instância do zoologico e adicione alguns animais. 
Crie também uma instância da casa e adicione alguns animais domésticos.

12) Imprima na tela as informações dos animais cadastrados, utilizando os métodos da classe Animal, e também as informações dos animais domésticos, utilizando o método brincar() da interface DomesticAnimal.