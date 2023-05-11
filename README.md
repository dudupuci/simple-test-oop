<p class="has-line-data" data-line-start="0" data-line-end="1">Prova de Java - Sistema de Cadastro de Animais</p>
<p class="has-line-data" data-line-start="2" data-line-end="3">&lt;h3&gt; PRIMEIRA PARTE DO DESAFIO - INICIO &lt;/h3&gt;</p>
<ol>
<li class="has-line-data" data-line-start="4" data-line-end="5">Crie uma classe abstrata em Java chamada Animal que tenha os seguintes atributos e métodos:</li>
</ol>
<ul>
<li class="has-line-data" data-line-start="5" data-line-end="6">name: uma string que representa o nome do animal.</li>
<li class="has-line-data" data-line-start="6" data-line-end="7">weight: um double que representa o peso do animal.</li>
<li class="has-line-data" data-line-start="7" data-line-end="8">getName(): um método que retorna o nome do animal.</li>
<li class="has-line-data" data-line-start="8" data-line-end="9">getWeight(): um método que retorna o peso do animal.</li>
<li class="has-line-data" data-line-start="9" data-line-end="10">eat(): um método abstrato que deve ser implementado nas classes filhas para simular a ação de comer do animal.</li>
<li class="has-line-data" data-line-start="10" data-line-end="12">makeSound(): um método abstrato que deve ser implementado nas classes filhas para simular o som emitido pelo animal.</li>
</ul>
<ol start="2">
<li class="has-line-data" data-line-start="12" data-line-end="13">Crie cinco classes em Java que herdam da classe Animal:</li>
</ol>
<ul>
<li class="has-line-data" data-line-start="13" data-line-end="14">Dog, Cat, Bird, Shark, Lizard.</li>
<li class="has-line-data" data-line-start="14" data-line-end="15">Na classe Dog, adicione uma Estrutura de Dados para armazenar os brinquedos de um cachorro (não pode conter brinquedos repetidos)</li>
<li class="has-line-data" data-line-start="15" data-line-end="16">Na classe Cat, adicione um atributo booleano para saber se o gato é vacinado ou não</li>
<li class="has-line-data" data-line-start="16" data-line-end="17">Na classe Shark, adicione uma Estrutura de Dados para armazenar os animais que o tubarao comeu (pode conter repetidos)</li>
<li class="has-line-data" data-line-start="17" data-line-end="19">Cada uma dessas classes deve implementar os métodos eat() e makeSound() de acordo com as características do animal.</li>
</ul>
<ol start="3">
<li class="has-line-data" data-line-start="19" data-line-end="21">
<p class="has-line-data" data-line-start="19" data-line-end="20">Crie uma interface em Java chamada DomesticAnimal que tenha um método play() que simula a ação de brincar com o animal.</p>
</li>
<li class="has-line-data" data-line-start="21" data-line-end="23">
<p class="has-line-data" data-line-start="21" data-line-end="22">Implemente a interface DomesticAnimal nas classes que o Animal seja domestico.</p>
</li>
<li class="has-line-data" data-line-start="23" data-line-end="25">
<p class="has-line-data" data-line-start="23" data-line-end="24">Crie uma classe em Java chamada Zoologico que tenha os seguintes métodos:</p>
</li>
</ol>
<ul>
<li class="has-line-data" data-line-start="25" data-line-end="26">addAnimal(Animal animal): um método que adiciona um animal ao zoologico.</li>
<li class="has-line-data" data-line-start="26" data-line-end="27">deleteAnimal(Animal animal): um método que remove um animal do zoologico.</li>
<li class="has-line-data" data-line-start="27" data-line-end="29">listAnimals(): um método que retorna uma lista de todos os animais do zoologico.</li>
</ul>
<p class="has-line-data" data-line-start="29" data-line-end="32">OBSERVAÇÃO:<br>
Use sua criatividade e conceitos aprendidos em POO, use o que julgar necessário: List, Map, Set.<br>
Lembrando que estes métodos deverão:</p>
<ul>
<li class="has-line-data" data-line-start="32" data-line-end="33">
<p class="has-line-data" data-line-start="32" data-line-end="33">addAnimal deverá adicionar o animal passado como parâmetro a uma estrutura de dados escolhida que receba animais</p>
</li>
<li class="has-line-data" data-line-start="33" data-line-end="34">
<p class="has-line-data" data-line-start="33" data-line-end="34">deleteAnimal deverá remover o animal passado como parâmetro de uma estrutura de dados escolhida que receba animais</p>
</li>
<li class="has-line-data" data-line-start="34" data-line-end="40">
<p class="has-line-data" data-line-start="34" data-line-end="35">listAnimals deverá printar todos os animais adicionados na estrutura de dados de animais).</p>
<p class="has-line-data" data-line-start="36" data-line-end="37">&lt;h3&gt; PRIMEIRA PARTE DO DESAFIO - FIM &lt;/h3&gt;</p>
<p class="has-line-data" data-line-start="38" data-line-end="39">&lt;h3&gt; SEGUNDA PARTE DO DESAFIO - INICIO COM SPRING BOOT &lt;/h3&gt;</p>
</li>
<li class="has-line-data" data-line-start="40" data-line-end="41">
<p class="has-line-data" data-line-start="40" data-line-end="41">Adicione um atributo protegido na classe abstrata Animal, chamado id.</p>
</li>
<li class="has-line-data" data-line-start="41" data-line-end="42">
<p class="has-line-data" data-line-start="41" data-line-end="42">O tipo deste atributo deve ser um UUID, do pacote java.util.</p>
</li>
<li class="has-line-data" data-line-start="42" data-line-end="43">
<p class="has-line-data" data-line-start="42" data-line-end="43">Faça o encapsulamento do mesmo na classe pai.</p>
</li>
<li class="has-line-data" data-line-start="43" data-line-end="44">
<p class="has-line-data" data-line-start="43" data-line-end="44">Pesquise as anotacoes, caso necessárias, para fazer no atributo id (por enquanto não precisa ser gerado automaticamente)</p>
</li>
</ul>
<ol>
<li class="has-line-data" data-line-start="46" data-line-end="49">Depois disto, adicione as dependências necessárias no seu pom.xml ou build.gradle<br>
para a aplicação se tornar uma aplicação spring boot.</li>
</ol>
<p class="has-line-data" data-line-start="49" data-line-end="50">CASO BUILD.GRADLE :</p>
<p class="has-line-data" data-line-start="51" data-line-end="56">plugins {<br>
id ‘java’<br>
id ‘org.springframework.boot’ version ‘2.6.7’<br>
id ‘io.spring.dependency-management’ version ‘1.0.11.RELEASE’<br>
}</p>
<p class="has-line-data" data-line-start="57" data-line-end="63">dependencies {<br>
implementation ‘org.springframework.boot:spring-boot-starter-parent:2.7.5’<br>
implementation ‘org.springframework.boot:spring-boot-starter-data-jpa:2.7.5’<br>
testImplementation ‘org.springframework.boot:spring-boot-starter-test’<br>
implementation ‘org.springframework.boot:spring-boot-starter-web:2.7.5’<br>
}</p>
<hr>
<p class="has-line-data" data-line-start="65" data-line-end="66">CASO POM.XML :</p>
<p class="has-line-data" data-line-start="67" data-line-end="73">&lt;parent&gt;<br>
&lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;<br>
&lt;artifactId&gt;spring-boot-starter-parent&lt;/artifactId&gt;<br>
&lt;version&gt;2.7.5&lt;/version&gt;<br>
&lt;relativePath/&gt; &lt;!-- lookup parent from repository --&gt;<br>
&lt;/parent&gt;</p>
<pre><code>&lt;dependencies&gt;
        &lt;dependency&gt;
            &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
            &lt;artifactId&gt;spring-boot-starter-data-jpa&lt;/artifactId&gt;
        &lt;/dependency&gt;
        &lt;dependency&gt;
            &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
            &lt;artifactId&gt;spring-boot-starter-web&lt;/artifactId&gt;
        &lt;/dependency&gt;
        &lt;dependency&gt;
             &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
             &lt;artifactId&gt;spring-boot-starter-test&lt;/artifactId&gt;
             &lt;scope&gt;test&lt;/scope&gt;
        &lt;/dependency&gt;
 &lt;/dependencies&gt;
