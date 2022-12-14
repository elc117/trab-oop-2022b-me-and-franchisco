# Programação Orientada a Objetos - 1° Trabalho
<sub> Nomes: Francisco Albrecht Ribas e Gleison Antonio Pires da silva </sub>

**Class Metrics: Coletor de métricas para ambientes de ensino baseado nas dificuldades e problemas apresentados pelos discentes**

## Problema identificado:

Indentificaram-se dificulades no ambiente escolar a partir de relatos pessoais coletados amigos, colegas e ex-colegas, onde apresentaram-se pontualidades relacionadas a particularidade de cada aluno. Desse modo, a partir de sintomas de problemas como Asiedade, Hiperatividade e outros, alunos sentem-se desconfortaveis em ambientes comuns de aprendizagem, onde a adaptação torna-se complexa e "dolorida". 

## Proposta de Solução: 

Para tanto, desenvolveu-se um sistema para coletar/ouvir problemas identificados por alunos em sala de aula, o mesmo gera uma "pontuação" para identificar os alunos que mais apresentam dificuldades para adaptar-se ao ambiente escolar. Dessa forma, auxilia-se a atuação docente na escolha e material didático e metodologias que podem ser propostas em sala de aula, visando proporcionar um ambiente acolhedor e seguro para todos os discentes.

## Desenvolvimento:

### Frameworks e linguagem utilizada:

 - Java
    - JavaFX
#### Java: Utilizamos java para construir o corpo do nosso projeto, por exemplo, construção de classes, objetos e contrutores.

#### JavaFX: JavaFX foi utilizado para simplificar a construção do frontend da nossa aplicação, visto que não possuiamos experiencia com a programação de aplicações com interfaces interativas.

## Do Software:
#### Tela inicial: Solicitamos ao usuário informações básicas para seguirmos com o processo: Nome, Turma e Matrícula

<img src="https://user-images.githubusercontent.com/74078237/201671711-f055b448-c136-40bb-8060-04452b97395c.png" width="400" height="300">

Ao clicar em **Upload info**, acionamos o identificador no FXML chamado OnAction, que ativa a seguinte função:

<img src="https://user-images.githubusercontent.com/74078237/201674257-de7572fb-3da6-4c9e-a28b-6ac5012d71ab.png" width="768" height="350" >

O campo matrícula está configurado para aceitar apenas valores númericos, caso o usuário não insira corretamente o solicitado, surge uma janela de Alerta, informando que apenas números são aceitos.

![image](https://user-images.githubusercontent.com/74078237/201673743-c76eb0cd-4933-4e36-98ac-d14f178c854c.png)

Caso o usuário mantenha os campos em branco, a seguinte janela de Alerta é exibida:

<img src="https://user-images.githubusercontent.com/74078237/201674439-8713f22f-1356-4626-8ae6-4018254e15c7.png" width="300" height="200">

Em caso de sucesso, informamos o usuário que as informações foram cadastradas e exibimos os itens inseridos em uma janela de alerta:

<img src="https://user-images.githubusercontent.com/74078237/201674632-028daf51-d2fa-41d1-a390-919ad77cf69b.png" width="300" height="200">


