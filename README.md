# 🤖 Totem Interativo - Robótica em Marte
<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/devAndreotti/APS-03?color=FFF&labelColor=764f2e&style=flat-square">
  <img alt="GitHub repo size" src="https://img.shields.io/github/repo-size/devAndreotti/APS-03?color=FFF&labelColor=764f2e&style=flat-square">
  <img alt="GitHub License" src="https://img.shields.io/github/license/devAndreotti/APS-03?color=FFF&labelColor=764f2e&style=flat-square">
</p>

<div align="center">
  <img src="./src/img/project/project-03.png" alt="Diagrama do Sistema" width="700">
</div>

## 📋 Sobre o Projeto
Totem digital para **pesquisa de satisfação** em uma exposição sobre **exploração robótica em Marte**. Desenvolvido em **Java** com interface **Swing**, o sistema coleta dados dos visitantes e gera insights úteis para o museu.

### 🌟 Destaques
| Funcionalidade               | Descrição                                                                 |
|-----------------------------|---------------------------------------------------------------------------|
| 🎛️ Interface Intuitiva     | Telas sequenciais e amigáveis para conduzir o visitante                   |
| 📊 Cálculo de Métricas      | Gera estatísticas com base nas respostas coletadas                        |
| 🧠 Validação Inteligente    | Garante que todas as informações inseridas sejam válidas                  |
| 🧱 Arquitetura em Camadas   | Organização em pacotes: `modelo`, `apresentacao`, `aps`                   |

## 🛠️ Tecnologias Utilizadas
- [Java](https://www.oracle.com/br/java/) – Lógica e estrutura
- [Java Swing](https://docs.oracle.com/javase/tutorial/uiswing/) – Interface gráfica
- [NetBeans](https://netbeans.apache.org/) – IDE de desenvolvimento

## 📂 Estrutura do Projeto
```bash
totem-robotica-marte/
├── dist/                 → Arquivo compilado (APS.jar)
├── nbproject/            → Configuração do NetBeans
├── src/
│   ├── aps/              → Classe principal (aps.java)
│   ├── apresentacao/     → Telas Swing (frmInicial, frmNome, etc.)
│   ├── modelo/           → Regras de negócio e validação
│   └── img/              → Imagens da interface
└── README.md
```

## 🚀 Como Usar
1. Instale o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)  
2. Clone este repositório:
   ```bash
   git clone https://github.com/seuUsuario/totem-robotica-marte.git
   ```
3. Abra no **NetBeans**
4. Compile e execute a classe `Aps.java`  
   ou rode o `.jar` na pasta `dist`

## 🧩 Pacotes e Classes Principais
| Pacote        | Responsabilidade                                              |
|---------------|---------------------------------------------------------------|
| `modelo`      | Controle da pesquisa, validações e cálculo de satisfação      |
| `apresentacao`| Telas de interação com o usuário (Java Swing)                 |
| `aps`         | Entrada principal da aplicação (`aps.java`)                   |

## 💪 Como Contribuir
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou fazer um fork do repositório e enviar pull requests.
1. Faça um fork  
2. Crie uma branch: `git checkout -b feature/sua-feature`  
3. Commit: `git commit -m "Minha contribuição"`  
4. Push: `git push origin feature/sua-feature`  
5. Abra um Pull Request 🚀

<br>

---
<p align="center"> Desenvolvido por <a href="https://github.com/devAndreotti">Ricardo Andreotti Gonçalves</a> </p>

---