</code></pre>
<hr>
<ol start="3">
<li class="has-line-data" data-line-start="91" data-line-end="95">Feito isto, a aplicação Spring por padrão espera as configurações<br>
básicas de um DataSource para iniciar sem problemas. Até podemos rodar a aplicação<br>
sem um banco, porém é necessária uma anotação na classe principal do projeto.</li>
</ol>
<ul>
<li class="has-line-data" data-line-start="95" data-line-end="98">@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })<br>
OBS: NÃO SERÁ USADA, APENAS PARA MOSTRA-LA.</li>
</ul>
<ol start="4">
<li class="has-line-data" data-line-start="98" data-line-end="101">
<p class="has-line-data" data-line-start="98" data-line-end="100">Hora de configurar a classe principal do spring. Caso voce ainda não tenha, pode criar uma classe chamada<br>
Main ou Application na raiz do projeto.</p>
</li>
<li class="has-line-data" data-line-start="101" data-line-end="103">
<p class="has-line-data" data-line-start="101" data-line-end="102">Depois de criada, siga o padrão</p>
</li>
</ol>
<p class="has-line-data" data-line-start="103" data-line-end="105">@SpringBootApplication (pacote org.springframework.boot.autoconfigure.SpringBootApplication;)<br>
class &lt;nome-classe&gt; {</p>
<p class="has-line-data" data-line-start="106" data-line-end="110">public static void main(String[] args) {<br>
System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, “test”);<br>
SpringApplication.run(&lt;nome-classe&gt;.class, args);<br>
}</p>
<ol start="6">
<li class="has-line-data" data-line-start="111" data-line-end="112">Feito isto, já configuramos a classe principal e o projeto já foi identificado como um projeto que usa o Spring Boot.</li>
<li class="has-line-data" data-line-start="112" data-line-end="113">Já configuramos também como perfil ativo, um perfil de testes, na primeira linha do método main.</li>
<li class="has-line-data" data-line-start="113" data-line-end="114">Agora vamos até a pasta resources, e vamos criar dois arquivos de configuração:</li>
</ol>
<hr>
<p class="has-line-data" data-line-start="115" data-line-end="118">application.yml:<br>
server:<br>
port: 8095</p>
<hr>
<p class="has-line-data" data-line-start="120" data-line-end="131">application-test.yml:<br>
spring:<br>
datasource:<br>
driver-class-name: org.h2.Driver<br>
username: root<br>
password: 123456<br>
url: jdbc:h2:mem:animals_zoo<br>
h2:<br>
console:<br>
enabled: true<br>
path: /h2</p>
<hr>
<ol start="9">
<li class="has-line-data" data-line-start="133" data-line-end="136">
<p class="has-line-data" data-line-start="133" data-line-end="135">Acima configuramos o application.yml raiz, que terá suas configurações HERDADAS por todo e qualquer<br>
application- criado. Nele apenas definimos uma porta padrão para todos os perfis que forem rodar.</p>
</li>
<li class="has-line-data" data-line-start="136" data-line-end="139">
<p class="has-line-data" data-line-start="136" data-line-end="138">Em application-test, definimos uma configuração básica do nosso banco H2, que é um banco teste, local e em memória.<br>
Vamos usa-lo para simular persistência de dados e ver como as tabelas serão criadas.</p>
</li>
<li class="has-line-data" data-line-start="139" data-line-end="142">
<p class="has-line-data" data-line-start="139" data-line-end="141">Para concluir a configuração do banco H2, precisaremos adicionar o driver H2 no nosso arquivo xml ou gradle, se não,<br>
ocorrerá um erro de dataSource, onde o programa não vai conseguir encontrar o driver H2.</p>
</li>
</ol>
<p class="has-line-data" data-line-start="142" data-line-end="143">CASO build.gradle:</p>
<p class="has-line-data" data-line-start="144" data-line-end="147">dependencies {<br>
implementation ‘com.h2database:h2:2.1.212’<br>
}</p>
<p class="has-line-data" data-line-start="148" data-line-end="149">CASO pom.xml:</p>
<p class="has-line-data" data-line-start="150" data-line-end="156">&lt;dependency&gt;<br>
&lt;groupId&gt;com.h2database&lt;/groupId&gt;<br>
&lt;artifactId&gt;h2&lt;/artifactId&gt;<br>
&lt;version&gt;2.1.212&lt;/version&gt;<br>
&lt;scope&gt;test&lt;/scope&gt;<br>
&lt;/dependency&gt;</p>
<ol start="12">
<li class="has-line-data" data-line-start="157" data-line-end="160">
<p class="has-line-data" data-line-start="157" data-line-end="159">Agora você configurou o H2 corretamente, atualize o gerenciador de dependencias do projeto, abrindo<br>
seu terminal no caminho do projeto raiz e utilize mvn clean install ou ./gradlew clean</p>
</li>
<li class="has-line-data" data-line-start="160" data-line-end="163">
<p class="has-line-data" data-line-start="160" data-line-end="162">Estude o mapeamento relacional com Heranca, neste link<br>
&lt;a&gt; <a href="https://www.baeldung.com/hibernate-inheritance">https://www.baeldung.com/hibernate-inheritance</a> &lt;/a&gt;</p>
</li>
<li class="has-line-data" data-line-start="163" data-line-end="166">
<p class="has-line-data" data-line-start="163" data-line-end="165">Você deve aprender a como criar as tabelas Dog, Bird, Cat, Shark, etc. Isto deve ser feito automaticamente<br>
neste primeiro momento. Quem fará isto é o framework de ORM Hibernate.</p>
</li>
</ol>
<ul>
<li class="has-line-data" data-line-start="166" data-line-end="168">Artigo retirado da internet</li>
</ul>
<p class="has-line-data" data-line-start="168" data-line-end="172">O ORM é uma técnica que permite mapear objetos de uma aplicação para tabelas de um banco de dados relacional, eliminando a necessidade de escrever código SQL manualmente.<br>
O &lt;&gt;Hibernate&lt;/&gt; é um dos frameworks de ORM mais populares para Java e é amplamente utilizado em aplicações empresariais.<br>
Ele fornece uma interface simples para realizar operações de CRUD (criação, leitura, atualização e exclusão) em um banco de dados,<br>
além de suportar recursos avançados, como transações, cache de segundo nível, lazy loading, herança de classes e muito mais.</p>
<ol start="15">
<li class="has-line-data" data-line-start="173" data-line-end="175">
<p class="has-line-data" data-line-start="173" data-line-end="174">Após ter conseguido fazer o mapeamento e criar as tabelas, hora de testar a persistência dos dados.</p>
</li>
<li class="has-line-data" data-line-start="175" data-line-end="176">
<p class="has-line-data" data-line-start="175" data-line-end="176">Crie um package interfaces</p>
</li>
</ol>
<ul>
<li class="has-line-data" data-line-start="176" data-line-end="178">Crie seu AnimalRepository, que deve extender de JpaRepository.</li>
</ul>
<ol start="17">
<li class="has-line-data" data-line-start="178" data-line-end="179">Crie um package services</li>
</ol>
<ul>
<li class="has-line-data" data-line-start="179" data-line-end="180">Crie seu AnimalService, onde você deve criar (apenas criar) os métodos de persistência de dados, como:</li>
</ul>
<ol>
<li class="has-line-data" data-line-start="180" data-line-end="181">criar um animal</li>
<li class="has-line-data" data-line-start="181" data-line-end="182">deletar um animal por id</li>
<li class="has-line-data" data-line-start="182" data-line-end="183">atualizar um animal</li>
<li class="has-line-data" data-line-start="183" data-line-end="184">encontrar por id</li>
<li class="has-line-data" data-line-start="184" data-line-end="185">listar todos animais</li>
</ol>
<ol start="18">
<li class="has-line-data" data-line-start="187" data-line-end="188">Dentro do package services, crie outro package servicesimpl</li>
</ol>
<ul>
<li class="has-line-data" data-line-start="188" data-line-end="189">Crie uma classe AnimalServiceImpl que implementa todos os métodos de AnimalService, e implemente a lógica.</li>
</ul>
<ol start="19">
<li class="has-line-data" data-line-start="191" data-line-end="192">Implemente a lógica dos métodos, pesquise, estude.</li>
<li class="has-line-data" data-line-start="192" data-line-end="193">Feito isto, podemos iniciar os testes e as transações de persistência.</li>
</ol>
<ol start="21">
<li class="has-line-data" data-line-start="195" data-line-end="196">Na sua classe Main (principal), implemente a interface CommandLineRunner (pacote org.springframework.boot.CommandLineRunner);</li>
</ol>
<ul>
<li class="has-line-data" data-line-start="196" data-line-end="199">No método gerado (public void run(String… args) throw Exception),<br>
tudo o que for adicionado, deverá ser processado após a aplicação iniciar, sempre que você rodar a aplicacao.</li>
</ul>
<ol start="22">
<li class="has-line-data" data-line-start="199" data-line-end="201">
<p class="has-line-data" data-line-start="199" data-line-end="200">Faça um @Autowired AnimalServiceImpl animalServiceImpl logo após o inicio da classe Main (pesquise o porque disto)</p>
</li>
<li class="has-line-data" data-line-start="201" data-line-end="225">
<p class="has-line-data" data-line-start="201" data-line-end="202">Copie e cole as seguintes criacoes de animais no método run</p>
<pre><code>this.animalService.create(new Cat(UUID.fromString(&quot;2b80c9b8-74de-4eb5-a78d-ead18ecf6f52&quot;), &quot;Carlos&quot;, 2500D, &quot;Eduardo&quot;, true));
this.animalService.create(new Bird(UUID.fromString(&quot;27a3996f-cabd-4fb3-823e-f7d542c994b7&quot;), &quot;Zezé&quot;, 500D, BeakColor.BLUE.toString()));
this.animalService.create(new Dog(UUID.fromString(&quot;960bb760-acb9-4ae7-8aac-cdf19188234e&quot;), &quot;Border Collie&quot;, &quot;Enzo&quot;, 28000D));
this.animalService.create(new Lizard(UUID.fromString(&quot;b126de74-a9f9-47a8-8945-40000d47ff6b&quot;), &quot;Iguaninha&quot;, 100D));
this.animalService.create(new Shark(UUID.fromString(&quot;3e0c1044-1cba-4f09-a797-a2b03f733d27&quot;), &quot;Tubarao Branco&quot;, 300000D, Map.of(&quot;Peixe&quot;, 2)));
this.animalService.create(new Cat(UUID.fromString(&quot;5d4b08b1-3bf9-4eac-b9a5-8f06a24c16d1&quot;), &quot;Mimi&quot;, 3000D, &quot;Luiz&quot;, true));
this.animalService.create(new Bird(UUID.fromString(&quot;9c4151b5-7792-4b20-99c3-cedf04894f0b&quot;), &quot;Piu Piu&quot;, 750D, BeakColor.YELLOW.toString()));
this.animalService.create(new Dog(UUID.fromString(&quot;1e0aa2f7-743c-4da8-9b96-29d4b4a8b09d&quot;), &quot;Poodle&quot;, &quot;Nina&quot;, 18000D));
this.animalService.create(new Lizard(UUID.fromString(&quot;be46b829-77f1-4c9e-9c13-cd8e4b960f84&quot;), &quot;Liz&quot;, 50D));
this.animalService.create(new Shark(UUID.fromString(&quot;8e9f4bf4-2d09-4f07-93e7-6629c8d767fb&quot;), &quot;Tubarao Martelo&quot;, 400000D, Map.of(&quot;Lula&quot;, 3)));

