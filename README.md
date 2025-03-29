# Calculadora IMC com Feedback Positivo

## 📌 Descrição Geral
Este projeto consiste em um aplicativo Android desenvolvido em Java para calcular o Índice de Massa Corporal (IMC) e exibir um feedback positivo personalizado para cada categoria de IMC. O objetivo é incentivar hábitos saudáveis e boas práticas no uso de aplicativos móveis, utilizando múltiplas Activities, manipulação de imagens e entrada/saída de dados.

## 👨‍🎓 Informações do Aluno
- **Nome:** Gustavo Bernardi Rodrigues
- **Curso:** Ciência da Computação / 3º Semestre
- **Disciplina:** Programação de Dispositivos Móveis
- **Professor:** Vinicius Heltai

## 🛠 Tecnologias Utilizadas
- **Linguagem:** Java
- **Ambiente de Desenvolvimento:** Android Studio
- **Build System:** Gradle (Groovy)
- **Interface:** Layouts XML
- **Banco de Dados:** Não aplicável

## 🎨 Identidade Visual
A interface do usuário segue a paleta de cores definida no enunciado:
- **Verde Escuro:** `#006341` (Cabeçalhos e destaques)
- **Verde Claro:** `#00A859` (Botões e links)
- **Cinza Escuro:** `#4D4D4D` (Textos secundários)
- **Cinza Claro:** `#B3B3B3` (Bordas e divisores)
- **Branco:** `#FFFFFF` (Fundo principal)

## 🚀 Funcionalidades
1. **Tela Principal (MainActivity)**
   - Exibe o logo do aplicativo
   - Botão para acessar a Calculadora IMC
   
2. **Tela de Cálculo de IMC (CalculoIMCActivity)**
   - Campo para entrada de peso (kg)
   - Campo para entrada de altura (m)
   - Botões: "Calcular IMC", "Limpar" e "Fechar"

3. **Telas de Feedback** (Uma para cada categoria de IMC)
   - Exibição do IMC calculado, classificação e mensagem motivacional
   - Imagem correspondente à classificação
   - Botão "Fechar" para retornar à tela com os valores anteriores
   - Botão "Voltar" para retornar à tela com os valores vazios


4. **Extras Implementados** *(caso tenha implementado algo além do enunciado)*
   - Ícone ao iniciar o aplicativo

## 🔢 Cálculo do IMC
A fórmula utilizada para calcular o IMC é:
```java
IMC = peso / (altura * altura);
```
### **Classificação do IMC:**
| Faixa de IMC | Categoria |
|-------------|-----------|
| IMC < 18.5 | Abaixo do peso |
| 18.5 ≤ IMC < 25 | Peso normal |
| 25 ≤ IMC < 30 | Sobrepeso |
| 30 ≤ IMC < 35 | Obesidade grau 1 |
| 35 ≤ IMC < 40 | Obesidade grau 2 |
| IMC ≥ 40 | Obesidade grau 3 |

## 🏆 Desafios e Decisões no Desenvolvimento
- **Passagem de dados entre Activities:**
  - Utilização de `Intent` e `Bundle` para enviar peso, altura e IMC entre as telas.
- **Tratamento de entradas inválidas:**
  - Implementação de validações para evitar erros ao inserir dados incorretos.
- **Interface amigável e responsiva:**
  - Uso de `ConstraintLayout` para melhor adaptação a diferentes tamanhos de tela.

## 📂 Estrutura do Projeto
```
📦 CalculadoraIMC
 ┣ 📂 app
 ┃ ┣ 📂 src/main/java/br/com/gustavobernardi/calculadoraimc
 ┃ ┃ ┣ 📂 activities
 ┃ ┃ ┃ ┣ 📜 AbaixoDoPesoActivity.java
 ┃ ┃ ┃ ┣ 📜 CalculoIMCActivity.java
 ┃ ┃ ┃ ┣ 📜 MainActivity.java
 ┃ ┃ ┃ ┣ 📜 Obesidade1Activity.java
 ┃ ┃ ┃ ┣ 📜 Obesidade2Activity.java
 ┃ ┃ ┃ ┣ 📜 Obesidade3Activity.java
 ┃ ┃ ┃ ┣ 📜 PesoNormalActivity.java
 ┃ ┃ ┃ ┗ 📜 SobrepesoActivity.java
 ┃ ┃ ┣ 📜 Constants.java
 ┃ ┃ ┗ 📜 IMCUtil.java
 ┃ ┣ 📂 res
 ┃ ┃ ┣ 📂 drawable
 ┃ ┃ ┣ 📂 layout
 ┃ ┃ ┣ 📂 mipmap-anydpi-v26
 ┃ ┃ ┣ 📂 mipmap-hdpi
 ┃ ┃ ┣ 📂 mipmap-mdpi
 ┃ ┃ ┣ 📂 mipmap-xhdpi
 ┃ ┃ ┣ 📂 mipmap-xxhdpi
 ┃ ┃ ┣ 📂 mipmap-xxxhdpi
 ┃ ┃ ┣ 📂 values
 ┃ ┃ ┣ 📂 values-night
 ┃ ┃ ┗ 📂 xml
 ┃ ┣ 📜 AndroidManifest.xml
 ┃ ┣ 📜 ic_launcher-playstore.png
 ┣ 📜 README.md
 ┣ 📜 build.gradle
 ┗ 📜 settings.gradle
```

## 📆 Como Executar o Projeto
1. **Clone o repositório:**
   ```sh
   git clone https://github.com/gbernardii/calculadora-imc.git
   ```
2. **Abra o projeto no Android Studio**
3. **Compile e execute no emulador ou dispositivo físico**

## 👄 Download do APK
[🔗 Baixar APK](https://github.com/gbernardii/calculadora-imc/releases) *(substituir pelo link correto caso disponível)*

## 📌 Entrega
- [x] Código-fonte no GitHub
- [x] Arquivo APK compilado
- [x] Arquivo .zip contendo o projeto
- [x] `README.md` detalhado

## 🐝 Licença
Este projeto foi desenvolvido para fins acadêmicos na disciplina de **Programação de Dispositivos Móveis**.