this.animalService.create(new Cat(UUID.fromString(&quot;9d068cb4-c444-4a34-aa3b-fd9988b0cf90&quot;), &quot;Mel&quot;, 3500D, &quot;Fernanda&quot;, false));
this.animalService.create(new Bird(UUID.fromString(&quot;eeef6d3b-8c70-44c8-b2db-91d5b3a6c94f&quot;), &quot;Pardal&quot;, 200D, BeakColor.YELLOW.toString()));
this.animalService.create(new Dog(UUID.fromString(&quot;4c19aa7d-e56f-452f-9e99-212e9c1929a2&quot;), &quot;Labrador&quot;, &quot;Max&quot;, 24000D));
this.animalService.create(new Lizard(UUID.fromString(&quot;cc8e07fb-103f-4aef-9d06-32a9b31f5c34&quot;), &quot;Lenny&quot;, 80D));
this.animalService.create(new Shark(UUID.fromString(&quot;c2153e4b-5bf1-45f3-b9f1-82fc1f5113b7&quot;), &quot;Tubarao Tigre&quot;, 350000D, Map.of(&quot;Sardinha&quot;, 5)));

this.animalService.create(new Cat(UUID.fromString(&quot;7548c9b9-9fca-43d2-8d3f-0b91e8d8b3de&quot;), &quot;Gato&quot;, 2800D, &quot;Henrique&quot;, true));
this.animalService.create(new Bird(UUID.fromString(&quot;ea3c5c26-9c51-4f20-b73a-60158ad8e0a7&quot;), &quot;Canario&quot;, 400D, BeakColor.GREEN.toString()));
this.animalService.create(new Dog(UUID.fromString(&quot;354cbb03-8c16-43a2-9de9-36db8e2a0871&quot;), &quot;Vira-Lata&quot;, &quot;Luna&quot;, 22000D));
this.animalService.create(new Lizard(UUID.fromString(&quot;ceea70d3-ea1d-42f8-a5c9-bc4df5f12a62&quot;), &quot;Lila&quot;, 120D));
</code></pre>
</li>
<li class="has-line-data" data-line-start="225" data-line-end="228">
<p class="has-line-data" data-line-start="225" data-line-end="227">Acesse o H2 via localhost:8095/h2, faca seu login conforme foi definido<br>
no arquivo application-test.properties</p>
</li>
<li class="has-line-data" data-line-start="228" data-line-end="230">
<p class="has-line-data" data-line-start="228" data-line-end="229">Brinque com as persistências! :)</p>
</li>
<li class="has-line-data" data-line-start="230" data-line-end="231">
<p class="has-line-data" data-line-start="230" data-line-end="231">Crie novos animais, delete, tente encontrar por ID…</p>
</li>
<li class="has-line-data" data-line-start="231" data-line-end="234">
<p class="has-line-data" data-line-start="231" data-line-end="233">Você pode chamar os métodos do service todos dentro do método run, na classe Principal do projeto<br>
e ir brincando, deletar animais, criar, tentar atualizar e ver tudo isto acontencendo no banco H2.</p>
</li>
<li class="has-line-data" data-line-start="234" data-line-end="236">
<p class="has-line-data" data-line-start="234" data-line-end="235">Voce pode tentar atualizar o banco para o postgres, caso queira se aventurar nos estudos.</p>
</li>
<li class="has-line-data" data-line-start="236" data-line-end="237">
<p class="has-line-data" data-line-start="236" data-line-end="237">Após feito isto, aguarde novas instruções. Bons estudos.</p>
</li>
</ol>